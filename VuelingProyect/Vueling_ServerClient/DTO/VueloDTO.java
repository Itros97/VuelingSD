package DTO;

import java.io.Serializable;
import java.util.Date;

import org.datanucleus.samples.jdo.tutorial.Aeropuerto;
import org.datanucleus.samples.jdo.tutorial.Reserva;

public class VueloDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idVuelo;
	private int plazasLibres;
	private double precioVuelo;
	private Date fechaSalida;
	private Date fechaLlegada;
	private Reserva[] reservas;
	private Aeropuerto[] aeropuertos;
	public int getIdVuelo() {
		return idVuelo;
	}
	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}
	public int getPlazasLibres() {
		return plazasLibres;
	}
	public void setPlazasLibres(int plazasLibres) {
		this.plazasLibres = plazasLibres;
	}
	public double getPrecioVuelo() {
		return precioVuelo;
	}
	public void setPrecioVuelo(double precioVuelo) {
		this.precioVuelo = precioVuelo;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public Date getFechaLlegada() {
		return fechaLlegada;
	}
	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}