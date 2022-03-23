package Bucles;

import javax.swing.JOptionPane;

public class Bucles_4 {

	public static void main(String[] args) {
		// En esta clase vamos a ver el bucle for

//		for (int i = 0; i < 10; i++) {
//			System.out.println("Edu");
//		}

//		int contador = 0;
//		
//		for (int i = 10; i > 0; i--) {
//			contador++;
//			System.out.println(contador + ". Edu");
//		}

		// 1. Este algoritmo lo que haces es recorrer un email mediante el bucle for y
		// si contiene un @ nos dira que el email es correcto y sino que no es correcto
//		boolean arroba = false;
//		String email = JOptionPane.showInputDialog("Introduce tu email: ");
//
//		for (int i = 0; i < email.length(); i++) {
//
//			if (email.charAt(i) == '@') {
//				arroba = true;
//			}
//
//		}
//		if (arroba == true) {
//			System.out.println("El email es correcto y tiene " + email.length() + " caracteres");
//		} else {
//			System.out.println("El email no es correcto");
//		}

		
		
		
		
		// 2. En este algoritmo lo que hace es lo mismo que el anterior, a diferencia de
		// que si un email contiene mas de una @ y mas de un punto, no sera correcto.
		int arroba = 0;
		int punto = 0;
		String email = JOptionPane.showInputDialog("Introduce tu email: ");

		for (int i = 0; i < email.length(); i++) {

			if (email.charAt(i) == '@') {
				arroba++;
			}
			if (email.charAt(i) == '.') {
				punto++;
			}

		}

		if (arroba == 1 && punto == 1) {
			System.out.println("El email es correcto y tiene " + email.length() + " caracteres");
		} else {
			System.out.println("El email no es correcto");
		}
	}

}
