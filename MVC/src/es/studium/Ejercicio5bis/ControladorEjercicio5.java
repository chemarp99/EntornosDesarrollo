package es.studium.Ejercicio5bis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class ControladorEjercicio5 implements ActionListener, WindowListener{
	VistaEjercicio5 objVista = null; 
	ModeloEjercicio5 objModelo = null;
 
	/* Constructor */
	public ControladorEjercicio5(VistaEjercicio5 objVista, ModeloEjercicio5 objModelo) {
		this.objVista = objVista;
		this.objModelo = objModelo; 
		objVista.setVisible(true);
		/* Añadimos los escuchadores */
		objVista.addWindowListener(this);
		objVista.btnCalcular.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(objVista.btnCalcular.equals(e.getSource())) {
			if(objVista.txtNumero.getText().equals("")) {
				objVista.txtResultado.setText("Error");
			}
			if(!objVista.txtNumero.getText().equals("")) {
				String resultado = ModeloEjercicio5.descomponEnFactoresPrimos(Integer.parseInt(objVista.txtNumero.getText())).toString();
				objVista.txtResultado.setText(resultado);
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
