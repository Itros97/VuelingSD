package RMIServer;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import RMIData.VueloIberia;
import RMIData.VueloIberiaDTO;

public interface IServerIberiaManager extends Remote {
	
	ArrayList<VueloIberiaDTO> getVuelos(String o, String d) throws RemoteException;
	VueloIberiaDTO reservarVuelo(VueloIberia v) throws RemoteException;
	void decAsientos(int i, int id) throws RemoteException;
	
}
