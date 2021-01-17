package PayPal;

import java.rmi.RemoteException;

import DTO.PagoDTO;
import RMIData_Pago.RMIPagoDTO;

public interface IGatewayPayPal {
	public RMIPagoDTO realizarPago(String destinatario, String remitente, String password, double importe)  throws RemoteException;
}