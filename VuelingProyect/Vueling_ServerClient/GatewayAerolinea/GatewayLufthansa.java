package GatewayAerolinea;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import RMIData.VueloIberia;
import RMIData.VueloIberiaDTO;
import datos.VueloLufthansaDTO;
import DTO.VueloDTO;
import Remote.RemoteFacade;

public class GatewayLufthansa implements IAerolineaGateway {

	List<VueloLufthansaDTO> resultadoVuelos;
	String[] args;
	VueloDTO vacio = new VueloDTO();
	List<VueloDTO> res;
	
	public GatewayLufthansa() throws RemoteException {
		args = RemoteFacade.getInstance().getArgs();
		vacio.setIdVuelo(0);
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
	public void decAsientos(int i, int id) throws RemoteException {
		try {
			//this.LufthansaService.decAsientos(i, id);
		}catch (Exception e) {
		}
		
	}


	
}
