package es.studium.Ejercicio2;

public class Ejercicio2Modelo {
	
	Ejercicio2Vista vista = null;
	
	public void convCelsius() {
		
		Double a;
		String t = "";
		try{
			a=Double.parseDouble(vista.txtCampo1.getText());
			a=(a - 32) * 5 / 9;
			t = String.valueOf(a);
			vista.txtCampo.setText(t);
		}catch(IllegalArgumentException e) {
			System.out.println("Introduzca solo números");
		}
		
		
	}public void convFarenheits() {
		Double a;
		String t = "";
		try{
		a=Double.parseDouble(vista.txtCampo.getText());
		a=(a * 9/5) + 32;
		t = String.valueOf(a);
		vista.txtCampo1.setText(t);
		}catch(IllegalArgumentException e) {
			System.out.println("Introduzca solo números");
		}
	}
}
