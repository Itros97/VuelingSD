package utilities;
import java.rmi.RemoteException;

import server.data.dto.ClienteDTO;

public class LogincController {
	
		
		

	public LogincController() {
		
		
	}
	
	public static boolean  login(String email, String password) { //Esto esta bastante scuffed
		
		System.out.println("Probando login...");
		
		ClienteDTO u = null ;
		try {
			u = ServiceLocatorRMI.getInstance().getService().login(email, password);
			
			System.out.println("Login de " + u.getEmail());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (u.getEmail()==null) {
			
			return false;
			
			
		}
		return true;
	}
}
