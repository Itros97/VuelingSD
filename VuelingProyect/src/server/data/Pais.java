package server.data;
import java.io.Serializable;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Pais implements Serializable{

	private static final long serialVersionUID = 1L;
	@PrimaryKey
	private String idPais;
	private String nombre;

	public Pais(String idPais, String nombre) {
		super();
		this.idPais = idPais;
		this.nombre = nombre;
	}
	
	public String getIdPais() {
		return idPais;
	}

	public void setIdPais(String idPais) {
		this.idPais = idPais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
