package server.data.dto;

import java.io.Serializable;

public class PagoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String idPago;
	private ClienteDTO cliente;
	private double importe;
	
	public String getIdPago() {
		return idPago;
	}
	public void setIdPago(String idPago) {
		this.idPago = idPago;
	}
	public ClienteDTO getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDTO cliente) {
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
		return "PagoDTO [idPago=" + idPago + ", cliente=" + cliente + ", importe=" + importe + "]";
	}
}
