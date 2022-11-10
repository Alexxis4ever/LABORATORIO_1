package Procesos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import vehiculosAcuaticos.Barco;
import vehiculosAcuaticos.Velero;
import vehiculosAereos.Avion;
import vehiculosAereos.Helicoptero;

public class Procesos {
	
	ArrayList<Barco> listaBarcos = new ArrayList<Barco>();
	ArrayList<Velero> listaVeleros = new ArrayList<Velero>();
	ArrayList<Helicoptero> listaHelicopteros = new ArrayList<Helicoptero>();
	ArrayList<Avion> listaAviones = new ArrayList<Avion>();
	

	public Procesos() {
		imprimirMenu();
	}

	private void imprimirMenu() {
		
		String menu = "CREAR VEHICULO\n";
		menu += "1. Crear Barco\n";
		menu += "2. Crear Velero\n";
		menu += "3. Crear Avion\n";
		menu += "4. Crear Helicoptero\n";
		menu += "5. Imprimir Listas\n";
		menu += "6. Salir\n";
		menu += "Ingrese una opcion";
		
		int cod=0;
		
		do {
			cod = Integer.parseInt(JOptionPane.showInputDialog(menu));
			presentarMenu(cod);
			System.out.println();
		} while (cod!=6);
		
		System.out.println("Termina...");
		
	}


	private void presentarMenu(int cod) {
		
		switch (cod) {
		case 1:
			crearBarco();
			break;
		case 2:
			crearVelero();
			break;
		case 3:
			crearAvion();
			break;
		case 4:
			crearHelicoptero();
			break;
		case 5:
			imprimirListas();
			break;
		case 6:
			System.out.println("Hasta luego");
			break;
		default:
			System.out.println("El codigo no existe");
			break;
		}
		
	}

	

	private void crearBarco() {
		
		Barco miBarco = new Barco();
		
		miBarco.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el nombre de su vehiculo"));
		miBarco.setNombreAcuatico(JOptionPane.showInputDialog("Ingrese el nombre de su vehiculo Acuatico"));
		miBarco.setColorBarco(JOptionPane.showInputDialog("Ingrese el color de su vehiculo"));
	
		
		miBarco.setModeloVehiculo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese modelo de su vehiculo")));
		
		
		System.out.println(miBarco);
		listaBarcos.add(miBarco);
		
		
		
	}
	
	
	private void crearVelero() {
		
		Velero miVelero = new Velero();
		
		miVelero.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el nombre de su vehiculo"));
		miVelero.setNombreAcuatico(JOptionPane.showInputDialog("Ingrese el nombre de su Acuatico"));
		miVelero.setColorVelero(JOptionPane.showInputDialog("Ingrese el color de su vehiculo"));
		
		miVelero.setModeloVehiculo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese modelo de su vehiculo")));
		
		
		System.out.println(miVelero);
		listaVeleros.add(miVelero);
		
		
	
	}
	
	
	private void crearHelicoptero() {
		
		Helicoptero miHelicoptero = new Helicoptero();
		
		miHelicoptero.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el nombre de su vehiculo"));
		miHelicoptero.setNombreAereo(JOptionPane.showInputDialog("Ingrese el nombre de su Aereo"));
		miHelicoptero.setColorHelicoptero(JOptionPane.showInputDialog("Ingrese el color de su vehiculo"));
		
		miHelicoptero.setModeloVehiculo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese modelo de su vehiculo")));
		
		System.out.println(miHelicoptero);
		listaHelicopteros.add(miHelicoptero);
		
		
	}


	private void crearAvion() {
		
		Avion miAvion = new Avion();
		
		miAvion.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el nombre de su vehiculo"));
		miAvion.setNombreAereo(JOptionPane.showInputDialog("Ingrese el nombre de su Aereo"));
		miAvion.setColorAvion(JOptionPane.showInputDialog("Ingrese el color de su vehiculo"));
		
		miAvion.setModeloVehiculo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese modelo de su vehiculo")));
		
		listaAviones.add(miAvion);
		System.out.println(miAvion);
		
	}


	private void imprimirListas() {
		
		String menu2="MENU IMPRIMIR\n";
		menu2+= "n1. Barcos\n";
		menu2+= "n2. Veleros\n";
		menu2+= "n3. Aviones\n";
		menu2+= "n4. Helicopteros\n";
				
		
		int opc=Integer.parseInt(JOptionPane.showInputDialog(menu2));
		
		switch (opc) {
		
		case 1:imprimirBarco();
			break;
		case 2: imprimirVelero();
			break;
		case 3: imprimirAvion();
			break;
		case 4: imprimirHelicoptero();
			break;
			
		default:System.out.println("No es una opcion valida");
			break;
			
		}
	}

	
	
	private void imprimirBarco() {
		
		String msj="";
		System.out.println("********************");
		for (int i = 0; i < listaBarcos.size(); i++) {
			
			msj+="Nombre: "+listaBarcos.get(i).getNombreVehiculo()+"\n";
			msj+="Color: "+listaBarcos.get(i).getColorBarco()+"\n";
			msj+="Modelo: "+listaBarcos.get(i).getModeloVehiculo()+"\n\n";
			
		}
		System.out.println(msj);
		
		
	}
	
	private void imprimirVelero() {
		
		String msj="";
		System.out.println("********************");
		for (int i = 0; i < listaVeleros.size(); i++) {
			
			msj+="Nombre: "+listaVeleros.get(i).getNombreVehiculo()+"\n";
			msj+="Color: "+listaVeleros.get(i).getColorVelero()+"\n";
			msj+="Modelo: "+listaVeleros.get(i).getModeloVehiculo()+"\n\n";
			
		}
		System.out.println(msj);
		
	}

	

	private void imprimirAvion() {
		
		String msj="";
		System.out.println("********************");
		for (int i = 0; i < listaAviones.size(); i++) {
			
			msj+="Nombre: "+listaAviones.get(i).getNombreVehiculo()+"\n";
			msj+="Color: "+listaAviones.get(i).getColorAvion()+"\n";
			msj+="Modelo: "+listaAviones.get(i).getModeloVehiculo()+"\n\n";
			
		}
		System.out.println(msj);
		
	}
	

	private void imprimirHelicoptero() {
		
		String msj="";
		System.out.println("********************");
		for (int i = 0; i < listaHelicopteros.size(); i++) {
			
			msj+="Nombre: "+listaHelicopteros.get(i).getNombreVehiculo()+"\n";
			msj+="Color: "+listaHelicopteros.get(i).getColorHelicoptero()+"\n";
			msj+="Modelo: "+listaHelicopteros.get(i).getModeloVehiculo()+"\n\n";
			
		}
		System.out.println(msj);
		
	}

}
