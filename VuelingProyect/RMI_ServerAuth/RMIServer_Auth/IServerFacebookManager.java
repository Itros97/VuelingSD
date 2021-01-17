package RMIServer_Auth;

import java.rmi.RemoteException;

import RMIData_Auth.UsuarioFacebookDTO;

public interface IServerFacebookManager {
	UsuarioFacebookDTO login(String login, String password) throws RemoteException;
}
