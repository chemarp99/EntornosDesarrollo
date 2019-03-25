package es.studium.Ejercicio3;

public class MainEjercicio3 {
	public static void main(String[] args) {
		/* Creamos dos objetos Vista y Modelo */
		VistaEjercicio3 Vista = new VistaEjercicio3();
		ModeloEjercicio3 Modelo = new ModeloEjercicio3();
		
		/* Instanciamos un objeto de la clase Controlador */
		new ControladorEjercicio3(Vista, Modelo); 
	}
}
