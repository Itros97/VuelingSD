package server.gateway.aerolinea;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import datos.VueloIberia;
import datos.VueloIberiaDTO;
import datos.VueloRyanairDTO;
import server.data.dto.VueloDTO;

import server.remote.RemoteFacade;

public class GatewayRyanAir implements IAirlineGateway {
	
	List<VueloRyanairDTO> resultadoVuelos;
	String[] args;
	VueloDTO vacio = new VueloDTO();
	List<VueloDTO> res;
	
	public GatewayRyanAir() throws RemoteException {
		args = RemoteFacade.getInstance().getArgs();
		vacio.setIdVuelo("NULL");
	}


	@Override
	public VueloIberiaDTO realizarReserva(VueloIberia v) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<VueloDTO> getVuelos2(String o, String d) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void decAsientos(int i, String id) throws RemoteException {
		try {
			//this.RyanairService.decAsientos(i, id);
		}catch (Exception e) {
		}
		
	}

}
