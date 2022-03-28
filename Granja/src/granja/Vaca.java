package granja;

public class Vaca extends Animal {
	
	//True == leche
	private boolean usoAnimal;
	
	
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
