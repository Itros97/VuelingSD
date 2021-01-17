package RMIServer_Pago;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import RMIData_Pago.UserPayPal;
import RMIData_Pago.RMIPagoDTO;

public class ServerPayPalManager extends UnicastRemoteObject implements IServerPayPalManager {

	private static final long serialVersionUID = 1L;
	
	private ArrayList<UserPayPal> users = new ArrayList<UserPayPal>();

	protected ServerPayPalManager() throws RemoteException {
		super();
		UserPayPal u1 = new UserPayPal("e1", "p1", 500);
		UserPayPal u2 = new UserPayPal("e2", "p2", 10);
		UserPayPal u3 = new UserPayPal("e3", "p3", 20);
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
	
	}

	public RMIPagoDTO pagar(String pagoDestino, String pagoOrigen, String password, double importe) {
		

		UserPayPal remitente = getUser(pagoOrigen);
		UserPayPal destinatario = getUser(pagoDestino);
	
		
		if(password.equals(remitente.getPassword()) && destinatario!=null && importe<=remitente.getDinero()) {
			
			
			
			remitente.setDinero(remitente.getDinero()- importe);
			destinatario.setDinero(destinatario.getDinero()+ importe);
			RMIPagoDTO pagoDTO = new RMIPagoDTO();
			pagoDTO.setDestinatario(pagoDestino);
			pagoDTO.setRemitente(pagoOrigen);
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
