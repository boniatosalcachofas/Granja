package granja;

public class Oveja extends Animal {
	//true == rizado
	private boolean tipoPiel;

	public String mostrarDatosCompletos() {
		if(this.tipoPiel) {
		
			return this.getNombre() + " : " + " peso: " + this.getPeso() + " Kg, " + " edad: " + this.getEdad() + " anyos  tipo de pelo: rizado";
		
		}else {
			
			return this.getNombre() + " : " + " peso: " + this.getPeso() + " Kg, " + " edad: " + this.getEdad() + " anyos  tipo de pelo: liso";
		
		}
		
		
	}
	
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
