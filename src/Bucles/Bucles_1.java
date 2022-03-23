package Bucles;

import javax.swing.*;

public class Bucles_1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		String clave = "Edu";

		String pass = "";

		while (clave.equals(pass) == false) {

			pass = JOptionPane.showInputDialog("Introduce tu contraseña");

			if (clave.equals(pass) == false) {
				System.out.println("La contraseña es incorrecta");
			}

		}

		System.out.println("Contraseña correcta");
	}

}
