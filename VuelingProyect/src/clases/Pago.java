package clases;

public class Pago {
	private int id_Pago;
	private double importe;
	
	public Pago(int id_Pago, double importe) {
		super();
		this.id_Pago = id_Pago;
		this.importe = importe;
	}
	
	public Pago() {
		super();
		this.id_Pago = 0;
		this.importe = 0.0;
	}

	public int getId_Pago() {
		return id_Pago;
	}

	public void setId_Pago(int id_Pago) {
		this.id_Pago = id_Pago;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
	
	
}
