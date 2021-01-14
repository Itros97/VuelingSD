package server.data;

import java.io.Serializable;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Aerolinea implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PrimaryKey
	private String idAerolinea;
	private String nombre;
	
	public Aerolinea(String idAerolinea, String nombre) {
		super();
		this.idAerolinea = idAerolinea;
		this.nombre = nombre;
	}

	public String getIdAerolinea() {
		return idAerolinea;
	}

	public void setIdAerolinea(String idAerolinea) {
		this.idAerolinea = idAerolinea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
