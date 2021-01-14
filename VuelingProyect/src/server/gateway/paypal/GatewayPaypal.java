package server.gateway.paypal;

import java.rmi.RemoteException;

import datos.PagoDTO;
import es.deusto.ingenieria.sd.rmi.server.IServerPayPalManager;

import server.remote.RMIServiceLocator;


public class GatewayPaypal implements IGatewayPaypal{
	
	private RMIServiceLocator rsl;
	private IServerPayPalManager authService;
	
	private static GatewayPaypal instance;
	
	public GatewayPaypal() throws RemoteException {
		super();
		System.out.println(" *	GatewayPaypal - creando instancia.");
		rsl = RMIServiceLocator.getInstance();
	}
	
	public static GatewayPaypal getInstance() throws RemoteException {
		if (instance == null) {			
			instance = new GatewayPaypal();
		}
		
		return instance;
	}
	
	public IServerPayPalManager getPaypalService() {
		authService = rsl.getPaypalService();
		return authService;
	}

	
	public PagoDTO realizarPago(String email, String password, double importe){
		System.out.println(" *	GatewayPaypal - Metodo realizarPago.");
		
		PagoDTO p = null;
		
		try {
			 p = getPaypalService().pagar("e2", email, password, importe);
		} catch (Exception e) {
			System.out.println(" *	GatewayPaypal - Error: "+e);
		}
		
		return p;

	}

	public void registrarUsuario() {
		
	}

}
