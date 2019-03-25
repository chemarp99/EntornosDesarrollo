package es.studium.Ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class Ejercicio2Controlador implements ActionListener{
	Ejercicio2Vista objVista = null; 
	Ejercicio2Modelo objModelo = null;
 
	/* Constructor */
	public Ejercicio2Controlador(Ejercicio2Vista objVista, Ejercicio2Modelo objModelo) {
		this.objVista = objVista;
		this.objModelo = objModelo; 
 
		/* Añadimos los escuchadores */
		objVista.addWindowListener((WindowListener) this); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(objVista.btnCelsius.equals(e.getSource())) {
			objModelo.convCelsius();
		}else {
			objModelo.convFarenheits();
		}
		
	}

}
