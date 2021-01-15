package server.gateway.autorizacion;

import java.rmi.RemoteException;

import datos.UserFacebookDTO;
import es.deusto.ingenieria.sd.rmi.server.IServerFacebookManager;
import server.remote.RMIServiceLocator;


public class GatewayAuthFacebook implements IGatewayAuthFacebook{
	
	private RMIServiceLocator rsl;
	private IServerFacebookManager authService; 
	private static GatewayAuthFacebook instance;
	
	public GatewayAuthFacebook() throws RemoteException {
		
		super();
		System.out.println(" *	GatewayAuthFacebook - creando instancia.");
		rsl = RMIServiceLocator.getInstance();
	}
	
	public static GatewayAuthFacebook getInstance() throws RemoteException {
		
		if (instance == null) {			
			instance = new GatewayAuthFacebook();
		}
		
		return instance;
	}
	
	public IServerFacebookManager getAuthService() {
		authService = rsl.getAuthService();
		return authService;
	}

	
	public UserFacebookDTO login(String email, String password){
		System.out.println(" *	GatewayFacebook - Metodo login.");
		
		UserFacebookDTO user = null;
		
		try {
			user = getAuthService().login(email, password);
		} catch (Exception e) {
			System.out.println(" *	GatewayFacebook - Error: "+e);
		}
		
		return user;
	}


	

}
