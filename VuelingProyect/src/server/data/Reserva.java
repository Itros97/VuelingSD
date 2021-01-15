package server.data;

import java.io.Serializable;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Reserva implements Serializable {

	private static final long serialVersionUID = 1L;
	@PrimaryKey
	private String idReserva;
	private int numPlazas;
	@Persistent(defaultFetchGroup = "true", dependentElement = "true")
	private Cliente cliente;
	@Persistent(defaultFetchGroup = "true", dependentElement = "true")
	private Pago pago;
	@Persistent(defaultFetchGroup = "true", dependentElement = "true")
	private Vuelo vuelo;
	
	public Reserva(String idReserva, int numPlazas, Cliente cliente, Pago pago, Vuelo vuelo) {
		super();
		this.idReserva = idReserva;
		this.numPlazas = numPlazas;
		this.cliente = cliente;
		this.pago = pago;
		this.vuelo = vuelo;
	}

	public String getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(String idReserva) {
		this.idReserva = idReserva;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}


}
