package PayPal;


import java.rmi.RemoteException;

import DTO.PagoDTO;
import RMIServer_Pago.IServerPayPalManager;
import RMIData_Pago.RMIPagoDTO;
import server.remote.RMIServiceLocator;


public class GatewayPayPal implements IGatewayPayPal{
	
	private RMIServiceLocator rsl;
	private IServerPayPalManager authService;
	
	private static GatewayPayPal instance;
	
	public GatewayPayPal() throws RemoteException {
		super();
		System.out.println(" *	GatewayPaypal - creando instancia.");
		rsl = RMIServiceLocator.getInstance();
	}
	
	public static GatewayPayPal getInstance() throws RemoteException {
		if (instance == null) {			
			instance = new GatewayPayPal();
		}
		
		return instance;
	}
	
	public IServerPayPalManager getPaypalService() {
		authService = rsl.getPaypalService();
		return authService;
	}

	//arreglar!!
	public RMIPagoDTO realizarPago(String destinatario, String remitente, String password, double importe){
		System.out.println(" *	GatewayPaypal - Metodo realizarPago.");
		
		RMIPagoDTO p = null;
		
		try {
			 p = getPaypalService().pagar(destinatario, remitente, password, importe);
		} catch (Exception e) {
			System.out.println(" *	GatewayPaypal - Error: "+e);
		}
		
		return p;

	}

	public void registrarUsuario() {
		
	}

}