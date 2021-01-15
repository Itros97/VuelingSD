package server.data.dto;

import java.util.ArrayList;
import java.util.List;

import datos.UserFacebookDTO;
import server.data.Cliente;

public class ClienteAssembler {

	private static ClienteAssembler instance;
	
	private ClienteAssembler() {}
	
	public static ClienteAssembler getInstance() {
		if(instance == null) {
			instance = new ClienteAssembler();
		}
		return instance;
	}
	
	public ClienteDTO entityToDTO(UserFacebookDTO user) {
		ClienteDTO dto = new ClienteDTO();
		
		try {

			dto.setApellido(user.getUsername());
			dto.setEmail(user.getEmail());
			dto.setId(user.getId());
		} catch(Exception e) {
			System.out.println(e);
		}
		return dto;
	}
	
	public List<ClienteDTO> entityToDTO(List<Cliente> lc){
		List<ClienteDTO> dtos = new ArrayList<>();
		

		return dtos;
	}
}
