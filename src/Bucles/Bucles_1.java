package Bucles;

import javax.swing.*;

public class Bucles_1 {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente

		String clave = "Edu";

		String pass = "";

		while (clave.equals(pass) == false) {

			pass = JOptionPane.showInputDialog("Introduce tu contrase�a");

			if (clave.equals(pass) == false) {
				System.out.println("La contrase�a es incorrecta");
			}

		}

		System.out.println("Contrase�a correcta");
	}

}
