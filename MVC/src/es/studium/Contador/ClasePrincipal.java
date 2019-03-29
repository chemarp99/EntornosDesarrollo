package es.studium.Contador;

public class ClasePrincipal {

	public static void main(String[] args) {
		VistaContador Vista = new VistaContador();
		ModeloContador Modelo = new ModeloContador();
		new ControladorContador(Vista, Modelo);
	}
}
