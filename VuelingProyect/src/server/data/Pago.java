package server.data;

import java.io.Serializable;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Pago implements Serializable{

	private static final long serialVersionUID = 1L;
	@PrimaryKey
	private String idPago;
	
	@Persistent(defaultFetchGroup = "true")
	private Cliente cliente;
	
	private double importe;

	public Pago(String idPago, Cliente cliente, double importe) {
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	
}
