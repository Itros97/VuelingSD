package server.data.dto;

import java.io.Serializable;

public class AeropuertoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String idAeropuerto;
	
	public String getIdAeropuerto() {
		return idAeropuerto;
	}
	public void setIdAeropuerto(String idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}
	@Override
	public String toString() {
		return "AeropuertoDTO [idAeropuerto=" + idAeropuerto + "]";
	}
	
	
}
