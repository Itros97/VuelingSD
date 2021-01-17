package DTO;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import Data.Aeropuerto;
import Data.Reserva;

public class VueloDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idVuelo;
	private int plazasLibres;
	private double precioVuelo;
	private Date fechaSalida;
	private Date fechaLlegada;
	private Reserva[] reservas;
	private Aeropuerto aeropuertoSalida;
	private Aeropuerto aeropuertoLlegada;
	
	
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
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Aeropuerto getAeropuertoSalida() {
		return aeropuertoSalida;
	}
	public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
		this.aeropuertoSalida = aeropuertoSalida;
	}
	public Aeropuerto getAeropuertoLlegada() {
		return aeropuertoLlegada;
	}
	public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
		this.aeropuertoLlegada = aeropuertoLlegada;
	}
	@Override
	public String toString() {
		return "VueloDTO [idVuelo=" + idVuelo + ", plazasLibres=" + plazasLibres + ", precioVuelo=" + precioVuelo
				+ ", fechaSalida=" + fechaSalida + ", fechaLlegada=" + fechaLlegada + ", reservas="
				+ Arrays.toString(reservas) + ", aeropuertoSalida=" + aeropuertoSalida + ", aeropuertoLlegada="
				+ aeropuertoLlegada + "]";
	}
	
	
	
}