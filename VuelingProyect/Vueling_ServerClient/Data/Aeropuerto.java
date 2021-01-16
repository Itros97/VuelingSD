package Data;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Aeropuerto {

	@PrimaryKey
	private int idAeropuerto;
	private String nombreAeropuerto;

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
	//SOLUCIONADO

	public Aeropuerto() {
		this.idAeropuerto = 0;
		this.nombreAeropuerto = "";
	}

	public Aeropuerto(int idAeropuerto, String nombreAeropuerto) {
		super();
		this.idAeropuerto = idAeropuerto;
		this.nombreAeropuerto = nombreAeropuerto;
	}

	public int getIdAeropuerto() {
		return idAeropuerto;
	}

	public void setIdAeropuerto(int idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}

	public String getnombreAeropuerto() {
		return nombreAeropuerto;
	}

	public void setnombreAeropuerto(String nombreAeropuerto) {
		this.nombreAeropuerto = nombreAeropuerto;
	}

	@Override
	public String toString() {
		return "Aeropuerto [id_Aeropuerto=" + idAeropuerto + ", nombreAeropuerto=" + nombreAeropuerto + "]";
	}

}
