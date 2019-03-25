package es.studium.Ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class ControladorEjercicio3 implements ActionListener{
	VistaEjercicio3 objVista = null; 
	ModeloEjercicio3 objModelo = null;
 
	/* Constructor */
	public ControladorEjercicio3(VistaEjercicio3 objVista, ModeloEjercicio3 objModelo) {
		this.objVista = objVista;
		this.objModelo = objModelo; 
 
		/* Añadimos los escuchadores */
		objVista.addWindowListener((WindowListener) this); 
		objVista.btnCalcular.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(objVista.btnCalcular.equals(e.getSource())) {
			objModelo.mcm();
			objModelo.mcd();
		}
		
	}

}
