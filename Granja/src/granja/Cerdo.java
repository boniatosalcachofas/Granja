package granja;

public class Cerdo extends Animal {
	
	private String colorPiel;


	//Constructores
	public Cerdo(String nombre, double peso, int edad, String colorPiel) {
		super(nombre, peso, edad);
		this.colorPiel = colorPiel;
	}

	//getters and setters
	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	
}
