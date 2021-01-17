package DTO;

import java.io.Serializable;

public class AeropuertoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private int idAeropuerto;
	private String nombreAeropuerto;
	
	public int getIdAeropuerto() {
		return idAeropuerto;
	}
	public void setIdAeropuerto(int idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}
	public String getNombreAeropuerto() {
		return nombreAeropuerto;
	}
	public void setNombreAeropuerto(String nombreAeropuerto) {
		this.nombreAeropuerto = nombreAeropuerto;
	}
	@Override
	public String toString() {
		return "AeropuertoDTO [idAeropuerto=" + idAeropuerto + ", nombreAeropuerto=" + nombreAeropuerto + "]";
	}
	
	
	
}
