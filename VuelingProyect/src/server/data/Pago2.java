package server.data;

import java.io.Serializable;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Pago2 implements Serializable{

	private static final long serialVersionUID = 1L;
	@PrimaryKey
	private String idPago;
	
	@Persistent(defaultFetchGroup = "true")
	private String cliente;
	
	private double importe;

	public Pago2(String idPago, String cliente, double importe) {
		super();
		this.idPago = idPago;
		this.cliente = cliente;
		this.importe = importe;
	}

	public String getIdPago() {
		return idPago;
	}

	public void setIdPago(String idPago) {
		this.idPago = idPago;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "FormaDePago [idPago=" + idPago + ", cliente=" + cliente + ", importe=" + importe + "]";
	}
	
	
}
