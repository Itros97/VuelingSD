package Services;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import DTO.VueloDTO;
import GatewayAerolinea.AerolineaFactory;
import GatewayAerolinea.IAerolineaGateway;

public class ReservaService {
	
	private static ReservaService instance;
	@SuppressWarnings("unused")
	private List<IAerolineaGateway> listaAerolineaGateway;
	
	private ReservaService() { 
		try {
			listaAerolineaGateway = AerolineaFactory.getInstance().getListaGatewaysAerolineas();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public static ReservaService getInstance() {
		if (instance == null) {
			instance = new ReservaService();
		}
		return instance;
	}
	
	
	
	
	public void decAsientos(int i, int id) {
		try {
			AerolineaFactory.getInstance().getGatewayIberia().decAsientos(i, id);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<VueloDTO> getVuelos2(String origen, String destino) {
		
		ArrayList<VueloDTO> vuelos = new ArrayList<VueloDTO>();
		try {
			vuelos = AerolineaFactory.getInstance().getGatewayIberia().getVuelos2(origen, destino);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		
		return vuelos;
	}
}
