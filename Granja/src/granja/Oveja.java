package granja;

public class Oveja extends Animal {
	//true == rizado
	private boolean tipoPiel;

	
	
	//Constructores
	public Oveja(String nombre, double peso, int edad, boolean tipoPiel) {
		super(nombre, peso, edad);
		this.tipoPiel = tipoPiel;
	}

	//Getters and setters
	public boolean isTipoPiel() {
		return tipoPiel;
	}

	public void setTipoPiel(boolean tipoPiel) {
		this.tipoPiel = tipoPiel;
	}
	
	
	
}
