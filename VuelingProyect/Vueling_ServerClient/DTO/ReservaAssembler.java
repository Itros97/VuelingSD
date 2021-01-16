package DTO;

import java.util.ArrayList;
import java.util.List;

import Data.Reserva;



public class ReservaAssembler {

	private static ReservaAssembler instance;
	
	private ReservaAssembler() {}
	
	public static ReservaAssembler getInstance() {
		if(instance == null) {
			instance = new ReservaAssembler();
		}
		return instance;
	}
	
	public ReservaDTO entityToDTO(Reserva reserva) {
		ReservaDTO dto = new ReservaDTO();
		
		try {
			dto.setIdReserva(reserva.getidReserva());
			dto.setNumPlazas(reserva.getnumPlazas());
			dto.setPago(PagoAssembler.getInstance().entityToDTO(reserva.getPrecio()));
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return dto;
	}
	
	public List<ReservaDTO> entityToDTO(List<Reserva> lr){
		List<ReservaDTO> dtos = new ArrayList<>();
		
		for(Reserva r: lr) {
			dtos.add(this.entityToDTO(r));
		}
		
		return dtos;
	}
}

