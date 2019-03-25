package es.studium.Ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorEjercicio4 implements ActionListener, WindowListener{
	VistaEjercicio4 objVista = null; 
	ModeloEjercicio4 objModelo = null;
 
	/* Constructor */
	public ControladorEjercicio4(VistaEjercicio4 objVista, ModeloEjercicio4 objModelo) {
		this.objVista = objVista;
		this.objModelo = objModelo; 
		objVista.setVisible(true);
		/* Añadimos los escuchadores */
		objVista.addWindowListener(this);
		objVista.btnBuscar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(objVista.btnBuscar.equals(e.getSource())) {
			if(objVista.txtNumero.getText().equals("")) {
				Integer numero = objModelo.buscaPalabra(objVista.txtPalabra.getText());
				objVista.txtResultado.setText(numero.toString());
			}if(objVista.txtPalabra.getText().equals("")) {
				String palabra = objModelo.buscaNumero(Integer.parseInt(objVista.txtNumero.getText()));
				objVista.txtResultado.setText(palabra);
			}
		}
		
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

}
