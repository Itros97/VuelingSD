package server.remote;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Arrays;

import es.deusto.ingenieria.sd.rmi.server.IServerFacebookManager;
import es.deusto.ingenieria.sd.rmi.server.IServerIberiaManager;
import es.deusto.ingenieria.sd.rmi.server.IServerPayPalManager;


public class RMIServiceLocator {

	private static RMIServiceLocator instance;
	private IServerFacebookManager authService;
	private IServerIberiaManager iberiaService;
	private IServerPayPalManager paypalService;
	
	public RMIServiceLocator() {

	}
	
	public static RMIServiceLocator getInstance() {
		if (instance == null) {
			
			try {
				instance = new RMIServiceLocator();
				String[] args = RemoteFacade.getInstance().getArgs();
				System.out.println("Creada instancia RMIServideLocator: " + Arrays.toString(args));
				instance.setService(args);
				
			} catch (Exception ex) {
				System.err.println("# Error creating RMIServiceLocator: " + ex);
			}
		}

		return instance;
	}

	public void setService(String[] args){
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		
		String nameAuth = "//" + args[0] + ":" + args[1] + "/" + args[3];
		String nameIberia = "//" + args[0] + ":" + args[1] + "/" + args[4];
		String namePaypal = "//" + args[0] + ":" + args[1] + "/" + args[7];
		System.out.println("RMIServiceLocator - Setting Service for: " + nameAuth + " || " + nameIberia+ " || " + namePaypal);
		
		
		
		try {
			this.authService = (IServerFacebookManager) java.rmi.Naming.lookup(nameAuth);
			this.iberiaService = (IServerIberiaManager) java.rmi.Naming.lookup(nameIberia);
			this.paypalService = (IServerPayPalManager) java.rmi.Naming.lookup(namePaypal);
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
	
	public IServerPayPalManager getPaypalService() {
		
		return paypalService;
	}
	
	public IServerFacebookManager getAuthService() {
		
		return authService;
	}
	
	public IServerIberiaManager getIberiaService() {

		return iberiaService;
	}
}

