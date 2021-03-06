package granja;

public class Animal {

	private String nombre;
	private double peso;
	private int edad;
	
	
	public String mostrarDatos() {
		
		return nombre + " : " + " peso: " + peso + " Kg, " + " edad: " + edad + " anyos";
		
	}
	
	public void sumarEdad() {
		
		edad = edad + 1;
		
		System.out.println(nombre + " ahora tiene " + edad + " anyos");
		
	}
	
	public void cambiarPesoAnimal(double nuevoPeso) {
		
		if(nuevoPeso > peso)System.out.println(nombre + " ha ganado " + (nuevoPeso - peso) + " Kg");
		else if(peso > nuevoPeso)System.out.println(nombre + " ha perdido " + (peso - nuevoPeso) + " Kg");
		else System.out.println(nombre + " no ha variado en su peso");
		
		peso = nuevoPeso;
		
	}
	//Constructores
	public Animal(String nombre, double peso, int edad) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
	}
	
	public Animal() {
		super();
	}

	//Getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
