package granja;

public class Principal {
	
	public static Vaca arrayVaca[] = new Vaca[3];
	public static Cerdo cerdo;
	public static Oveja arrayOveja[] = new Oveja[3];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arrayVaca[0] = new Vaca("Romera", 230.5, 3, true);
		arrayVaca[1] = new Vaca("Facunda", 205.2, 3, false);
		arrayVaca[2] = new Vaca("Fina", 245.4, 4, true);
		
		cerdo = new Cerdo("Petro", 90.2, 2, "Rosado");
		
		arrayOveja[0] = new Oveja("Mota", 40, 3, true);
		arrayOveja[1] = new Oveja("Coral", 50, 4, false);
		arrayOveja[2] = new Oveja("Cebra", 37.6, 1, true);
		
		menuPrincipal();
		
	}
	
	public static void menuPrincipal() {
		
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
		
	}

}
