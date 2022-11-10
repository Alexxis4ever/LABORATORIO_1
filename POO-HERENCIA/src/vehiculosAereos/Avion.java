package vehiculosAereos;

public class Avion extends Aereo {

	private String colorAvion="";

	public String bajartrenDeAterrizaje() {
		return "El "+getNombreVehiculo()+" esta bajando el tren de aterrizaje";
	}

	public String getColorAvion() {
		return colorAvion;
	}

	public void setColorAvion(String colorAvion) {
		this.colorAvion = colorAvion;
	}
	
	@Override
	public String toString() {
		return "INFORMACION Avion\n\n"
				+ "Nombre Vehiculo= " + getNombreVehiculo() + "\n"
				+ "Nombre Acuatico= " + getNombreAereo() + "\n"
				+ "Color de Avion= " + getColorAvion() + "\n"
				+ "Modelo de Avion= " + getModeloVehiculo() + "\n"
				+ bajartrenDeAterrizaje() + "\n"
				+ volar() + "\n"
				+ "\n";
	}
	
	
}
