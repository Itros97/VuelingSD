package RMIData_Pago;


import java.io.Serializable;

public class UserPayPal implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private int idUsuario;
	private String email;
	private String password;
	private double dinero; //paypal permite enlazar tarjeta de credito o cuenta bancaria, pero para este ejemplo usaremos esta variable
	
	public UserPayPal(int idUsuario, String email, String password, double dinero) {
		super();
		this.idUsuario = idUsuario;
		this.email = email;
		this.password = password;
		this.dinero = dinero;
	}
	
	public UserPayPal() {
		super();
		this.idUsuario = 0;
		this.email = "";
		this.password = "";
		this.dinero = 0.0;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	
	
	
}