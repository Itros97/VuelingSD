package clases;

public class Usuario {
	private String username;
	private String nombre;
	private String apellido;
	private String email;
	
	public Usuario(String username, String nombre, String apellido, String email) {
		this.username = username;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public Usuario() {
		this.username = "";
		this.nombre = "";
		this.apellido = "";
		this.email = "";
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
