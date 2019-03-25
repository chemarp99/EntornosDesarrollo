package es.studium.Ejercicio2;

public class Ejercicio2Main {
	
	public static void main(String[] args) { 
		/* Creamos dos objetos Vista y Modelo */
		Ejercicio2Vista Vista = new Ejercicio2Vista();
		Ejercicio2Modelo Modelo = new Ejercicio2Modelo();
		
		/* Instanciamos un objeto de la clase Controlador */
		new Ejercicio2Controlador(Vista, Modelo); 
	}
}
