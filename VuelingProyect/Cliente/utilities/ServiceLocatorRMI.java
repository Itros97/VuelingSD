package utilities;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import server.remote.IRemoteFacade;

public class ServiceLocatorRMI {

	private IRemoteFacade service;
	private static ServiceLocatorRMI instance;
	
	public ServiceLocatorRMI() {
		
	}
	public static ServiceLocatorRMI getInstance() {
		
		if(instance == null) {
			try {
				instance = new ServiceLocatorRMI();
			} catch (Exception e) {
			}
		}
		return instance;
	}
	
	public IRemoteFacade getService() {
		return service;
	}
	
	public void setService(String ip, String port, String serviceName) {
		String name = "//" + ip + ":" + port + "/" + serviceName;
		try {
			
			service =  (IRemoteFacade) java.rmi.Naming.lookup(name);
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			
			e.printStackTrace();
		}

	}
}
