package es.studium.Ejercicio1;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class VistaEjercicio1 extends Frame{
	Checkbox chkComprobacion = new Checkbox("Uno");
	Checkbox chkComprobacion1 = new Checkbox("Dos");
	Checkbox chkComprobacion2 = new Checkbox("Tres");
	Checkbox chkComprobacion3 = new Checkbox("Cuatro");
	Checkbox chkComprobacion4 = new Checkbox("Cinco");
	Checkbox chkComprobacion5 = new Checkbox("Seis");
	Checkbox chkComprobacion6 = new Checkbox("Siete");
	Checkbox chkComprobacion7 = new Checkbox("Ocho");
	Checkbox chkComprobacion8 = new Checkbox("Nueve");
	Checkbox chkComprobacion9 = new Checkbox("Diez");
	Button btnAceptar = new Button("Aceptar");
	
	Panel pnlPanel = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	Panel pnlPanel4 = new Panel();
	Panel pnlPanel5 = new Panel();
	Panel pnlPanel6 = new Panel();
	Panel pnlPanel7 = new Panel();
	Panel pnlPanel8 = new Panel();
	Panel pnlPanel9 = new Panel();
	Panel pnlPanel10 = new Panel();

	private static final long serialVersionUID = 1L;
	VistaEjercicio1(String t){
		setTitle(t);
		setLayout(new GridLayout(8,1));
		//Es un setSize + setLocation junto. (x,y,w,h)
		setBounds(500,250,400,300);
	}

}
