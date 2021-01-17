package Services;

import java.rmi.RemoteException;

import DTO.PagoDTO;
import RMIData_Pago.RMIPagoDTO;
import PayPal.GatewayPayPal;


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

	public RMIPagoDTO realizarPago(String destinatario, String remitente,  String password, double importe) throws RemoteException {
		System.out.println("	 * PaymentService: Realizando pago con email: " + destinatario);
		RMIPagoDTO pago = GatewayPayPal.getInstance().realizarPago(destinatario, remitente, password, importe);
		System.out.println("	 * PaymentService: Devolviendo: " + pago.toString());
		System.out.println(pago.getDestinatario()+"<--"+pago.getRemitente()+" || "+pago.getImporte()+"euros/dolares.");
		return pago;
	}
}