package DTO;

import java.util.ArrayList;
import java.util.List;

import Data.Aerolinea;

public class AerolineaAssembler {
	
private static AerolineaAssembler instance;
	
	private AerolineaAssembler() {}
	
	public static AerolineaAssembler getInstance() {
		if(instance == null) {
			instance = new AerolineaAssembler();
		}
		return instance;
	}
	
	public AerolineaDTO entityToDTO(Aerolinea Aerolinea) {
		AerolineaDTO dto = new AerolineaDTO();
		
		try {
			dto.setIdAerolinea(Aerolinea.getIdAerolinea());
		} catch(Exception e) {
			System.out.println(e);
		}
		return dto;
	}
	
	public List<AerolineaDTO> entityToDTO(List<Aerolinea> la){
		List<AerolineaDTO> dtos = new ArrayList<>();
		
		for(Aerolinea a : la) {
			dtos.add(this.entityToDTO(a));
		}
		
		return dtos;
	}
	
}
