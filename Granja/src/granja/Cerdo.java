package granja;

import java.util.Scanner;

public class Cerdo extends Animal {
	
	private String colorPiel;
	
	
	public void comprarCerdo() {
		
		Scanner scLine = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		
		System.out.println("Nombre del cerdo:");
		this.setNombre(scLine.nextLine());
		System.out.println("Edad del cerdo");
		this.setEdad(scInt.nextInt());
		System.out.println("Peso del cerdo");
		this.setPeso(scInt.nextDouble());
		System.out.println("Color de piel del cerdo");
		this.colorPiel = scLine.nextLine();
		
	}


	public String mostrarDatosCompletos() {
		
			return this.getNombre() + " : " + " peso: " + this.getPeso() + " Kg, " + " edad: " + this.getEdad() + " anyos  colorPiel: " + this.colorPiel;
	}
	//Constructores
	public Cerdo(String nombre, double peso, int edad, String colorPiel) {
		super(nombre, peso, edad);
		this.colorPiel = colorPiel;
	}
	

	public Cerdo() {
		super();
	}


	//getters and setters
	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	
}
