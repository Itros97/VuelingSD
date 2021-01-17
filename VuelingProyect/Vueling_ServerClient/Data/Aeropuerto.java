package Data;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Aeropuerto {
	
	private static int contador=0;
	
	@PrimaryKey
	private int idAeropuerto;
	private String nombreAeropuerto;

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
	//SOLUCIONADO

	public Aeropuerto() {
		contador++;
		this.idAeropuerto = contador;
		this.nombreAeropuerto = "";
	}

	public Aeropuerto(String nombreAeropuerto) {
		super();
		contador++;
		this.idAeropuerto = contador;
		this.nombreAeropuerto = nombreAeropuerto;
	}

	public int getIdAeropuerto() {
		return idAeropuerto;
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
