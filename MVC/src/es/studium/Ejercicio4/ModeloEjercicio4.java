package es.studium.Ejercicio4;

public class ModeloEjercicio4 {
	
	String listaPalabras[] = {"Programaci�n", "Perro", "Insignia", "Numerable", "Autom�vil", "ACL", "Decronomic�n"};
	
	public int buscaPalabra(String palabra) {
		Integer res = 0;
		
			for(int i = 0; i < listaPalabras.length;i++) {
				if(listaPalabras[i].equals(palabra)) {
					res = i + 1;
				}
			
		}
		return res;
	}
	public String  buscaNumero(Integer num) {
		String res = "";
		res = listaPalabras[num-1];
		return res;
	}
}
