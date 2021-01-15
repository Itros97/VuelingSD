package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Pago {

	@PrimaryKey
	private int idPago;
	private double importe;

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
	//SOLUCIONADO

	public Pago() {
		super();
		this.idPago = 0;
		this.importe = 0.0;
	}

	public int getidPago() {
		return idPago;
	}

	public void setidPago(int idPago) {
		this.idPago = idPago;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

}
