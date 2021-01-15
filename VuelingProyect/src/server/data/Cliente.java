package server.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.Join;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@PrimaryKey
	private String idCliente;
	private String nombre;
	private String apellido;
	private String email;
	
	
	
	@Persistent(defaultFetchGroup = "true")
	private Aeropuerto aeropuerto;
	@Persistent(defaultFetchGroup = "true")
	@Join
	private List<Recibo> reservas = new ArrayList<Recibo>();
	
	
	public Cliente(String idCliente, String nombre, String apellido, String email,
			Aeropuerto aeropuerto, List<Recibo> reservas) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.aeropuerto = aeropuerto;
		this.reservas = reservas;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Aeropuerto getAeropuerto() {
		return aeropuerto;
	}

	public void setAeropuerto(Aeropuerto aeropuerto) {
		this.aeropuerto = aeropuerto;
	}

	public List<Recibo> getReservas() {
		return reservas;
	}

	public void setReservas(List<Recibo> reservas) {
		this.reservas = reservas;
	}


	
	
	
}
