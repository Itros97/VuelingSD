package DTO;

import java.util.ArrayList;
import java.util.List;

import Data.Usuario;
import RMIData_Auth.UsuarioFacebookDTO;
import DTO.UsuarioDTO;


public class UsuarioAssembler {

	private static UsuarioAssembler instance;
	
	private UsuarioAssembler() {}
	
	public static UsuarioAssembler getInstance() {
		if(instance == null) {
			instance = new UsuarioAssembler();
		}
		return instance;
	}
	
	public UsuarioDTO entityToDTO(UsuarioFacebookDTO user) {
		UsuarioDTO dto = new UsuarioDTO();
		
		try {

			 dto.setId(user.getidUsuario());
			 dto.setUsername(user.getUsername());
			 dto.setPassword(user.getPassword());
			 dto.setNombre(user.getNombre());
			 dto.setApellido(user.getApellido());
			 dto.setEmail(user.getEmail());
			 
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

