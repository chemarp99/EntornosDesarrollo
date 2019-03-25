package es.studium.Ejercicio4;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.JFrame;

public class VistaEjercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;

	Label lblNumero = new Label("Número:");
	Label lblPalabra = new Label("Palabra:");
	Label lblResultado = new Label("Resultado:");
	Button btnBuscar = new Button("Buscar");
	TextField txtNumero = new TextField(15);
	TextField txtPalabra = new TextField(15);
	TextField txtResultado = new TextField(15);
	Panel pnlPanel = new Panel();
	Panel pnlPanel1 = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	String t="Memoria";
	
	VistaEjercicio4() {
		setTitle(t);
		setLayout(new GridLayout(4,1));
		setBounds(500,250,400,180);
		pnlPanel.setLayout(new FlowLayout());
		pnlPanel1.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		txtResultado.setEditable(false);
		pnlPanel1.add(lblNumero);
		pnlPanel2.add(lblPalabra);
		pnlPanel3.add(lblResultado);
		pnlPanel3.add(txtResultado);
		pnlPanel1.add(txtNumero);
		pnlPanel2.add(txtPalabra);
		pnlPanel.add(btnBuscar);
		add(pnlPanel1, "Center");
		add(pnlPanel2, "Center");
		add(pnlPanel3, "Center");
		add(pnlPanel, "Center");
	}
}