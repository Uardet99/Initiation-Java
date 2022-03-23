package EstructurasPrincipales;

public class Calculos_conMath {

	public static void main(String[] args) {

		// La clase Math.sqrt realiza la raiz cuadrada del número que coloquemos dentro
		// double raiz = Math.sqrt(9);

		// La clase Math.round redondea el número que introduzcamos
		// double num1 = 5.85;
		// int resultado = (int)Math.round(num1);

		// La clase Math.pow calcula la base y el exponente de un número. Las variables
		// deben de ser de tipo doble
		double base = 5;
		double exponente = 3;
		int resultado = (int) Math.pow(base, exponente);

		// Printamos los parametros
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);

	}

}
