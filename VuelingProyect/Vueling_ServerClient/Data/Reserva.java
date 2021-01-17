package Data;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Reserva extends Usuario {

	private static int contador=0;
	
	@PrimaryKey
	private int idReserva;
	private int numPlazas;
	private Usuario[] pasajero;
	private Pago precio;
	//private Vuelo vuelo; REVISAR
	
	//NOTA: Falta la relación con el Vuelo y la lista de pasajeros debe ser únicamente sus nombres.w
	

	// NOTA: No es necesario que creéis constructores. Usad el constructor por
	// defecto y los métodos SET.
	//SOLUCIONADO

	public Reserva() {
		super();
		contador++;
		this.idReserva = contador;
		this.numPlazas = 0;
		this.pasajero = null;
		this.precio = null;
		//this.vuelo = null;
	}

	public Reserva(String username, String password,  String nombre, String apellido, String email,
			int numPlazas, Usuario[] pasajero, Pago precio/*, Vuelo vuelo*/) {
		super(username, password,  nombre, apellido, email);
		contador++;
		this.idReserva = contador;
		this.numPlazas = numPlazas;
		this.pasajero = pasajero;
		this.precio = precio;
		//this.vuelo = vuelo;
	}

	/*public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}*/

	public int getidReserva() {
		return idReserva;
	}


	public int getnumPlazas() {
		return numPlazas;
	}

	public void setnumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	/*public Usuario[] getPasajero() {
		
		for (int i = 0; i < pasajero.length; i++) {
			return Usuario.getUsername();
		}
	}*/

	public void setPasajero(Usuario[] pasajero) {
		this.pasajero = pasajero;
	}

	public Pago getPrecio() {
		return precio;
	}

	public void setPrecio(Pago precio) {
		this.precio = precio;
	}

}