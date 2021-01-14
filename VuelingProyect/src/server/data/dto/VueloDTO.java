package server.data.dto;

import java.io.Serializable;

public class VueloDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String idVuelo;
	private int plazasLibres;
	private String idAerolinea;
	private String origen;
	private String destino;
	private double precio;
	private String fecha;
	private String horaSalida;
	private String horaLlegada;
	
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

	public String getIdAerolinea() {
		return idAerolinea;
	}
	public void setIdAerolinea(String idAerolinea) {
		this.idAerolinea = idAerolinea;
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
