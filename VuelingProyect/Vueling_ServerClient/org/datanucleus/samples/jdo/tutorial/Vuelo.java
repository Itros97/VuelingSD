package org.datanucleus.samples.jdo.tutorial;

import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Vuelo {

	@PrimaryKey
	private int idVuelo;
	private int plazasLibres;
	private double precioVuelo;
	private Date fechaSalida;
	private Date fechaLlegada;
	private Reserva[] reservas;
	private Aeropuerto[] aeropuertos;

	// NOTA: Faltan los atributos para definir las relaciones con Aerolínea,
	// Aeropuertos y la lista de Reservas
	//SOLUCIONADO

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
	//SOLUCIONADO

	public Vuelo() {
		this.idVuelo = 0;
		this.plazasLibres = 0;
		this.precioVuelo = 0.0;
		this.fechaSalida = null;
		this.fechaLlegada = null;
		this.reservas = null;
		this.aeropuertos = null;
	}

	public Reserva[] getReservas() {
		return reservas;
	}

	public void setReservas(Reserva[] reservas) {
		this.reservas = reservas;
	}

	public Aeropuerto[] getAeropuertos() {
		return aeropuertos;
	}

	public void setAeropuertos(Aeropuerto[] aeropuertos) {
		this.aeropuertos = aeropuertos;
	}

	public int getidVuelo() {
		return idVuelo;
	}

	public void setidVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public int getplazasLibres() {
		return plazasLibres;
	}

	public void setplazasLibres(int plazasLibres) {
		this.plazasLibres = plazasLibres;
	}

	public double getprecioVuelo() {
		return precioVuelo;
	}

	public void setprecioVuelo(double precioVuelo) {
		this.precioVuelo = precioVuelo;
	}

	public Date getfechaSalida() {
		return fechaSalida;
	}

	public void setfechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Date getfechaLlegada() {
		return fechaLlegada;
	}

	public void setfechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	@Override
	public String toString() {
		return "Vuelo [idVuelo=" + idVuelo + ", plazasLibres=" + plazasLibres + ", precioVuelo=" + precioVuelo
				+ ", fechaSalida=" + fechaSalida + ", fechaLlegada=" + fechaLlegada + "]";
	}

}
