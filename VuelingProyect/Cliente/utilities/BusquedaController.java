package utilities;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;

import DTO.VueloDTO;

public class BusquedaController {
	
	JFrame frame;
	JComponent newContentPane;
	
	public BusquedaController() {
		
	}
	
	public static ArrayList<String> buscar(String o, String d) {
		
		
		String serverIP = "";
		int serverPort = 35600;
		System.out.println("BUSCANDO...");
		ArrayList<VueloDTO> vuelos = new ArrayList<VueloDTO>();
		ArrayList<VueloDTO> vuelosLufthansa = new ArrayList<VueloDTO>();
		
		ArrayList<String> vuelosR = new ArrayList<String>();
		
		try (Socket tcpSocket = new Socket(serverIP, serverPort); //estaria mejor en el gatewayLufthansa
				
		     DataInputStream in = new DataInputStream(tcpSocket.getInputStream());
			 DataOutputStream out = new DataOutputStream(tcpSocket.getOutputStream())){
			
			//Send request (a String) to the server
			out.writeUTF("1"+"-"+o+"-"+d);
			//out.writeUTF(message);
			System.out.println(" - TCPSocketClient: Sent data to '" + tcpSocket.getInetAddress().getHostAddress() + ":" + tcpSocket.getPort() + "' -> '" + "eyey" + "'");
			
			//Read response (a String) from the server
			String data = in.readUTF();
			String[] data2 = data.split("&");
			
			System.out.println(data2[0]);
			for (int i = 1; i <= Integer.parseInt(data2[0]); i++) {
				//vv.listModel.addElement(data2[i]);
				vuelosR.add(data2[i]);
				
			}
			
			//vv.listModel.addElement(data);
			System.out.println(" - TCPSocketClient: Received data from '" + tcpSocket.getInetAddress().getHostAddress() + ":" + tcpSocket.getPort() + "' -> '" + data + "'");
		} catch (UnknownHostException e4) {
			System.err.println("# TCPSocketClient: Socket error: " + e4.getMessage());
		} catch (EOFException e5) {
			System.err.println("# TCPSocketClient: EOF error: " + e5.getMessage());
		} catch (IOException e6) {
			System.err.println("# TCPSocketClient: IO error: " + e6.getMessage());
		}
		
		
		try {
			vuelos = ServiceLocatorRMI.getInstance().getService().getVuelos2(d, o);
		} catch (RemoteException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		
			//vuelosLufthansa = ServiceLocatorRMI.getInstance().getService().get
			
		}
		for(VueloDTO v: vuelos) {
			//vv.listModel.addElement(v.getIdAerolinea()+" "+ v.getOrigen() +" - "+v.getDestino()+" "+v.getFecha()+" "+v.getHoraLlegada()+" - "+v.getHoraSalida()+"#"+v.getPlazasLibres()+"#"+v.getPrecio());
			vuelosR.add(v.getIdVuelo()+" "+ v.getAeropuertoSalida() +" - "+v.getAeropuertoLlegada()+" "+v.getFechaSalida()+" "+v.getFechaLlegada()+" - "+v.getReservas()+"#"+v.getPlazasLibres()+"#"+v.getPrecioVuelo());
		}
		
		return vuelosR;
	
	}

	
}
	

