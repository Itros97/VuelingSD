package RMIServer_Pago;

import java.rmi.Remote;
import java.rmi.RemoteException;

import RMIData_Pago.PagoDTO;
import RMIData_Pago.UserPayPal;

public interface IServerPayPalManager extends Remote {
	PagoDTO pagar(String destinatario, String remitente, String password, double importe) throws RemoteException;
}