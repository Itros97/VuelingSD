package utilities;

import java.rmi.RemoteException;


public class PagoController {

	
	public static String pagar(String email,String password, double importe) {
		
		String s = "";
		try {
			s = ServiceLocatorRMI.getInstance().getService().realizarReserva2(email,password,importe);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
}
