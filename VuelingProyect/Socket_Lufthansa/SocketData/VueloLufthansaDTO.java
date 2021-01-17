package SocketData;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import Data.Aeropuerto;
import Data.Reserva;

public class VueloLufthansaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idVueloLufthansa;
	private int plazasLibres;
	private double precioVueloLufthansa;
	private Date fechaSalida;
	private Date fechaLlegada;
	private Reserva[] reservas;
	private Aeropuerto aeropuertoSalida;
	private Aeropuerto aeropuertoLlegada;

	
	public VueloLufthansaDTO() {
		
	}

	public Reserva[] getReservas() {
		return reservas;
	}

	public void setReservas(Reserva[] reservas) {
		this.reservas = reservas;
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

	public int getidVueloLufthansa() {
		return idVueloLufthansa;
	}

	public void setidVueloLufthansa(int idVueloLufthansa) {
		this.idVueloLufthansa = idVueloLufthansa;
	}

	public int getplazasLibres() {
		return plazasLibres;
	}

	public void setplazasLibres(int plazasLibres) {
		this.plazasLibres = plazasLibres;
	}

	public double getprecioVueloLufthansa() {
		return precioVueloLufthansa;
	}

	public void setprecioVueloLufthansa(double precioVueloLufthansa) {
		this.precioVueloLufthansa = precioVueloLufthansa;
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
		return "VueloLufthansaDTO [idVueloLufthansa=" + idVueloLufthansa + ", plazasLibres=" + plazasLibres
				+ ", precioVueloLufthansa=" + precioVueloLufthansa + ", fechaSalida=" + fechaSalida + ", fechaLlegada="
				+ fechaLlegada + ", reservas=" + Arrays.toString(reservas) + ", aeropuertoSalida=" + aeropuertoSalida
				+ ", aeropuertoLlegada=" + aeropuertoLlegada + "]";
	}
	
	
}
