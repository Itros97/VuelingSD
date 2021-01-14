package server.data.dto;


import java.util.ArrayList;
import java.util.List;

import server.data.Vuelo;

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
			
			dto.setDestino(vuelo.getDestino());
			dto.setFecha(vuelo.getFecha());
			dto.setHoraLlegada(vuelo.getHoraLlegada());
			dto.setHoraSalida(vuelo.getHoraSalida());
			dto.setIdAerolinea(vuelo.getAerolinea().getIdAerolinea());
			dto.setIdVuelo(vuelo.getIdVuelo());
			dto.setOrigen(vuelo.getOrigen());
			dto.setPlazasLibres(vuelo.getPlazasLibres());
			dto.setPrecio(vuelo.getPrecio());
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
