package RMIData;

import java.util.ArrayList;

import RMIData.VueloIberia;
import RMIData.VueloIberiaAssembler;
import RMIData.VueloIberiaDTO;

public class VueloIberiaAssembler {

	
private static VueloIberiaAssembler instance; //SINGLETON
	
	private VueloIberiaAssembler() {
		
	}

	public static VueloIberiaAssembler getInstance() {
		
		if (instance == null) {
			instance = new VueloIberiaAssembler();
		}
		return instance;
	}
	
	public VueloIberiaDTO toDTO(VueloIberia v) {
		
		VueloIberiaDTO vDTO = new VueloIberiaDTO();
		vDTO.setidVueloIberia(v.getidVueloIberia());
		vDTO.setplazasLibres(v.getplazasLibres());
		vDTO.setprecioVueloIberia(v.getprecioVueloIberia());
		vDTO.setfechaSalida(v.getfechaSalida());
		vDTO.setfechaLlegada(v.getfechaLlegada());
		vDTO.setReservas(v.getReservas());
		vDTO.setAeropuertoSalida(v.getaeropuertoSalida());
		vDTO.setAeropuertoLlegada(v.getAeropuertoLlegada());
		
		return vDTO;
		
	}
	
	public ArrayList<VueloIberiaDTO> vuelosToDTO(ArrayList<VueloIberia> vuelos){
		
		ArrayList<VueloIberiaDTO> vuelosDTO = new ArrayList<VueloIberiaDTO>();
		
		for (VueloIberia v : vuelos) {
			vuelosDTO.add(this.toDTO(v));
		}
		return vuelosDTO;
	}
}