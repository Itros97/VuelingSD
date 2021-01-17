package Server;

import java.io.IOException;
import java.rmi.Naming;
import java.util.Arrays;

import Remote.IRemoteFacade;
import Remote.RemoteFacade;

public class EasyBooking {
	public static void main(String[] args) throws SecurityException, IOException {	
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		System.out.println(Arrays.toString(args));
		String name = "//" + args[0] + ":" + args[1] + "/" + args[2];		
		
		try {
			IRemoteFacade EBServer = new RemoteFacade(args);
			Naming.rebind(name, EBServer);
			
			System.out.println(" * EasyBooking server '" + name + "'");
		} catch (Exception ex) {
			System.err.println(" # EasyBooking Server Exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
}
