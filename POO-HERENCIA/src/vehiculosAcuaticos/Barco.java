package vehiculosAcuaticos;

public class Barco extends Acuatico {
	
	private String colorBarco="";
	
	public String prenderMotor() {
		return "El vehiculo: "+getNombreVehiculo() + " esta encendiendo motores";
	}

	public String getColorBarco() {
		return colorBarco;
	}

	public void setColorBarco(String colorBarco) {
		this.colorBarco = colorBarco;
	}
	
	
	@Override
	public String toString() {
		return "INFORMACION BARCO\n\n"
				+ "Nombre Vehiculo= " + getNombreVehiculo() + "\n"
				+ "Nombre Acuatico= " + getNombreAcuatico() + "\n"
				+ "Color de Barco= " + getColorBarco() + "\n"
				+ "Modelo de Barco= " + getModeloVehiculo() + "\n"
				+ prenderMotor() + "\n"
				+ navegar() + "\n"
				+ "\n";
			
	}
	
	

}
