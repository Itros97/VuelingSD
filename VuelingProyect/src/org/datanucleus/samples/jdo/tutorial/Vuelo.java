package org.datanucleus.samples.jdo.tutorial;

import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Vuelo {

	@PrimaryKey
	private int id_Vuelo;
	private int plazas_libres;
	private double precio;
	private Date fecha_Salida;
	private Date fecha_Llegada;
	private Reserva[] reservas;
	private Aeropuerto[] aeropuertos;

	// NOTA: Faltan los atributos para definir las relaciones con Aerolínea,
	// Aeropuertos y la lista de Reservas
	//SOLUCIONADO

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
	//SOLUCIONADO

	public Vuelo() {
		this.id_Vuelo = 0;
		this.plazas_libres = 0;
		this.precio = 0.0;
		this.fecha_Salida = null;
		this.fecha_Llegada = null;
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

	public int getId_Vuelo() {
		return id_Vuelo;
	}

	public void setId_Vuelo(int id_Vuelo) {
		this.id_Vuelo = id_Vuelo;
	}

	public int getPlazas_libres() {
		return plazas_libres;
	}

	public void setPlazas_libres(int plazas_libres) {
		this.plazas_libres = plazas_libres;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFecha_Salida() {
		return fecha_Salida;
	}

	public void setFecha_Salida(Date fecha_Salida) {
		this.fecha_Salida = fecha_Salida;
	}

	public Date getFecha_Llegada() {
		return fecha_Llegada;
	}

	public void setFecha_Llegada(Date fecha_Llegada) {
		this.fecha_Llegada = fecha_Llegada;
	}

	@Override
	public String toString() {
		return "Vuelo [id_Vuelo=" + id_Vuelo + ", plazas_libres=" + plazas_libres + ", precio=" + precio
				+ ", fecha_Salida=" + fecha_Salida + ", fecha_Llegada=" + fecha_Llegada + "]";
	}

}
