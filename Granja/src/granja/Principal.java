package granja;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static Vaca arrayVaca[] = new Vaca[3];
	public static Cerdo cerdo;
	public static Oveja arrayOveja[] = new Oveja[3];
	public static Animal animalesTotales[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arrayVaca[0] = new Vaca("Romera", 230.5, 3, true);
		arrayVaca[1] = new Vaca("Facunda", 205.2, 3, false);
		arrayVaca[2] = new Vaca("Fina", 245.4, 4, true);
		
		cerdo = new Cerdo("Petro", 90.2, 2, "Rosado");
		
		arrayOveja[0] = new Oveja("Mota", 40, 3, true);
		arrayOveja[1] = new Oveja("Coral", 50, 4, false);
		arrayOveja[2] = new Oveja("Cebra", 37.6, 1, true);
		
		animalesTotales = crearArray();
		while(true) {
			menuPrincipal();
		}
		
		
	}
	
	public static void menuPrincipal() {
		//posible error
		Scanner scInt = new Scanner(System.in);
		
		System.out.println("MENU PRINCIPAL\n"
				+ "1.- Listado de animales\n"
				+ "2.- Mostrar tipo de animal\n"
				+ "3.- Sumar anyo a un animal\n"
				+ "4.- Cambiar peso animal\n"
				+ "5.- Marcar animal como muerto\n"
				+ "6.- Adquirir nuevo cerdo\n"
				+ "7.- Listado de animales completo\n"
				+ "8.- Obtencion de leche\n"
				+ "9.- Venta de leche");
		
		int eleccion = scInt.nextInt();
		
		switch (eleccion) {
		
		case 1: listadoAnimales();
		break;
		
		case 2: mostrarTipoAnimal();
		break;
		
		case 3: sumarAnyo();
		break;
		
		case 4: cambiarPeso();
		break;
		
		case 5: matarAnimal();
		break;
		
		case 6: adquirirCerdo();
		break;
		
		case 7: mostrarListadoCompleto();
		break;
		
		case 8: break;
		
		case 9: break;
		}
	}
	
	public static void listadoAnimales() {
		
		
		
		System.out.println("LISTADO DE ANIMALES");

		for (int i = 0; i < animalesTotales.length; i++) {

			if(animalesTotales[i] != null)System.out.println(animalesTotales[i].mostrarDatos());

		}
		
		volverMenu();
		
	}
	
	public static void mostrarTipoAnimal() {

		//posible error
		Scanner scInt = new Scanner(System.in);
		
		int contador = 1;

		for(int i = 0; i < animalesTotales.length; i++) {
			
			if(animalesTotales[i] != null)System.out.println((i+contador) + ".- " + animalesTotales[i].getNombre()); 
			
			else contador--;
			
		}
		
		int eleccion = scInt.nextInt()-1;
		
		
		for(int i = 0; i<animalesTotales.length; i++) {
			
			
			if(animalesTotales[i] == null) eleccion++;
			if(i == eleccion) {
				
				if(animalesTotales[i] instanceof Vaca) System.out.println(animalesTotales[i].getNombre() + " es una vaca");
				else if(animalesTotales[i] instanceof Oveja) System.out.println(animalesTotales[i].getNombre() + " es una oveja");
				else if(animalesTotales[i] instanceof Cerdo) System.out.println(animalesTotales[i].getNombre() + " es un cerdo");
				break;
			}
			
			if(i == animalesTotales.length-1) System.out.println("Animal no existente");
			
		}
		
		volverMenu();
	}
	
	public static void sumarAnyo() {
		
		//posible error
		Scanner scInt = new Scanner(System.in);
		
		int contador = 1;
		
		for (int i = 0; i < animalesTotales.length; i++) {

			if(animalesTotales != null)System.out.println((i + contador) + ".- " + animalesTotales[i].getNombre() + " edad: " + animalesTotales[i].getEdad()); 
			
			else contador--;
		}

		System.out.println("Elija el animal");
		int eleccion = scInt.nextInt()-1;

		for (int i = 0; i < animalesTotales.length; i++) {

			if (animalesTotales[i] == null)eleccion++;
			if (i == eleccion) {
				
				animalesTotales[i].sumarEdad();
				break;
				
				
			}
			if(i == animalesTotales.length-1) System.out.println("Animal no existente");
		}
		
		volverMenu();
	}
	
	
	public static void cambiarPeso() {

		// posible error
		Scanner scInt = new Scanner(System.in);
		
		int contador = 1;

		for (int i = 0; i < animalesTotales.length; i++) {

			if (animalesTotales != null)
				System.out.println(
						(i + contador) + ".- " + animalesTotales[i].getNombre() + " edad: " + animalesTotales[i].getEdad()); 
			
			else contador--;

		}

		System.out.println("Elija el animal");
		int eleccion = scInt.nextInt()-1;
		
		for (int i = 0; i < animalesTotales.length; i++) {

			if (animalesTotales[i] == null)eleccion++;
			if (i == eleccion) {
				
				double nuevoPeso = scInt.nextDouble();
				
				animalesTotales[i].cambiarPesoAnimal(nuevoPeso);
				break;
				
			}
			if(i == animalesTotales.length-1) System.out.println("Animal no existente");
		}
		
		volverMenu();

	}
	
	
	public static void matarAnimal() {
		
		// posible error
				Scanner scInt = new Scanner(System.in);
				
				int contador = 1;

				for (int i = 0; i < animalesTotales.length; i++) {

					if (animalesTotales[i] != null)
						System.out.println(
								(i + contador) + ".- " + animalesTotales[i].getNombre() + " edad: " + animalesTotales[i].getEdad()); 
					
					else contador--;

				}

				System.out.println("Elija el animal");
				int eleccion = scInt.nextInt()-1;
				
				for (int i = 0; i < animalesTotales.length; i++) {

					if (animalesTotales[i] == null)eleccion++;
					if (i == eleccion) {
						
						System.out.println("El animal " + animalesTotales[i].getNombre() + " ha muerto");
						animalesTotales[i] = null;
						break;
						
					}
					if(i == animalesTotales.length-1) System.out.println("Animal no existente");
				}
				
				volverMenu();
		
	}
	
	public static void adquirirCerdo() {
		
		boolean condicion = false;

		for (int i = 0; i < animalesTotales.length; i++) {

			if (animalesTotales[i] instanceof Cerdo) {

				System.out.println("hay cerdo");

				volverMenu();
				condicion = true;
			}
		}
		if (!condicion) {

			Cerdo cerdoNuevo = new Cerdo();
			cerdoNuevo.comprarCerdo();

			animalesTotales[6] = cerdoNuevo;
		}
		
		volverMenu();

	}
	
	public static void mostrarListadoCompleto() {
		
		System.out.println("LISTADO DE ANIMALES COMPLETO");
		
		for(int i = 0; i < animalesTotales.length; i++) {
			
			if(animalesTotales[i] instanceof Vaca) {Vaca vacaTemporal = (Vaca) animalesTotales[i]; System.out.println(vacaTemporal.mostrarDatosCompletos());}
			else if(animalesTotales[i] instanceof Oveja) {Oveja ovejaTemporal = (Oveja) animalesTotales[i]; System.out.println(ovejaTemporal.mostrarDatosCompletos());}
			else if(animalesTotales[i] instanceof Cerdo) {Cerdo cerdoTemporal = (Cerdo) animalesTotales[i]; System.out.println(cerdoTemporal.mostrarDatosCompletos());}
			
		}
		
		volverMenu();
		
	}
	
	

	public static Animal[] crearArray() {
		Animal animales[] = new Animal[7];

		for (int i = 0; i < arrayVaca.length; i++) {

			animales[i] = arrayVaca[i];

		}
		for (int i = 0; i < arrayOveja.length; i++) {

			animales[i+arrayVaca.length] = arrayOveja[i];

		}
		animales[animales.length-1] = cerdo;
		
		return animales;
	}

	public static void volverMenu() {
		//posible error
		Scanner scLine = new Scanner(System.in);
		
		System.out.println("\nPulse INTRO para volver al menu principal");
		scLine.nextLine();
	}
	
	
	
//	public static void pruebaEliminarAnimal() {
//		
//		int eleccion = 1;
//		arrayVaca[0] = null;
//		int variableAux = 0;
//		
//		for(int i = 0; i <arrayVaca.length; i++) {
//			
//			if(i != eleccion-1) arrayVaca[i] = arrayVaca[i+variableAux];
//			else variableAux++;
//		}
//		
		
	}


