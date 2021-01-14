package server.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import server.data.dto.ClienteDTO;

import server.data.dto.VueloDTO;


public interface IRemoteFacade extends Remote {	
	ClienteDTO login(String email, String password) throws RemoteException;
	ArrayList<VueloDTO> getVuelos2(String origen, String destino) throws RemoteException;
	String realizarReserva2(String email, String password, double importe) throws RemoteException;
	void decAsientos(int i,String id) throws RemoteException;
	
}
