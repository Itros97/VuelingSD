package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Reserva {

	@PrimaryKey
	private int id_Reserva;
	private int num_Plazas;
	private Usuario[] pasajero;
	private double precio;
	
	//NOTA: Falta la relación con el Vuelo y la lista de pasajeros debe ser únicamente sus nombres.w

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
	public Reserva(int id_Reserva, int num_Plazas, Usuario[] pasajero, double precio) {
		super();
		this.id_Reserva = id_Reserva;
		this.num_Plazas = num_Plazas;
		this.pasajero = pasajero;
		this.precio = precio;
	}

	public Reserva() {
		super();
		this.id_Reserva = 0;
		this.num_Plazas = 0;
		this.pasajero = null;
		this.precio = 0.0;
	}

	public int getId_Reserva() {
		return id_Reserva;
	}

	public void setId_Reserva(int id_Reserva) {
		this.id_Reserva = id_Reserva;
	}

	public int getNum_Plazas() {
		return num_Plazas;
	}

	public void setNum_Plazas(int num_Plazas) {
		this.num_Plazas = num_Plazas;
	}

	public Usuario[] getPasajero() {
		return pasajero;
	}

	public void setPasajero(Usuario[] pasajero) {
		this.pasajero = pasajero;
	}

	public int getPrecio() {
		return id_Reserva;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
