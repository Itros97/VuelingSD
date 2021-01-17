package Remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import RMIData_Pago.RMIPagoDTO;
import DTO.UsuarioDTO;
import DTO.VueloDTO;
import Remote.IRemoteFacade;
import Remote.RemoteFacade;
import server.services.DataService;
import server.services.LoginService;
import server.services.PaymentService;

public class RemoteFacade extends UnicastRemoteObject implements IRemoteFacade {
	private static final long serialVersionUID = 1L;
	private static RemoteFacade instance;
	private static String[] args;

	public RemoteFacade(String[] args1) throws RemoteException {
		super();
		args = args1;
		instance = this;
	}

	public static RemoteFacade getInstance() {
		if (instance == null) {
			try {
				instance = new RemoteFacade(args);
			} catch (Exception ex) {
				System.err.println("# Error creating RemoteFacade: " + ex);
			}
		}

		return instance;
	}

	public String[] getArgs() throws RemoteException {
		return args;

	}

	public UsuarioDTO login(String email, String password) throws RemoteException {
		System.out.println(" * RemoteFacade - Invocado metodo login: " + email);
		UsuarioDTO user = LoginService.getInstance().login(email, password);



		return user;
	}

	


	@Override
	public ArrayList<VueloDTO> getVuelos2(String origen, String destino) throws RemoteException {
		
		ArrayList<VueloDTO> vuelos = new ArrayList<VueloDTO>();
		vuelos = DataService.getInstance().getVuelos2(origen,destino);
		return vuelos;
	}
	
	public String realizarReserva2(String email, String password, double importe){
		
		RMIPagoDTO pago = null;
		try {
			pago = PaymentService.getInstance().realizarPago(email, password, importe);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RMIPagoDTO p2 = new RMIPagoDTO();
		
		return pago.getDestinatario()+"<--"+pago.getRemitente()+" || + "+pago.getImporte()+" euro/dolares.";
	}

	@Override
	public void decAsientos(int i, int id) {
		
		DataService.getInstance().decAsientos(i, id);
	}

	
}