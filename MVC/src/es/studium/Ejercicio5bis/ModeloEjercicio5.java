package es.studium.Ejercicio5bis;

import java.util.LinkedList;

public class ModeloEjercicio5 {
	
	public static LinkedList<Integer> descomponEnFactoresPrimos(int valor)
	{
		assert valor>1;
		
		// Se empieza probando como posible factor primo el 2.
		int factor = 2;
		LinkedList<Integer> factores=new LinkedList<Integer>();
		
		while (factor <= valor)
		{
			// Mientras es divisible, se añade el factor a la lista de factores primos
			// y se realiza la división.
			while (valor % factor == 0 )
			{
				factores.add(new Integer(factor));
				valor = valor/factor;
			}
			
			// Si no es divisible, se pasa al posible siguiente factor.
			factor++;
		}
		
		return factores;
	}
}
