package RMIServer_Pago;

import java.rmi.Remote;
import java.rmi.RemoteException;

import DTO.PagoDTO;
import RMIData_Pago.RMIPagoDTO;
import RMIData_Pago.UserPayPal;

public interface IServerPayPalManager extends Remote {
	RMIPagoDTO pagar(String destinatario, String remitente, String password, double importe) throws RemoteException;
}