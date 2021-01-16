package RMIServer_Pago;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import RMIData_Pago.UserPayPal;
import RMIData_Pago.PagoDTO;

public class ServerPaypalManager extends UnicastRemoteObject implements IServerPayPalManager {

	private static final long serialVersionUID = 1L;
	
	private ArrayList<UserPayPal> users = new ArrayList<UserPayPal>();

	protected ServerPaypalManager() throws RemoteException {
		super();
		UserPayPal u1 = new UserPayPal(1, "e1", "p1", 500);
		UserPayPal u2 = new UserPayPal(2, "e2", "p2", 10);
		UserPayPal u3 = new UserPayPal(3, "e3", "p3", 20);
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
	
	}

	//hay que cambiar algo ya que los atributos son distintos !!
	public PagoDTO pagar(String ud, String ur, String password, double importe) {
		

		UserPayPal userRem = getUser(ur);
		UserPayPal userDes = getUser(ud);
	
		
		if(password.equals(userRem.getPassword()) && userDes!=null && importe<=userRem.getDinero()) {
			
			
			
			userRem.setDinero(userRem.getDinero()- importe);
			userDes.setDinero(userDes.getDinero()+ importe);
			PagoDTO pagoDTO = new PagoDTO();
			pagoDTO.setId("id");
			pagoDTO.setDestinatario(ud);
			pagoDTO.setRemitente(ur);
			pagoDTO.setFecha("fecha");
			pagoDTO.setImporte(importe);
			
			System.out.println("Transacción correcta");
			return pagoDTO;
		}else {
			System.out.println("Error en la transacción");
			return null;
		}
		

	}

	public UserPayPal getUser(String e) {
		for (UserPayPal  u : users) {
			if (u.getEmail().equals(e)){
				return u;
			}
		}
		return null;
	}
	
	
}
