package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Reserva extends Usuario {

	@PrimaryKey
	private int idReserva;
	private int numPlazas;
	private Usuario[] pasajero;
	private double precio;
	private int id_Vuelo;
	
	//NOTA: Falta la relación con el Vuelo y la lista de pasajeros debe ser únicamente sus nombres.w
	

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
	//SOLUCIONADO

	public Reserva() {
		super();
		this.idReserva = 0;
		this.numPlazas = 0;
		this.pasajero = null;
		this.precio = 0.0;
		this.id_Vuelo = 0;
	}

	public int getId_Vuelo() {
		return id_Vuelo;
	}

	public void setId_Vuelo(int id_Vuelo) {
		this.id_Vuelo = id_Vuelo;
	}

	public int getidReserva() {
		return idReserva;
	}

	public void setidReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getnumPlazas() {
		return numPlazas;
	}

	public void setnumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	/*public Usuario[] getPasajero() {
		
		for (int i = 0; i < pasajero.length; i++) {
			return Usuario.getUsername();
		}
	}*/

	public void setPasajero(Usuario[] pasajero) {
		this.pasajero = pasajero;
	}

	public int getPrecio() {
		return idReserva;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}