package utilities;

import java.rmi.RemoteException;


public class PagoController {

	
	public static String pagar(String destinatario, String remitente,  String password, double importe) {
		
		String s = "";
		try {
			s = ServiceLocatorRMI.getInstance().getService().realizarReserva2(destinatario,remitente,password,importe);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
}
