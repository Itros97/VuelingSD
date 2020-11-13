package clases;

public class Aeropuerto {
	private int id_Aeropuerto;
	private String nombre;
	
	public Aeropuerto(int id_Aeropuerto, String nombre) {
		this.id_Aeropuerto = id_Aeropuerto;
		this.nombre = nombre;
	}
	
	public Aeropuerto() {
		this.id_Aeropuerto = 0;
		this.nombre = "";
	}

	public int getId_Aeropuerto() {
		return id_Aeropuerto;
	}

	public void setId_Aeropuerto(int id_Aeropuerto) {
		this.id_Aeropuerto = id_Aeropuerto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Aeropuerto [id_Aeropuerto=" + id_Aeropuerto + ", nombre=" + nombre + "]";
	}
	
	
	
}
