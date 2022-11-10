package vehiculosAereos;

public class Helicoptero extends Aereo {
	
private String colorHelicoptero="";
	
	public String encenderHelices() {
		return "El "+getNombreVehiculo()+" esta encendiendo helices";
	}

	public String getColorHelicoptero() {
		return colorHelicoptero;
	}

	public void setColorHelicoptero(String colorHelicoptero) {
		this.colorHelicoptero = colorHelicoptero;
	}

	@Override
	public String toString() {
		return "INFORMACION Avion\n\n"
				+ "Nombre Vehiculo= " + getNombreVehiculo() + "\n"
				+ "Nombre Acuatico= " + getNombreAereo() + "\n"
				+ "Color de Avion= " + getColorHelicoptero() + "\n"
				+ "Modelo de Avion= " + getModeloVehiculo() + "\n"
				+ encenderHelices() + "\n"
				+ volar() + "\n"
				+ "\n";
	}

}
