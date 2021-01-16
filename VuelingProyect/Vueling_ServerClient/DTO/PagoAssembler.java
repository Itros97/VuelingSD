package DTO;

import java.util.ArrayList;
import java.util.List;

import Data.Pago;

public class PagoAssembler {

	private static PagoAssembler instance;
	
	private PagoAssembler() {}
	
	public static PagoAssembler getInstance() {
		if(instance == null) {
			instance = new PagoAssembler();
		}
		return instance;
	}
	
	public PagoDTO entityToDTO(Pago p) {
		PagoDTO dto = new PagoDTO();
		
		try {

		} catch(Exception e) {
			System.out.println(e);
		}
		return dto;
	}
	
	public List<PagoDTO> entityToDTO(List<Pago> lp){
		List<PagoDTO> dtos = new ArrayList<>();
		
		for(Pago p : lp) {
			dtos.add(this.entityToDTO(p));
		}
		return dtos;
	}
}
