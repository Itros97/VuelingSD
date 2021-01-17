package Auth;

import java.rmi.RemoteException;

import RMIData_Auth.UsuarioFacebookDTO;
import RMIServer_Auth.IServerFacebookManager;
import Remote.RMIServiceLocator;

public class GatewayFacebookAuth implements IGatewayFacebookAuth{
	
	private RMIServiceLocator rsl;
	private IServerFacebookManager authService; 
	private static GatewayFacebookAuth instance;
	
	public GatewayFacebookAuth() throws RemoteException {
		
		super();
		System.out.println(" *	GatewayFacebookAuth - creando instancia.");
		rsl = RMIServiceLocator.getInstance();
	}
	
	public static GatewayFacebookAuth getInstance() throws RemoteException {
		
		if (instance == null) {			
			instance = new GatewayFacebookAuth();
		}
		
		return instance;
	}
	
	public IServerFacebookManager getAuthService() {
		authService = rsl.getAuthService();
		return authService;
	}

	
	public UsuarioFacebookDTO login(String email, String password){
		System.out.println(" *	GatewayFacebook - Metodo login.");
		
		UsuarioFacebookDTO user = null;
		
		try {
			user = getAuthService().login(email, password);
		} catch (Exception e) {
			System.out.println(" *	GatewayFacebook - Error: "+e);
		}
		
		return user;
	}



}
