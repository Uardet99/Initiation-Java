package Bucles;

import javax.swing.*;

public class Bucles_3 {

	public static void main(String[] args) {
		// Ahora vamos a ver el bucle do while

		String genero = "";

		do {
			genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
		} while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm: "));
		int pesoIdeal = 0;

		if (genero.equals("H")) {
			pesoIdeal = altura - 110;
		} else if (genero.equals("M")) {
			pesoIdeal = altura - 120;
		}

		System.out.println("Tu peso ideal es " + pesoIdeal + " kg" + "");
	}

}
