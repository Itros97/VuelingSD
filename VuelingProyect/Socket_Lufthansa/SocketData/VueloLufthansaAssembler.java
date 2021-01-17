package SocketData;

import java.util.ArrayList;

import SocketData.VueloLufthansa;
import SocketData.VueloLufthansaAssembler;
import SocketData.VueloLufthansaDTO;

public class VueloLufthansaAssembler {

	
private static VueloLufthansaAssembler instance; //SINGLETON
	
	private VueloLufthansaAssembler() {
		
	}

	public static VueloLufthansaAssembler getInstance() {
		
		if (instance == null) {
			instance = new VueloLufthansaAssembler();
		}
		return instance;
	}
	
	public VueloLufthansaDTO toDTO(VueloLufthansa v) {
		
		VueloLufthansaDTO vDTO = new VueloLufthansaDTO();
		vDTO.setidVueloLufthansa(v.getidVueloLufthansa());
		vDTO.setplazasLibres(v.getplazasLibres());
		vDTO.setprecioVueloLufthansa(v.getprecioVueloLufthansa());
		vDTO.setfechaSalida(v.getfechaSalida());
		vDTO.setfechaLlegada(v.getfechaLlegada());
		vDTO.setReservas(v.getReservas());
		vDTO.setAeropuertoSalida(v.getaeropuertoSalida());
		vDTO.setAeropuertoLlegada(v.getAeropuertoLlegada());
		
		return vDTO;
		
	}
	
	public ArrayList<VueloLufthansaDTO> vuelosToDTO(ArrayList<VueloLufthansa> vuelos){
		
		ArrayList<VueloLufthansaDTO> vuelosDTO = new ArrayList<VueloLufthansaDTO>();
		
		for (VueloLufthansa v : vuelos) {
			vuelosDTO.add(this.toDTO(v));
		}
		return vuelosDTO;
	}
}
