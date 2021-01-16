package DTO;

import java.util.ArrayList;
import java.util.List;

import Data.Vuelo;



public class VueloAssembler {

	private static VueloAssembler instance;
	
	private VueloAssembler() {}
	
	public static VueloAssembler getInstance() {
		if(instance == null) {
			instance = new VueloAssembler();
		}
		return instance;
	}
	
	public VueloDTO entityToDTO(Vuelo vuelo) {
		VueloDTO dto = new VueloDTO();
		
		try {
			
			dto.setIdVuelo(vuelo.getidVuelo());
			dto.setPlazasLibres(vuelo.getplazasLibres());
			dto.setPrecioVuelo(vuelo.getprecioVuelo());
			dto.setFechaSalida(vuelo.getfechaLlegada());
			dto.setFechaLlegada(vuelo.getfechaLlegada());
			dto.setReservas(vuelo.getReservas());
			dto.setAeropuertoSalida(vuelo.getaeropuertoSalida());
			dto.setAeropuertoLlegada(vuelo.getAeropuertoLlegada());
		}catch(Exception e) {
			System.out.println(e);
		}
		return dto;
	}
	
	public List<VueloDTO> entityToDTO(List<Vuelo> lv){
		List<VueloDTO> dtos = new ArrayList<>();
		
		for(Vuelo v : lv) {
			dtos.add(this.entityToDTO(v));
		}
		
		return dtos;
	}
}
