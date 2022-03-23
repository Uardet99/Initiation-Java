package EntradaSalidaDatos;

import javax.swing.JOptionPane;

public class Entrada_numeros {

	public static void main(String[] args) {
	
		
		double x = 10000.0;
		
		
		// Esto hace que nos saque 2 decimales
		//System.out.printf("%1.2f", x/3);

		String num1 = JOptionPane.showInputDialog("Introduce un numero");
		
		double num2 = Double.parseDouble(num1);
		
		System.out.print("La raiz de " + num2 + " es ");
		
		System.out.printf("%1.2f", Math.sqrt(num2));
		
	}

}
