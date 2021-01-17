package RMIData_Pago;


import java.io.Serializable;

public class UserPayPal implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private static int contador=0;
	
	private int idUsuario;
	private String email;
	private String password;
	private double dinero; //paypal permite enlazar tarjeta de credito o cuenta bancaria, pero para este ejemplo usaremos esta variable
	
	public UserPayPal(String email, String password, double dinero) {
		super();
		contador++;
		this.idUsuario = contador;
		this.email = email;
		this.password = password;
		this.dinero = dinero;
	}
	
	public UserPayPal() {
		super();
		contador++;
		this.idUsuario = contador;
		this.email = "";
		this.password = "";
		this.dinero = 0.0;
	}

	public int getIdUsuario() {
		return idUsuario;
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