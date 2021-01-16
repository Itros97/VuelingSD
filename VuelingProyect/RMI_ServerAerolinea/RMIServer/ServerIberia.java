package RMIServer;

import java.rmi.Naming;
import java.rmi.Remote;

import RMIServer.IServerIberiaManager;
import RMIServer.ServerIberiaManager;

public class ServerIberia {

	
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("usage: java [policy] [codebase] server.Server [host] [port] [server]");
			System.exit(0);
		}
		
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}

		String name = "//" + args[0] + ":" + args[1] + "/" + args[2];

		try {		
			IServerIberiaManager objServer = new ServerIberiaManager();
			Naming.rebind(name, (Remote) objServer);
			System.out.println("* Server '" + name + "' active and waiting...");
		} catch (Exception e) {
			System.err.println("- Exception running the server: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
