package granja;

public class Animal {

	private String nombre;
	private double peso;
	private int edad;
	
	
	public String mostrarDatos() {
		
		return nombre + " : " + " peso: " + peso + " Kg, " + " edad: " + edad + " anyos";
		
	}
	
	
	//Constructores
	public Animal(String nombre, double peso, int edad) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
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
