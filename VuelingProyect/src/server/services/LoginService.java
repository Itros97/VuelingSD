package server.services;

import java.rmi.RemoteException;

import datos.UserFacebookDTO;
import server.data.dto.ClienteAssembler;
import server.data.dto.ClienteDTO;
import server.gateway.autorizacion.GatewayAuthFacebook;

public class LoginService {

	private static LoginService instance;
	
	private LoginService() {
	}

	public static LoginService getInstance() {
		if (instance == null) {
			instance = new LoginService();
		}

		return instance;
	}

	public ClienteDTO login(String email, String password) throws RemoteException {
		
		
		UserFacebookDTO user = GatewayAuthFacebook.getInstance().login(email, password);
		
		
		return ClienteAssembler.getInstance().entityToDTO(user);

	}
}