package server.gateway.autorizacion;

import java.rmi.RemoteException;

import datos.UserFacebookDTO;


public interface IGatewayAuthFacebook {
	public UserFacebookDTO login(String email, String password)  throws RemoteException;
	
}
