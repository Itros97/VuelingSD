package RMIData;

import java.util.Arrays;
import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

import Data.Aeropuerto;
import Data.Reserva;

@PersistenceCapable
public class VueloIberia {

	private static int contador=0;
	
	private Date fechaSalida;
	private Date fechaLlegada;
	private Reserva[] reservas;
	private Aeropuerto aeropuertoSalida;
	private Aeropuerto aeropuertoLlegada;
	
	@PrimaryKey
	private int idVueloIberia;
	private int plazasLibres;
	private double precioVueloIberia;
	
	public VueloIberia(int plazasLibres, double precioVueloIberia, Date fechaSalida, Date fechaLlegada,
			Reserva[] reservas, Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada) {
		super();
		contador++;
		this.idVueloIberia = contador;
		this.plazasLibres = plazasLibres;
		this.precioVueloIberia = precioVueloIberia;
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
		this.reservas = reservas;
		this.aeropuertoSalida = aeropuertoSalida;
		this.aeropuertoLlegada = aeropuertoLlegada;
	}

	public VueloIberia() {
		contador++;
		this.idVueloIberia = contador;
		this.plazasLibres = 0;
		this.precioVueloIberia = 0.0;
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

	public int getidVueloIberia() {
		return idVueloIberia;
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
		return "VueloIberia [fechaSalida=" + fechaSalida + ", fechaLlegada=" + fechaLlegada + ", reservas="
				+ Arrays.toString(reservas) + ", aeropuertoSalida=" + aeropuertoSalida + ", aeropuertoLlegada="
				+ aeropuertoLlegada + ", idVueloIberia=" + idVueloIberia + ", plazasLibres=" + plazasLibres
				+ ", precioVueloIberia=" + precioVueloIberia + "]";
	}
	
}
