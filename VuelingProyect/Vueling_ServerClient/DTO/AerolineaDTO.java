package DTO;

public class AerolineaDTO {
	
	private int idAerolinea;
    private String nombreAerolinea;
    private boolean pago;
    
	public int getIdAerolinea() {
		return idAerolinea;
	}
	public void setIdAerolinea(int idAerolinea) {
		this.idAerolinea = idAerolinea;
	}
	public String getNombreAerolinea() {
		return nombreAerolinea;
	}
	public void setNombreAerolinea(String nombreAerolinea) {
		this.nombreAerolinea = nombreAerolinea;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	@Override
	public String toString() {
		return "AerolineaDTO [idAerolinea=" + idAerolinea + ", nombreAerolinea=" + nombreAerolinea + ", pago=" + pago
				+ "]";
	} 

    
    
}
