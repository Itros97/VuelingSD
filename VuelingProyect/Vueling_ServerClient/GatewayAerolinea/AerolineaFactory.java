package GatewayAerolinea;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import Remote.RemoteFacade;

public class AerolineaFactory {

	private IAerolineaGateway gatewayLufthansa;
	private IAerolineaGateway gatewayIberia;

	private static AerolineaFactory instance;
	private List<IAerolineaGateway> listaGatewaysAerolineas = new ArrayList<IAerolineaGateway>();

	public static AerolineaFactory getInstance() throws RemoteException {
		if (instance == null) {
			
			
			System.out.println("Creando instancia AirlineGatewayFactory...");
			
			instance = new AerolineaFactory();
		}
		return instance;
	}

	private AerolineaFactory() throws RemoteException {
		String[] args = RemoteFacade.getInstance().getArgs();
		crearGatewaysAerolinea(args);
	}

	public List<IAerolineaGateway> crearGatewaysAerolinea(String[] args) {
		try {
			this.gatewayLufthansa = new GatewayLufthansa();
			this.gatewayIberia = new GatewayIberia(args);
			
			
			this.listaGatewaysAerolineas.add(this.gatewayLufthansa);
			
			this.listaGatewaysAerolineas.add(this.gatewayIberia);

			return listaGatewaysAerolineas;

		} catch (Exception e) {
			
			System.out.println(e);
			return null;
		}
	}

	public List<IAerolineaGateway> getListaGatewaysAerolineas() {
		return this.listaGatewaysAerolineas;
	}

	public void setListaGatewaysAerolineas(List<IAerolineaGateway> listaGatewaysAerolineas) {
		this.listaGatewaysAerolineas = listaGatewaysAerolineas;
	}

	public IAerolineaGateway getGatewayLufthansa() {
		return this.gatewayLufthansa;
	}

	public IAerolineaGateway getGatewayIberia() {
		return this.gatewayIberia;
	}
}