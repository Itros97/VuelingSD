package Services;

import java.rmi.RemoteException;

import RMIData_Auth.UsuarioFacebookDTO;
import DTO.UsuarioAssembler;
import DTO.UsuarioDTO;
import Auth.GatewayFacebookAuth;

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

	public UsuarioDTO login(String email, String password) throws RemoteException {
		
		
		UsuarioFacebookDTO user = GatewayFacebookAuth.getInstance().login(email, password);
		
		
		return UsuarioAssembler.getInstance().entityToDTO(user);

	}
}