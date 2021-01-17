package GatewayAerolinea;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import RMIData.VueloIberia;
import RMIData.VueloIberiaDTO;
import RMIServer.IServerIberiaManager;
import DTO.VueloDTO;
import server.remote.RMIServiceLocator;

public class GatewayIberia implements IAerolineaGateway{
	
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
			
			v.setAeropuertoSalida(vi.getAeropuertoSalida());
			v.setAeropuertoLlegada(vi.getAeropuertoLlegada());
			v.setFechaSalida(vi.getfechaSalida());
			v.setFechaLlegada(vi.getfechaLlegada());
			v.setPlazasLibres(vi.getplazasLibres());
			v.setIdVuelo(vi.getidVueloIberia());
			v.setReservas(vi.getReservas());
			v.setPrecioVuelo(vi.getprecioVueloIberia());			

		
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

	@Override
	public void decAsientos(int i, int id) {
		try {
			this.IberiaService.decAsientos(i, id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	

	
}
