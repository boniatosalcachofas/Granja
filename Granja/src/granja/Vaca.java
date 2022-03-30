package granja;

public class Vaca extends Animal {
	
	//True == leche
	private boolean usoAnimal;
	
	
	public String mostrarDatosCompletos() {
		if(this.usoAnimal) {
		
			return this.getNombre() + " : " + " peso: " + this.getPeso() + " Kg, " + " edad: " + this.getEdad() + " anyos  uso: leche";
		
		}else {
			
			return this.getNombre() + " : " + " peso: " + this.getPeso() + " Kg, " + " edad: " + this.getEdad() + " anyos  uso: carne";
		
		}
		
		
	}
	
	
	//Constructores
	public Vaca(String nombre, double peso, int edad, boolean usoAnimal) {
		super(nombre, peso, edad);
		this.usoAnimal = usoAnimal;
	}

	//Getters and setters
	public boolean isUsoAnimal() {
		return usoAnimal;
	}

	public void setUsoAnimal(boolean usoAnimal) {
		this.usoAnimal = usoAnimal;
	}
	
}
