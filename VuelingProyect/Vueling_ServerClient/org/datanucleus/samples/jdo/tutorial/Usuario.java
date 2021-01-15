package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Usuario {

	@PrimaryKey
	private int idUsuario;
	private String username;
	private String nombre;
	private String apellido;
	private String email;

	// NOTA: Falta la lista de Reservas, el aeropuerto por defecto y el sistema de
	// autorización

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
	public Usuario(int idUsuario, String username, String nombre, String apellido, String email) {
		this.idUsuario = idUsuario;
		this.username = username;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public Usuario() {
		this.idUsuario = 0;
		this.username = "";
		this.nombre = "";
		this.apellido = "";
		this.email = "";
	}

	public int getidUsuario() {
		return idUsuario;
	}

	public void setidUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	@Override
	public String toString() {
		return "Usuario [username=" + username + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ "]";
	}

}
