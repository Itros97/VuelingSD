package DTO;

import java.io.Serializable;

public class AeropuertoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private int idAeropuerto;
	
	public int getIdAeropuerto() {
		return idAeropuerto;
	}
	public void setIdAeropuerto(int idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}
	@Override
	public String toString() {
		return "AeropuertoDTO [idAeropuerto=" + idAeropuerto + "]";
	}
	
	
}
