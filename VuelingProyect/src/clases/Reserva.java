package clases;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Reserva {
	
	@PrimaryKey
	private int id_Reserva;
	private int num_Plazas;
	private Usuario[] pasajero;
	
	public Reserva(int id_Reserva, int num_Plazas, Usuario[] pasajero) {
		super();
		this.id_Reserva = id_Reserva;
		this.num_Plazas = num_Plazas;
		this.pasajero = pasajero;
	}
	
	public Reserva() {
		super();
		this.id_Reserva = 0;
		this.num_Plazas = 0;
		this.pasajero = null;
	}

	public int getId_Reserva() {
		return id_Reserva;
	}

	public void setId_Reserva(int id_Reserva) {
		this.id_Reserva = id_Reserva;
	}

	public int getNum_Plazas() {
		return num_Plazas;
	}

	public void setNum_Plazas(int num_Plazas) {
		this.num_Plazas = num_Plazas;
	}

	public Usuario[] getPasajero() {
		return pasajero;
	}

	public void setPasajero(Usuario[] pasajero) {
		this.pasajero = pasajero;
	}
	
}
