package es.studium.Ejercicio3;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class VistaEjercicio3 extends Frame implements WindowListener {

	private static final long serialVersionUID = 1L;

	Label lblEtiqueta2 = new Label("Numeros Separados por comas:");
	Label lblEtiqueta3 = new Label("Máximo Común Divisor:");
	Label lblEtiqueta4 = new Label("Mínimo Común Múltiplo");
	Button btnCalcular = new Button("Calcular MCD y MCM");
	TextField txtCampo = new TextField(15);
	TextField txtCampo1 = new TextField(15);
	TextField txtCampo2 = new TextField(15);
	Panel pnlPanel = new Panel();
	Panel pnlPanel1 = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	String t="Mcd y Mcm";
	
	VistaEjercicio3() {
		setTitle(t);
		setLayout(new GridLayout(4,1));
		setBounds(500,250,400,150);
		pnlPanel.setLayout(new FlowLayout());
		pnlPanel1.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		pnlPanel1.add(lblEtiqueta2);
		pnlPanel2.add(lblEtiqueta3);
		pnlPanel3.add(lblEtiqueta4);
		pnlPanel3.add(txtCampo2);
		pnlPanel.add(btnCalcular);
		pnlPanel1.add(txtCampo);
		pnlPanel2.add(txtCampo1);
		add(pnlPanel1, "Center");
		add(pnlPanel2, "Center");
		add(pnlPanel3, "Center");
		add(pnlPanel, "Center");
		addWindowListener(this);
		setVisible(true);
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
		
	}

}