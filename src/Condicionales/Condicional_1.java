package Condicionales;

import java.util.Scanner;

public class Condicional_1 {

	public static void main(String[] args) {
		
		// En esta clase vemos los condicionales if, else, else if
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad por favor: ");
		
		int edad = entrada.nextInt();
		
//		if (edad >= 18) {
//			System.out.println("Eres mayor de edad");
//		}
//		else {
//			System.out.println("No eres mayor de edad");
//		}
		
		if (edad < 18) {
			System.out.println("Eres un adolescente");
		} else if (edad < 40) {
			System.out.println("Eres joven");
		} else if (edad < 65) {
			System.out.println("Eres una persona adulta");
		} else {
			System.out.println("Cuidate");
		}
			
	}

}
