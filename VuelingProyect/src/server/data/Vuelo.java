package server.data;

import java.io.Serializable;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Vuelo implements Serializable {

	private static final long serialVersionUID = 1L;
	@PrimaryKey
	private String idVuelo;
	private int plazasLibres;
	//private int plazas;
	@Persistent(defaultFetchGroup = "true")
	//private Aeropuerto aeropuerto;
	private Aerolinea aerolinea;
	private String origen;
	private String destino;
	private double precio;
	private String fecha;
	private String horaSalida;
	private String horaLlegada;
	
	public Vuelo(String idVuelo, int plazasLibres, Aerolinea aerolinea, String origen,
			String destino, double precio, String fecha, String horaSalida, String horaLlegada) {
		super();
		this.idVuelo = idVuelo;
		this.plazasLibres = plazasLibres;
		this.aerolinea = aerolinea;
		this.origen = origen;
		this.destino = destino;
		this.precio = precio;
		this.fecha = fecha;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
	}

	public String getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(String idVuelo) {
		this.idVuelo = idVuelo;
	}

	public int getPlazasLibres() {
		return plazasLibres;
	}

	public void setPlazasLibres(int plazasLibres) {
		this.plazasLibres = plazasLibres;
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}


	
	
	
}
