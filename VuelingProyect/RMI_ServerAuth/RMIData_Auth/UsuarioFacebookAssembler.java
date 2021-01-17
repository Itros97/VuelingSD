package RMIData_Auth;

import java.util.ArrayList;

import RMIData_Auth.UsuarioFacebook;
import RMIData_Auth.UsuarioFacebookAssembler;
import RMIData_Auth.UsuarioFacebookDTO;

public class UsuarioFacebookAssembler {
 
	private static UsuarioFacebookAssembler instance; //SINGLETON
	
	private UsuarioFacebookAssembler() {
		
	}

	public static UsuarioFacebookAssembler getInstance() {
		
		if (instance == null) {
			instance = new UsuarioFacebookAssembler();
		}
		return instance;
	}

	public UsuarioFacebookDTO toDTO(UsuarioFacebook u) {
		
		UsuarioFacebookDTO uDTO = new UsuarioFacebookDTO();
		
		try {
		 uDTO.setUsername(u.getUsername());
		 uDTO.setPassword(u.getPassword());
		 uDTO.setNombre(u.getNombre());
		 uDTO.setApellido(u.getApellido());
		 uDTO.setEmail(u.getEmail());
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return uDTO;
	}
	
	public ArrayList<UsuarioFacebookDTO> listToDTO(ArrayList<UsuarioFacebook> ul){
		
		ArrayList<UsuarioFacebookDTO> ulDTO = new ArrayList<UsuarioFacebookDTO>();
		
		for (UsuarioFacebook u : ul) {
			ulDTO.add(this.toDTO(u));
			
		}
		return ulDTO;
		
		
	}
}
