package RMIData_Auth;

import java.io.Serializable;

public class UsuarioFacebookDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int idUsuario;
	private String username;
	private String password;
	private String nombre;
	private String apellido;
	private String email;

	
	public UsuarioFacebookDTO(int idUsuario, String username, String password, String nombre, String apellido, String email) {
		this.idUsuario = idUsuario;
		this.password = password;
		this.username = username;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public UsuarioFacebookDTO() {
		this.idUsuario = 0;
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

	public void setidUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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
}
