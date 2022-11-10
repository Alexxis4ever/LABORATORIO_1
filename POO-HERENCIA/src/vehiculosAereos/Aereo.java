package vehiculosAereos;

import Procesos.Vehiculo;

public class Aereo extends Vehiculo {
	
	private String nombreAereo="";
	

	public String getNombreAereo() {
		return nombreAereo;
	}

	public void setNombreAereo(String nombreAereo) {
		this.nombreAereo = nombreAereo;
	}
	
	public String volar() {
	return  "El "+getNombreVehiculo()+" esta volando"; 
	}

}
