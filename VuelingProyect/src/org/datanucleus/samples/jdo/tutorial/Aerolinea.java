package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Aerolinea {
	
	@PrimaryKey
	private int id;
	private String nombre;
	

	public Aerolinea(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public Aerolinea() {
		this.id = 0;
		this.nombre = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Aerolinea [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
}
