package server.services;

import java.rmi.RemoteException;

import datos.PagoDTO;
import server.gateway.paypal.GatewayPaypal;

public class PaymentService {

	private static PaymentService instance;

	private PaymentService() {
	}

	public static PaymentService getInstance() {
		if (instance == null) {
			instance = new PaymentService();
		}

		return instance;
	}

	public PagoDTO realizarPago(String email, String password, double importe) throws RemoteException {
		System.out.println("	 * PaymentService: Realizando pago con email: " + email);
		PagoDTO pago = GatewayPaypal.getInstance().realizarPago(email, password, importe);
		System.out.println("	 * PaymentService: Devolviendo: " + pago.toString());
		System.out.println(pago.getDestinatario()+"<--"+pago.getRemitente()+" || "+pago.getFecha()+" "+pago.getImporte()+"euros/dolares.");
		return pago;
	}
}