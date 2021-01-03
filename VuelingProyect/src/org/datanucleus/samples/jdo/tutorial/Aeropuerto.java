package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Aeropuerto {

	@PrimaryKey
	private int id_Aeropuerto;
	private String nombre;

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
	//SOLUCIONADO

	public Aeropuerto() {
		this.id_Aeropuerto = 0;
		this.nombre = "";
	}

	public int getId_Aeropuerto() {
		return id_Aeropuerto;
	}

	public void setId_Aeropuerto(int id_Aeropuerto) {
		this.id_Aeropuerto = id_Aeropuerto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Aeropuerto [id_Aeropuerto=" + id_Aeropuerto + ", nombre=" + nombre + "]";
	}

}
