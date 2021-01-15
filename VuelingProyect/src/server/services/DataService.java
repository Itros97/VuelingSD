package server.services;


import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import server.data.dto.VueloDTO;
import server.gateway.aerolinea.AirlineFactory;
import server.gateway.aerolinea.IAirlineGateway;

public class DataService {
	
	private static DataService instance;
	@SuppressWarnings("unused")
	private List<IAirlineGateway> airlineGatewayList;
	
	private DataService() { 
		try {
			airlineGatewayList = AirlineFactory.getInstance().getListaGatewaysAerolineas();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public static DataService getInstance() {
		if (instance == null) {
			instance = new DataService();
		}
		return instance;
	}
	
	
	
	
	public void decAsientos(int i,String id) {
		try {
			AirlineFactory.getInstance().getGatewayIberia().decAsientos(i, id);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<VueloDTO> getVuelos2(String origen, String destino) {
		
		ArrayList<VueloDTO> vuelos = new ArrayList<VueloDTO>();
		try {
			vuelos = AirlineFactory.getInstance().getGatewayIberia().getVuelos2(origen, destino);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		
		return vuelos;
	}
}
