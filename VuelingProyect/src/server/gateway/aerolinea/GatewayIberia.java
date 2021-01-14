package server.gateway.aerolinea;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import datos.VueloIberia;
import datos.VueloIberiaDTO;
import es.deusto.ingenieria.sd.rmi.server.IServerIberiaManager;
import server.data.dto.VueloDTO;

import server.remote.RMIServiceLocator;


public class GatewayIberia implements IAirlineGateway {

	private RMIServiceLocator rsl;
	private IServerIberiaManager IberiaService; 
	private ArrayList<VueloDTO> res;

	public GatewayIberia(String[] args) {
		super();
		this.rsl = RMIServiceLocator.getInstance();
		this.IberiaService = rsl.getIberiaService();
	}

	public IServerIberiaManager getIberiaService() {
		return IberiaService;
	}


	public List<VueloDTO> getVuelos(String o, String d) throws RemoteException {
		System.out.println(" *	GatewayIberia - Invocado metodo getVuelos.");
		List<VueloIberiaDTO> vuelosIberia = this.IberiaService.getVuelos(o, d);
		return objetosIberiaToDTO(vuelosIberia);
	}

	private List<VueloDTO> objetosIberiaToDTO(List<VueloIberiaDTO> data) {
		res = new ArrayList<VueloDTO>();
		VueloDTO v;
		VueloIberiaDTO vi;
		for (int i = 0; i < data.size(); i++) {
			vi = data.get(i);
			v = new VueloDTO();
			
			v.setOrigen(vi.getOrigen());
			v.setDestino(vi.getDestino());
			v.setFecha(vi.getFecha());
			v.setIdAerolinea("IBERIA");
			v.setHoraLlegada(vi.gethLlegada());
			v.setHoraSalida(vi.gethSalida());
			v.setPlazasLibres(vi.getAsientosRestantes());
			v.setPrecio(vi.getPrecio());
			
			v.setPrecio(vi.getPrecio());
		
			res.add(v);
		}
		System.out.println(" *	GatewayIberia - Devolviendo: " + data.size() + " vuelos");
		return res;

	}

	@Override
	public VueloIberiaDTO realizarReserva(VueloIberia v) throws RemoteException {
		// TODO Auto-generated method stub
		return IberiaService.reservarVuelo(v);
	}

	


	public ArrayList<VueloDTO> getVuelos2(String o, String d) throws RemoteException {
		System.out.println(" *	GatewayIberia - Invocado metodo getVuelos2.");
		List<VueloIberiaDTO> vuelosIberia = this.IberiaService.getVuelos(o, d);
		return (ArrayList<VueloDTO>) objetosIberiaToDTO(vuelosIberia);
	}

	public void decAsientos(int i, String id) {
		try {
			this.IberiaService.decAsientos(i, id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
