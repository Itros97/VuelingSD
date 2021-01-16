package Data;

import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Vuelo {

	private Date fechaSalida;
	private Date fechaLlegada;
	private Reserva[] reservas;
	private Aeropuerto aeropuertoSalida;
	private Aeropuerto aeropuertoLlegada;
	
	@PrimaryKey
	private int idVuelo;
	private int plazasLibres;
	private double precioVuelo;
	
	public Vuelo(int idVuelo, int plazasLibres, double precioVuelo, Date fechaSalida, Date fechaLlegada,
			Reserva[] reservas, Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada) {
		super();
		this.idVuelo = idVuelo;
		this.plazasLibres = plazasLibres;
		this.precioVuelo = precioVuelo;
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
		this.reservas = reservas;
		this.aeropuertoSalida = aeropuertoSalida;
		this.aeropuertoLlegada = aeropuertoLlegada;
	}



	// NOTA: Faltan los atributos para definir las relaciones con Aerolínea,
	// aeropuertoSalida y la lista de Reservas
	//SOLUCIONADO

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
	//SOLUCIONADO

	public Aeropuerto getAeropuertoLlegada() {
		return aeropuertoLlegada;
	}



	public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
		this.aeropuertoLlegada = aeropuertoLlegada;
	}



	public Vuelo() {
		this.idVuelo = 0;
		this.plazasLibres = 0;
		this.precioVuelo = 0.0;
		this.fechaSalida = null;
		this.fechaLlegada = null;
		this.reservas = null;
		this.aeropuertoSalida = null;
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
