package RMIData_Pago;


import java.io.Serializable;

public class PagoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int idPago;
	private double importe;
	
	public PagoDTO(int idPago, double importe) {
		super();
		this.idPago = idPago;
		this.importe = importe;
	}
	
	
	public PagoDTO() {
		super();
		this.idPago = 0;
		this.importe = 0.0;
	}


	public int getIdPago() {
		return idPago;
	}


	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}


	public double getImporte() {
		return importe;
	}


	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
	

}