package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Aerolinea {

	//NOTA: Tenéis que diferenciar el pago con Tarjeta y PayPal
	// SOLUCIONADO
	@PrimaryKey
	private int idAerolinea;
	private String nombreAerolinea;
	private boolean pago; //True tarjeta y false Paypal

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
	// SOLUCIONADO

	public Aerolinea() {
		this.idAerolinea = 0;
		this.nombreAerolinea = "";
		this.pago = false;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public int getIdAerolinea() {
		return idAerolinea;
	}

	public void setIdAerolinea(int id) {
		this.idAerolinea = id;
	}

	public String getNombreAerolinea() {
		return nombreAerolinea;
	}

	public void setNombreAerolinea(String nombre) {
		this.nombreAerolinea = nombre;
	}

	@Override
	public String toString() {
		if(pago == true) {
			return "Aerolinea [id=" + idAerolinea + ", nombre=" + nombreAerolinea + ", pago = tarjeta]";
		}else {
			return "Aerolinea[id=" + idAerolinea + ", nombre=" + nombreAerolinea + ", pago = paypal]";
		}
	
	}

}
