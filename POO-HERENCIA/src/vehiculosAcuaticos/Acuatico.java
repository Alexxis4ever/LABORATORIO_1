package vehiculosAcuaticos;

import Procesos.Vehiculo;

public class Acuatico extends Vehiculo {

	private String nombreAcuatico="";

	public String getNombreAcuatico() {
		return nombreAcuatico;
	}

	public void setNombreAcuatico(String nombreAcuatico) {
		this.nombreAcuatico = nombreAcuatico;
	}
	
	public String navegar() {
		return "El vehiculo: " +getNombreVehiculo() + " esta navegando";
	}
	
	
}
