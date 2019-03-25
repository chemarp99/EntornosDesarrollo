package es.studium.Ejercicio3;

public class ModeloEjercicio3 {
	
	VistaEjercicio3 vista = null;
	
	public void mcd() {
		
		try{
			Integer num1, num2;
			Integer mcd = 0;
			num1 = Integer.parseInt(vista.txtCampo.getText().substring(0, 0)); 
			num2 = Integer.parseInt(vista.txtCampo.getText().substring(2, 2)); 
			int a = Math.max(num1, num2);
			int b = Math.min(num1, num2);
			while(b!=0) {
				mcd = b;
				b = a%b;
				a = mcd;
			}
			vista.txtCampo1.setText(mcd.toString());
			
		}catch(IllegalArgumentException e) {
			System.out.println("Introduzca solo números");
		}
		
		
		
	}public void mcm() {
		
		try{

			Integer mcm = 0;
			Integer num1, num2;
			num1 = Integer.parseInt(vista.txtCampo.getText().substring(0, 0)); 
			num2 = Integer.parseInt(vista.txtCampo.getText().substring(2, 2)); 
			int a = Math.max(num1, num2);
			int b = Math.min(num1, num2);
			Integer d = Integer.parseInt(vista.txtCampo1.getText().toString());
			mcm = (a/d)*b;
			vista.txtCampo2.setText(mcm.toString());
			
		}catch(IllegalArgumentException e) {
			System.out.println("Introduzca solo números");
		}
		
	}
	
}
