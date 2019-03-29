package es.studium.Contador;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;

import javax.swing.JFrame;

public class VistaContador extends JFrame {

	private static final long serialVersionUID = 1L;

	Label lblResultado = new Label("");
	TextArea txtResultado = new TextArea(10,50);
	Panel pnlPanel = new Panel();
	Panel pnlPanel1 = new Panel();
	String t="Contador de palabras";
	
	VistaContador() {
		setTitle(t);
		setLayout(new GridLayout(2,1));
		setBounds(500,250,400,400);
		pnlPanel.setLayout(new FlowLayout());
		pnlPanel1.setLayout(new FlowLayout());
		pnlPanel1.add(lblResultado);
		pnlPanel.add(txtResultado);
		add(pnlPanel, "Center");
		add(pnlPanel1, "Center");
		setVisible(true);
	}
}