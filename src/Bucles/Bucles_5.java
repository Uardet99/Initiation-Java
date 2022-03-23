package Bucles;

import javax.swing.JOptionPane;

public class Bucles_5 {

	public static void main(String[] args) {
		// Este algortimo va a calcurarmos el factorial de un numero. El numero factorial es: 6! = 6x5x4x3x2x1 y su resultado seria 720

		
		int resultado = 1;
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		for (int i = n; i > 0; i--) {
			resultado = resultado * i;
		}
		
		JOptionPane.showMessageDialog(null,"El factorial de " + n + " es: " + resultado);
	}

}
