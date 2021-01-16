package DTO;

import java.io.Serializable;

public class PagoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String idPago;
	private UsuarioDTO usuario;
	private double importe;
	
	public String getIdPago() {
		return idPago;
	}
	public void setIdPago(String idPago) {
		this.idPago = idPago;
	}
	public UsuarioDTO getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	@Override
	public String toString() {
		return "PagoDTO [idPago=" + idPago + ", Usuario=" + usuario + ", importe=" + importe + "]";
	}
}
