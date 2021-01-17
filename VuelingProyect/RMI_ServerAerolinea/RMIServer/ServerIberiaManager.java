package RMIServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import java.util.ArrayList;

import Data.Aeropuerto;
import Data.Pago;
import Data.Reserva;
import Data.Usuario;
import Data.Vuelo;
import RMIData.VueloIberia;
import RMIData.VueloIberiaAssembler;
import RMIData.VueloIberiaDTO;




public class ServerIberiaManager extends UnicastRemoteObject implements IServerIberiaManager {

	private static final long serialVersionUID = 1L;
	
	ArrayList<VueloIberia> vuelos = new ArrayList<VueloIberia>();

	protected ServerIberiaManager() throws RemoteException {
		
		super();
		
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
		
		VueloIberia v1 = new VueloIberia(vuelo1.getplazasLibres(), vuelo1.getprecioVuelo(), vuelo1.getfechaSalida(), vuelo1.getfechaLlegada(), vuelo1.getReservas(), vuelo1.getaeropuertoSalida(), vuelo1.getAeropuertoLlegada());
		VueloIberia v2 = new VueloIberia(vuelo2.getplazasLibres(), vuelo2.getprecioVuelo(), vuelo2.getfechaSalida(), vuelo2.getfechaLlegada(), vuelo2.getReservas(), vuelo2.getaeropuertoSalida(), vuelo2.getAeropuertoLlegada());

		
		vuelos.add(v1);
		vuelos.add(v2);
		
	}


	public ArrayList<VueloIberiaDTO> getVuelos(String o, String d){ 
		
		ArrayList<VueloIberiaDTO> vuelosDTO = new ArrayList<VueloIberiaDTO>();
		
		for (VueloIberia v : this.vuelos) {
			if (v.getaeropuertoSalida().getnombreAeropuerto().equals(o) && v.getAeropuertoLlegada().getnombreAeropuerto().equals(d) && v.getplazasLibres()>=0) {
				vuelosDTO.add(VueloIberiaAssembler.getInstance().toDTO(v));
				System.out.println("Server vuelo: "+v.getaeropuertoSalida().getnombreAeropuerto());
			}
		}
		
		return vuelosDTO;
	}


	public VueloIberiaDTO reservarVuelo(VueloIberia v) throws RemoteException {
			
		return VueloIberiaAssembler.getInstance().toDTO(v);
	}

	@Override
	public void decAsientos(int i, int id) throws RemoteException {

		for(VueloIberia v: vuelos) {
			if (v.getidVueloIberia() == id){
				v.setplazasLibres(v.getplazasLibres()-i);
			}
		}
	}	
	
}