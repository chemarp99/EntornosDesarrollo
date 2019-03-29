package es.studium.Contador;

import java.util.StringTokenizer;

public class ModeloContador {

	public Integer contarPalabras(String cadena) {
		StringTokenizer st = new StringTokenizer(cadena);
		Integer palabras = (st.countTokens());
		if(cadena.equals("")) {
			palabras = 0;
		}
		return palabras;
	}
}
