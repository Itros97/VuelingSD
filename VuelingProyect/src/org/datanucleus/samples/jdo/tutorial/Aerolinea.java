package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Aerolinea {

	//NOTA: Tenéis que diferenciar el pago con Tarjeta y PayPal
	// SOLUCIONADO
	@PrimaryKey
	private int id;
	private String nombre;
	private boolean pago; //True tarjeta y false Paypal

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
	// SOLUCIONADO

	public Aerolinea() {
		this.id = 0;
		this.nombre = "";
		this.pago = false;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		if(pago == true) {
			return "Aerolinea [id=" + id + ", nombre=" + nombre + ", pago = tarjeta]";
		}else {
			return "Aerolinea[id=" + id + ", nombre=" + nombre + ", pago = paypal]";
		}
	
	}

}
