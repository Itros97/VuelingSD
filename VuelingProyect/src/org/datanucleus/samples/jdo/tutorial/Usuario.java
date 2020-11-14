package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Usuario {
	
	@PrimaryKey
	private int id_usuario;
	private String username;
	private String nombre;
	private String apellido;
	private String email;
	
	public Usuario(int id_usuario,String username, String nombre, String apellido, String email) {
		this.id_usuario = id_usuario;
		this.username = username;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public Usuario() {
		this.id_usuario = 0;
		this.username = "";
		this.nombre = "";
		this.apellido = "";
		this.email = "";
	}
	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
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