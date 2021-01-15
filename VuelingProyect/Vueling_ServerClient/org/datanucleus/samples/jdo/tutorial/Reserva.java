package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Reserva extends Usuario {

	@PrimaryKey
	private int idReserva;
	private int numPlazas;
	private Usuario[] pasajero;
	private Pago precio;
	private Vuelo vuelo;
	
	//NOTA: Falta la relación con el Vuelo y la lista de pasajeros debe ser únicamente sus nombres.w
	

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
	//SOLUCIONADO

	public Reserva() {
		super();
		this.idReserva = 0;
		this.numPlazas = 0;
		this.pasajero = null;
		this.precio = null;
		this.vuelo = null;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
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

	public Pago getPrecio() {
		return precio;
	}

	public void setPrecio(Pago precio) {
		this.precio = precio;
	}

}