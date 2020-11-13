package clases;

import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Vuelo {
	
	@PrimaryKey
	private int id_Vuelo;
	private int plazas_libres;
	private double precio;
	private Date fecha_Salida;
	private Date fecha_Llegada;
	
	public Vuelo(int id_Vuelo, int plazas_libres, double precio, Date fecha_Salida, Date fecha_Llegada) {
		this.id_Vuelo = id_Vuelo;
		this.plazas_libres = plazas_libres;
		this.precio = precio;
		this.fecha_Salida = fecha_Salida;
		this.fecha_Llegada = fecha_Llegada;
	}
	
	public Vuelo() {
		this.id_Vuelo = 0;
		this.plazas_libres = 0;
		this.precio = 0.0;
		this.fecha_Salida = null;
		this.fecha_Llegada = null;
	}

	public int getId_Vuelo() {
		return id_Vuelo;
	}

	public void setId_Vuelo(int id_Vuelo) {
		this.id_Vuelo = id_Vuelo;
	}

	public int getPlazas_libres() {
		return plazas_libres;
	}

	public void setPlazas_libres(int plazas_libres) {
		this.plazas_libres = plazas_libres;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFecha_Salida() {
		return fecha_Salida;
	}

	public void setFecha_Salida(Date fecha_Salida) {
		this.fecha_Salida = fecha_Salida;
	}

	public Date getFecha_Llegada() {
		return fecha_Llegada;
	}

	public void setFecha_Llegada(Date fecha_Llegada) {
		this.fecha_Llegada = fecha_Llegada;
	}

	@Override
	public String toString() {
		return "Vuelo [id_Vuelo=" + id_Vuelo + ", plazas_libres=" + plazas_libres + ", precio=" + precio
				+ ", fecha_Salida=" + fecha_Salida + ", fecha_Llegada=" + fecha_Llegada + "]";
	}

	
	
}
