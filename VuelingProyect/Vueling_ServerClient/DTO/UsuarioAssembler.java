package DTO;

import java.util.ArrayList;
import java.util.List;

import org.datanucleus.samples.jdo.tutorial.Usuario;


public class UsuarioAssembler {

	private static UsuarioAssembler instance;
	
	private UsuarioAssembler() {}
	
	public static UsuarioAssembler getInstance() {
		if(instance == null) {
			instance = new UsuarioAssembler();
		}
		return instance;
	}
	
	public UsuarioDTO entityToDTO(UserFacebookDTO user) {//Arreglar
		UsuarioDTO dto = new UsuarioDTO();
		
		try {

			dto.setApellido(user.getUsername());
			dto.setEmail(user.getEmail());
			dto.setId(user.getId());
		} catch(Exception e) {
			System.out.println(e);
		}
		return dto;
	}
	
	public List<UsuarioDTO> entityToDTO(List<Usuario> lc){
		List<UsuarioDTO> dtos = new ArrayList<>();
		

		return dtos;
	}
}

