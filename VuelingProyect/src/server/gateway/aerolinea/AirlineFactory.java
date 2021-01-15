package server.gateway.aerolinea;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import server.remote.RemoteFacade;

public class AirlineFactory {

	private IAirlineGateway gatewayRyanAir;
	private IAirlineGateway gatewayIberia;

	private static AirlineFactory instance;
	private List<IAirlineGateway> listaGatewaysAerolineas = new ArrayList<IAirlineGateway>();

	public static AirlineFactory getInstance() throws RemoteException {
		if (instance == null) {
			
			
			System.out.println("Creando instancia AirlineGatewayFactory...");
			
			instance = new AirlineFactory();
		}
		return instance;
	}

	private AirlineFactory() throws RemoteException {
		String[] args = RemoteFacade.getInstance().getArgs();
		crearGatewaysAerolinea(args);
	}

	public List<IAirlineGateway> crearGatewaysAerolinea(String[] args) {
		try {
			this.gatewayRyanAir = new GatewayRyanAir();
			this.gatewayIberia = new GatewayIberia(args);
			
			
			this.listaGatewaysAerolineas.add(this.gatewayRyanAir);
			
			this.listaGatewaysAerolineas.add(this.gatewayIberia);

			return listaGatewaysAerolineas;

		} catch (Exception e) {
			
			System.out.println(e);
			return null;
		}
	}

	public List<IAirlineGateway> getListaGatewaysAerolineas() {
		return this.listaGatewaysAerolineas;
	}

	public void setListaGatewaysAerolineas(List<IAirlineGateway> listaGatewaysAerolineas) {
		this.listaGatewaysAerolineas = listaGatewaysAerolineas;
	}

	public IAirlineGateway getGatewayRyanAir() {
		return this.gatewayRyanAir;
	}

	public IAirlineGateway getGatewayIberia() {
		return this.gatewayIberia;
	}
}
