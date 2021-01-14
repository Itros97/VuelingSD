package server.gateway.aerolinea;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import datos.VueloIberia;
import datos.VueloIberiaDTO;
import server.data.dto.VueloDTO;

public interface IAirlineGateway {
	

	public ArrayList<VueloDTO> getVuelos2(String o,String d) throws RemoteException;
	VueloIberiaDTO realizarReserva(VueloIberia v) throws RemoteException;
	void decAsientos(int i, String id) throws RemoteException;
}
