package DTO;

import java.io.Serializable;

public class ReservaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idReserva;
	private int numPlazas;
	private PagoDTO pago;
	private VueloDTO vuelo;
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int i) {
		this.idReserva = i;
	}
	public int getNumPlazas() {
		return numPlazas;
	}
	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	public PagoDTO getPago() {
		return pago;
	}
	public void setPago(PagoDTO pago) {
		this.pago = pago;
	}
	public VueloDTO getVuelo() {
		return vuelo;
	}
	public void setVuelo(VueloDTO vuelo) {
		this.vuelo = vuelo;
	}
	@Override
	public String toString() {
		return "ReservaDTO [idReserva=" + idReserva + ", numPlazas=" + numPlazas + ", pago=" + pago + ", vuelo=" + vuelo
				+ "]";
	}
}
