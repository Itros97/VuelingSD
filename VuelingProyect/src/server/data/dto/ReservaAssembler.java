package server.data.dto;


import java.util.ArrayList;
import java.util.List;

import server.data.Reserva;

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
			dto.setIdReserva(reserva.getIdReserva());
			dto.setNumPlazas(reserva.getNumPlazas());
			dto.setPago(PagoAssembler.getInstance().entityToDTO(reserva.getPago()));
			dto.setVuelo(VueloAssembler.getInstance().entityToDTO(reserva.getVuelo()));
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
