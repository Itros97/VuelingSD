package DTO;

import java.io.Serializable;


public class UsuarioDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String nombre;
	private String apellido;
	private String email;
	private AeropuertoDTO aeropuerto;
	private String autorizacion;
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AeropuertoDTO getAeropuerto() {
		return aeropuerto;
	}
	public void setAeropuerto(AeropuertoDTO aeropuerto) {
		this.aeropuerto = aeropuerto;
	}
	public String getAutorizacion() {
		return autorizacion;
	}
	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}
	

}
