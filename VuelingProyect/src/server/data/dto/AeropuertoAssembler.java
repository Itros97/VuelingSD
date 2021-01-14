package server.data.dto;

import java.util.ArrayList;
import java.util.List;

import server.data.Aeropuerto;

public class AeropuertoAssembler {
	
	private static AeropuertoAssembler instance;
	
	private AeropuertoAssembler() {}
	
	public static AeropuertoAssembler getInstance() {
		if(instance == null) {
			instance = new AeropuertoAssembler();
		}
		return instance;
	}
	
	public AeropuertoDTO entityToDTO(Aeropuerto aeropuerto) {
		AeropuertoDTO dto = new AeropuertoDTO();
		
		try {
			dto.setIdAeropuerto(aeropuerto.getIdAeropuerto());
		} catch(Exception e) {
			System.out.println(e);
		}
		return dto;
	}
	
	public List<AeropuertoDTO> entityToDTO(List<Aeropuerto> la){
		List<AeropuertoDTO> dtos = new ArrayList<>();
		
		for(Aeropuerto a : la) {
			dtos.add(this.entityToDTO(a));
		}
		
		return dtos;
	}
}
