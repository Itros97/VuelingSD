package Auth;

import java.rmi.RemoteException;

import RMIData_Auth.UsuarioFacebookDTO;

public interface IGatewayFacebookAuth {

	public UsuarioFacebookDTO login(String email, String password)  throws RemoteException;
}
