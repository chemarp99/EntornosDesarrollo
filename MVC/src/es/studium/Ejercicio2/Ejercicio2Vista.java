package es.studium.Ejercicio2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio2Vista extends Frame implements WindowListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Label lblEtiqueta2 = new Label("Celsius:");
	Label lblEtiqueta3 = new Label("Farenheit:");
	Button btnCelsius = new Button("Conv. a Celsius");
	Button btnFarenheit = new Button("Conv. a Farenheit");
	TextField txtCampo = new TextField(15);
	TextField txtCampo1 = new TextField(15);
	Panel pnlPanel = new Panel();
	Panel pnlPanel1 = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	String t="a";
	Double conv1;
	
	
	
	Ejercicio2Vista(){
		setTitle(t);
		setLayout(new GridLayout(4,1));
		//setSize(400,150);
		//setLocation(500,250);
		//Es un setSize + setLocation junto. (x,y,w,h)
		setBounds(500,250,400,150);
		pnlPanel.setLayout(new FlowLayout());
		pnlPanel1.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		pnlPanel1.add(lblEtiqueta2);
		pnlPanel2.add(lblEtiqueta3);
		pnlPanel3.add(btnCelsius);
		pnlPanel3.add(btnFarenheit);
		pnlPanel1.add(txtCampo);
		pnlPanel2.add(txtCampo1);
		add(pnlPanel, "Center");
		add(pnlPanel1, "Center");
		add(pnlPanel2, "Center");
		add(pnlPanel3, "Center");
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
