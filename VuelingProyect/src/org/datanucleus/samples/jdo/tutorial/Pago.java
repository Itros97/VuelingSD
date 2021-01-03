package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Pago {

	@PrimaryKey
	private int id_Pago;
	private double importe;

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
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
