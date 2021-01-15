package server.gateway.paypal;

import java.rmi.RemoteException;

import datos.PagoDTO;



public interface IGatewayPaypal {
	public PagoDTO realizarPago(String email, String password, double importe)  throws RemoteException;
}
