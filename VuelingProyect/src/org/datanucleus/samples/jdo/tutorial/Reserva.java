package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Reserva extends Usuario {

	@PrimaryKey
	private int id_Reserva;
	private int num_Plazas;
	private Usuario[] pasajero;
	private double precio;
	private int id_Vuelo;
	
	//NOTA: Falta la relación con el Vuelo y la lista de pasajeros debe ser únicamente sus nombres.w
	

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
	//SOLUCIONADO

	public Reserva() {
		super();
		this.id_Reserva = 0;
		this.num_Plazas = 0;
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

	/*public Usuario[] getPasajero() {
		
		for (int i = 0; i < pasajero.length; i++) {
			return Usuario.getUsername();
		}
	}*/

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