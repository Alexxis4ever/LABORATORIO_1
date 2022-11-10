package vehiculosAcuaticos;

public class Velero extends Acuatico{
	
	private String colorVelero="";

	public String izarVelas() {
		return "El velero: "+getNombreVehiculo()+" esta izando velas";
	}

	public String getColorVelero() {
		return colorVelero;
	}

	public void setColorVelero(String colorVelero) {
		this.colorVelero = colorVelero;
	}
	
	@Override
	public String toString() {
		return "INFORMACION VELERO\n\n"
				+ "Nombre Vehiculo= " + getNombreVehiculo() + "\n"
				+ "Nombre Acuatico= " + getNombreAcuatico() + "\n"
				+ "Color de Velero= " + getColorVelero() + "\n"
				+ "Modelo de Velero= " + getModeloVehiculo() + "\n"
				+ izarVelas() + "\n"
				+ navegar() + "\n"
				+ "\n";
	}

}
