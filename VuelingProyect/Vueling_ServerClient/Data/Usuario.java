package Data;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Usuario {

	private static int contador=0;
	
	@PrimaryKey
	private int idUsuario;
	private String username;
	private String password;
	private String nombre;
	private String apellido;
	private String email;

	// NOTA: Falta la lista de Reservas, el aeropuerto por defecto y el sistema de
	// autorización

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
	public Usuario(String username, String password, String nombre, String apellido, String email) {
		contador++;
		this.idUsuario = contador;
		this.username = username;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public Usuario() {
		contador++;
		this.idUsuario = contador;
		this.username = "";
		this.password = "";
		this.nombre = "";
		this.apellido = "";
		this.email = "";
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getidUsuario() {
		return idUsuario;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	@Override
	public String toString() {
		return "Usuario [username=" + username + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ "]";
	}

}
