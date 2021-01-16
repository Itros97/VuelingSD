package GatewayAerolinea;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import DTO.VueloDTO;
import RMIData.VueloIberia;
import RMIData.VueloIberiaDTO;


public interface IAerolineaGateway {
	

	public ArrayList<VueloDTO> getVuelos2(String o,String d) throws RemoteException;
	VueloIberiaDTO realizarReserva(VueloIberia v) throws RemoteException;
	void decAsientos(int i, String id) throws RemoteException;
}
