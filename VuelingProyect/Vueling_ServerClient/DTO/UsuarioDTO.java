package DTO;

import java.io.Serializable;


public class UsuarioDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String username;
	private String password;
	private String nombre;
	private String apellido;
	private String email;
	private AeropuertoDTO aeropuerto;
	private String autorizacion;
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
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

	@Override
	public String toString() {
		return "UsuarioDTO [id=" + id + ", username=" + username + ", password=" + password + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", email=" + email + ", aeropuerto=" + aeropuerto + ", autorizacion="
				+ autorizacion + "]";
	}
	
	

}
