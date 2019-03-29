package es.studium.Contador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorContador implements ActionListener, WindowListener, TextListener{
	VistaContador objVista = null; 
	ModeloContador objModelo = null;
 
	/* Constructor */
	public ControladorContador(VistaContador objVista, ModeloContador objModelo) {
		this.objVista = objVista;
		this.objModelo = objModelo; 
		objVista.setVisible(true);
		/* Añadimos los escuchadores */
		objVista.addWindowListener(this);
		objVista.txtResultado.addTextListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void textValueChanged(TextEvent arg0) {
		if(objVista.txtResultado.equals(arg0.getSource())) {
			objVista.lblResultado.setText((objModelo.contarPalabras(objVista.txtResultado.getText()).toString()));

		}
		
	}

}
