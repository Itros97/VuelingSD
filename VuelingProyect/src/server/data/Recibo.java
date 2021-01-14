package server.data;

import java.io.Serializable;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Recibo implements Serializable{

	private static final long serialVersionUID = 1L;
	@PrimaryKey
	private String idPago;
	public String s;
	
	public Recibo(String idPago, String s) {
		super();
		this.idPago = idPago;
		this.s = s;
	}

	public String getIdPago() {
		return idPago;
	}

	public void setIdPago(String idPago) {
		this.idPago = idPago;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	
	
	

	
	
}
