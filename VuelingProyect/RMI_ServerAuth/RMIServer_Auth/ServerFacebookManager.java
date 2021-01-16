package RMIServer_Auth;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;

import RMIData_Auth.UsuarioFacebook;
import RMIData_Auth.UsuarioFacebookAssembler;
import RMIData_Auth.UsuarioFacebookDTO;

public class ServerFacebookManager extends UnicastRemoteObject implements IServerFacebookManager {

	private static final long serialVersionUID = 1L;
	
	HashMap<String, String> users = new HashMap<String, String>();
	ArrayList<UsuarioFacebook> ul = new ArrayList<UsuarioFacebook>();
	

	protected ServerFacebookManager() throws RemoteException {
		super();
		
		UsuarioFacebook u1 = new UsuarioFacebook(5, "JokinG", "fsdfsaf", "Jokin", "Gamonal", "joking@gmail.com");
		UsuarioFacebook u2 = new UsuarioFacebook(6, "RamonA", "fdfser", "Ramon", "Andres", "andre@gmail.com");
		UsuarioFacebook u3 = new UsuarioFacebook(7, "Joseba07", "eufsdfu", "Joseba", "Lopez", "lolo@gmail.com");
		UsuarioFacebook u4 = new UsuarioFacebook(8, "Ricc", "thyrjty", "Riccardo", "Gomez", "ricc@gmail.com");
		
		ul.add(u1);
		ul.add(u2);
		ul.add(u3);
		ul.add(u4);
		
	}


	public UsuarioFacebookDTO login(String login, String password) throws RemoteException {
		System.out.println("LOGIN SERVERFACEBOOK");
		System.out.println("email: "+login);
		System.out.println("pass: "+password);
		for (UsuarioFacebook u : ul) {
			System.out.println("u: "+u.getEmail()+u.getPassword());
			if (u.getEmail().equals(login)&&u.getPassword().equals(password)) {
				System.out.println("correct login");
				return UsuarioFacebookAssembler.getInstance().toDTO(u);
			}else {
				System.out.println("Fail if.");
				
			}
		}
		throw new RemoteException("Error login serverFacebook.");
		
		
	}
	
	
}
