package SocketData;

import java.util.Arrays;
import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

import Data.Aeropuerto;
import Data.Reserva;


@PersistenceCapable
public class VueloLufthansa {

	private static int contador=0;
	
	private Date fechaSalida;
	private Date fechaLlegada;
	private Reserva[] reservas;
	private Aeropuerto aeropuertoSalida;
	private Aeropuerto aeropuertoLlegada;
	
	@PrimaryKey
	private int idVueloLufthansa;
	private int plazasLibres;
	private double precioVueloLufthansa;
	
	public VueloLufthansa(int plazasLibres, double precioVueloLufthansa, Date fechaSalida, Date fechaLlegada,
			Reserva[] reservas, Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada) {
		super();
		contador++;
		this.idVueloLufthansa = contador;
		this.plazasLibres = plazasLibres;
		this.precioVueloLufthansa = precioVueloLufthansa;
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
		this.reservas = reservas;
		this.aeropuertoSalida = aeropuertoSalida;
		this.aeropuertoLlegada = aeropuertoLlegada;
	}

	public VueloLufthansa() {
		contador++;
		this.idVueloLufthansa = contador;
		this.plazasLibres = 0;
		this.precioVueloLufthansa = 0.0;
		this.fechaSalida = null;
		this.fechaLlegada = null;
		this.reservas = null;
		this.aeropuertoSalida = null;
	}

	public Aeropuerto getAeropuertoLlegada() {
		return aeropuertoLlegada;
	}



	public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
		this.aeropuertoLlegada = aeropuertoLlegada;
	}

	public Reserva[] getReservas() {
		return reservas;
	}

	public void setReservas(Reserva[] reservas) {
		this.reservas = reservas;
	}

	public Aeropuerto getaeropuertoSalida() {
		return aeropuertoSalida;
	}

	public void setaeropuertoSalida(Aeropuerto aeropuertoSalida) {
		this.aeropuertoSalida = aeropuertoSalida;
	}

	public int getidVueloLufthansa() {
		return idVueloLufthansa;
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
		return "VueloLufthansa [fechaSalida=" + fechaSalida + ", fechaLlegada=" + fechaLlegada + ", reservas="
				+ Arrays.toString(reservas) + ", aeropuertoSalida=" + aeropuertoSalida + ", aeropuertoLlegada="
				+ aeropuertoLlegada + ", idVueloLufthansa=" + idVueloLufthansa + ", plazasLibres=" + plazasLibres
				+ ", precioVueloLufthansa=" + precioVueloLufthansa + "]";
	}
	
}
