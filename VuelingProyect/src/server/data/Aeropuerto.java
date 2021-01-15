package server.data;

import java.io.Serializable;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Aeropuerto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@PrimaryKey
	private String idAeropuerto;
	private String nombre;
	private String provincia;
	

	@Persistent(defaultFetchGroup = "true")
	private Pais pais;
	
	public Aeropuerto(String idAeropuerto, String nombre, String provincia, Pais pais) {
		super();
		this.idAeropuerto = idAeropuerto;
		this.nombre = nombre;
		this.provincia = provincia;
		this.pais = pais;
	}

	
	public String getIdAeropuerto() {
		return idAeropuerto;
	}

	public void setIdAeropuerto(String idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
}
