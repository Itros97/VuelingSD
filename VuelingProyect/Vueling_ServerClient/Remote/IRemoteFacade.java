package Remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import DTO.UsuarioDTO;
import DTO.VueloDTO;

public interface IRemoteFacade extends Remote {	
	UsuarioDTO login(String email, String password) throws RemoteException;
	ArrayList<VueloDTO> getVuelos2(String origen, String destino) throws RemoteException;
	String realizarReserva2(String destinatario, String remitente,  String password, double importe) throws RemoteException;
	void decAsientos(int i, int id) throws RemoteException;
	
}
