package SocketServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;

import Data.Aeropuerto;
import Data.Pago;
import Data.Reserva;
import Data.Usuario;
import Data.Vuelo;
import SocketData.VueloLufthansa;
import SocketData.VueloLufthansaAssembler;
import SocketData.VueloLufthansaDTO;

public class EchoService extends Thread {
	private DataInputStream in;
	private DataOutputStream out;
	private Socket tcpSocket;

	private ArrayList<VueloLufthansa> vuelos = new ArrayList<VueloLufthansa>();

	public EchoService(Socket socket) {
		
		Usuario[] pasajero1 = new Usuario[1];
		Usuario pasajero01 = new Usuario("PabloG", "dgdf", "Pablo", "Garcia", "pablogracia@hotmail.com");
		pasajero1[0] = pasajero01;
		
		Usuario[] pasajero2 = new Usuario[2];
		Usuario pasajero02 = new Usuario("AitorLo", "htyhh", "Aitor", "Lopez", "aitorlo@hotmail.com");
		pasajero2[0] = pasajero01;
		pasajero2[1] = pasajero02;
		
		Pago pago1 = new Pago(55.6);
		Pago pago2= new Pago(110.6);
				
		Reserva[]r1 = new Reserva[1];
		Reserva reserva1 = new Reserva(pasajero1[0].getUsername(), pasajero1[0].getPassword(), pasajero1[0].getNombre(), pasajero1[0].getApellido(), pasajero1[0].getEmail(), 1, pasajero1, pago1); 
		
		r1[0] = reserva1;
		
		Reserva[]r2 = new Reserva[2];
		Reserva reserva2 = new Reserva(pasajero2[0].getUsername(), pasajero2[0].getPassword(), pasajero2[0].getNombre(), pasajero2[0].getApellido(), pasajero2[0].getEmail(), 2, pasajero2, pago2); 
		Reserva reserva3 = new Reserva(pasajero2[1].getUsername(), pasajero2[1].getPassword(), pasajero2[1].getNombre(), pasajero2[1].getApellido(), pasajero2[1].getEmail(), 2, pasajero2, pago2); 

		r2[0] = reserva2;
		r2[1] = reserva3;
		
		Aeropuerto aeropuerto01 = new Aeropuerto("Barajas");
		Aeropuerto aeropuerto02 = new Aeropuerto("Loiu");
				
		Vuelo vuelo1 = new Vuelo(30, 75.5, new Date(16/01/2021), new Date(16/01/2021), r1, aeropuerto01, aeropuerto02);
		Vuelo vuelo2 = new Vuelo(40, 85.5, new Date(17/01/2021), new Date(18/01/2021), r1, aeropuerto02, aeropuerto01);
		
		vuelos.add(new VueloLufthansa(vuelo1.getplazasLibres(), vuelo1.getprecioVuelo(), vuelo1.getfechaSalida(), vuelo1.getfechaLlegada(), vuelo1.getReservas(), vuelo1.getaeropuertoSalida(), vuelo1.getAeropuertoLlegada()));
		vuelos.add(new VueloLufthansa(vuelo2.getplazasLibres(), vuelo2.getprecioVuelo(), vuelo2.getfechaSalida(), vuelo2.getfechaLlegada(), vuelo2.getReservas(), vuelo2.getaeropuertoSalida(), vuelo2.getAeropuertoLlegada()));

		
		
		try {
			this.tcpSocket = socket;
		    this.in = new DataInputStream(socket.getInputStream());
			this.out = new DataOutputStream(socket.getOutputStream());
			this.start();
		} catch (IOException e) {
			System.err.println("# EchoService - TCPConnection IO error:" + e.getMessage());
		}
	}
	
	public ArrayList<VueloLufthansaDTO> getVuelos(String destino, String origen){
		
		ArrayList<VueloLufthansaDTO> vuelosDTO = new ArrayList<VueloLufthansaDTO>();
	
		for (VueloLufthansa v: vuelos) {
			
			if (v.getaeropuertoSalida().getnombreAeropuerto().equals(origen) && v.getAeropuertoLlegada().getnombreAeropuerto().equals(destino)) {
				vuelosDTO.add(VueloLufthansaAssembler.getInstance().toDTO(v));
			}
		}
	
		return vuelosDTO;
		
		
	}

	public String reservar(VueloLufthansaDTO v) {
		
		try {
			System.out.println("Reserva "+ v.getAeropuertoSalida()+" - "+v.getAeropuertoLlegada());
			return "OK";
			
		}catch (Exception e) {
			System.out.println("Error al realizar la reserva");
			return "ERROR";
		}
		
	}
	public void run() {
		//Echo server
		try {
			//Read request from the client
			String op = "";
			String data = this.in.readUTF();			
			System.out.println("   - EchoService - Received data from '" + tcpSocket.getInetAddress().getHostAddress() + ":" + tcpSocket.getPort() + "' -> '" + data + "'");
			String[] agane = data.split("-");
			
			String o = agane[1];
			String d = agane[2];
			if (data.startsWith("1")){
				
				String output = "";
				
				int n= 0;
				ArrayList<VueloLufthansaDTO> vuelos = new ArrayList<VueloLufthansaDTO>();
				vuelos = getVuelos(o, d);
				for(VueloLufthansaDTO v : vuelos) {
					n++;
					//output+=("."+"Lufthansa " +v.getOrigen()+" - "+v.getDestino()+" "+v.getFecha()+" "+v.gethSalida()+" - " +v.gethLlegada()+" "+v.getPrecio()+"euro");
					output+=("&"+"Lufthansa "+ v.getAeropuertoSalida() +" - "+v.getAeropuertoLlegada()+" "+v.getplazasLibres()+" "+v.getfechaSalida()+" - "+v.getfechaLlegada()+ "" +v.getprecioVueloLufthansa());
					
					//this.out.writeUTF("Lufthansa " +v.getOrigen()+" - "+v.getDestino()+" "+v.getFecha()+" "+v.gethSalida()+" - " +v.gethLlegada()+" "+v.getPrecio()+"euro");//mejor toString
				}
				op = Integer.toString(n) + output;
				System.out.println("WRITEUTF INFO: "+op);
				this.out.writeUTF(op);
				//this.out.writeUTF(getVuelos("Bilbao", "Madrid").get(0).getOrigen()+" - "+ getVuelos("Bilbao", "Madrid").get(0).getDestino());
			}
			
			if (data.startsWith("2")) {
				String r = data.split("[.]")[1];
				String in = data.split("[.]")[2];
				int ind = Integer.parseInt(in);
				//this.out.writeUTF(reservar(getVuelos(d, o).get(ind)));
			}
			//Send response to the client
				
			//System.out.println("   - EchoService - Sent data to '" + tcpSocket.getInetAddress().getHostAddress() + ":" + tcpSocket.getPort() + "' -> '" + op + "'");
		} catch (EOFException e) {
			System.err.println("   # EchoService - TCPConnection EOF error" + e.getMessage());
		} catch (IOException e) {
			System.err.println("   # EchoService - TCPConnection IO error:" + e.getMessage());
		} finally {
			try {
				tcpSocket.close();
			} catch (IOException e) {
				System.err.println("   # EchoService - TCPConnection IO error:" + e.getMessage());
			}
		}
	}
}