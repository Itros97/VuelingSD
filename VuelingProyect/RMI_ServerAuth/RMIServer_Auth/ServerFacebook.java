package RMIServer_Auth;

import java.rmi.Naming;

import RMIServer_Auth.IServerFacebookManager;
import RMIServer_Auth.ServerFacebookManager;

public class ServerFacebook {
	
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
			IServerFacebookManager objServer = new ServerFacebookManager();
			Naming.rebind(name, objServer);
			System.out.println("* Server '" + name + "' active and waiting...");
		} catch (Exception e) {
			System.err.println("- Exception running the server: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
