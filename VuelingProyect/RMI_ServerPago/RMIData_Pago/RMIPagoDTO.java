package RMIData_Pago;


import java.io.Serializable;

public class RMIPagoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int idPago;
	private String remitente;
	private String destinatario;
	private double importe;

	public int getIdPago() {
		return idPago;
	}

	public String getRemitente() {
		return remitente;
	}


	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}


	public String getDestinatario() {
		return destinatario;
	}


	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}


	public double getImporte() {
		return importe;
	}


	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "PagoDTO [idPago=" + idPago + ", remitente=" + remitente + ", destinatario=" + destinatario
				+ ", importe=" + importe + "]";
	}
	
	
	
}