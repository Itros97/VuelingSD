package RMIData;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import Data.Aeropuerto;
import Data.Reserva;

public class VueloIberiaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idVueloIberia;
	private int plazasLibres;
	private double precioVueloIberia;
	private Date fechaSalida;
	private Date fechaLlegada;
	private Reserva[] reservas;
	private Aeropuerto aeropuertoSalida;
	private Aeropuerto aeropuertoLlegada;

	
	public VueloIberiaDTO() {
		
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

	public int getidVueloIberia() {
		return idVueloIberia;
	}

	public void setidVueloIberia(int idVueloIberia) {
		this.idVueloIberia = idVueloIberia;
	}

	public int getplazasLibres() {
		return plazasLibres;
	}

	public void setplazasLibres(int plazasLibres) {
		this.plazasLibres = plazasLibres;
	}

	public double getprecioVueloIberia() {
		return precioVueloIberia;
	}

	public void setprecioVueloIberia(double precioVueloIberia) {
		this.precioVueloIberia = precioVueloIberia;
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
		return "VueloIberiaDTO [idVueloIberia=" + idVueloIberia + ", plazasLibres=" + plazasLibres
				+ ", precioVueloIberia=" + precioVueloIberia + ", fechaSalida=" + fechaSalida + ", fechaLlegada="
				+ fechaLlegada + ", reservas=" + Arrays.toString(reservas) + ", aeropuertoSalida=" + aeropuertoSalida
				+ ", aeropuertoLlegada=" + aeropuertoLlegada + "]";
	}
	
	
}
