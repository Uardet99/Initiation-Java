package Bucles;

import java.util.*;

public class Bucles_2 {

	public static void main(String[] args) {

		int numAleatorio = (int) (Math.random() * 100);

		Scanner entrada = new Scanner(System.in);

		int numero = 0, intentos = 0;

		while (numero != numAleatorio) {

			System.out.println("Introduce un numero:");

			numero = entrada.nextInt();

			if (numAleatorio < numero) {
				System.out.println("Mas bajo");
			} else if (numAleatorio > numero) {
				System.out.println("Mas alto");
			}

			intentos++;
		}

		System.out.println("Numero correcto. Lo has conseguido en " + intentos + " intentos");

	}

}
