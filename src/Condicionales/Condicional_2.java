package Condicionales;
import java.util.*;
import javax.swing.*;

public class Condicional_2 {

	public static void main(String[] args) {
		// Aqui vemos el condicional switch
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Elige una opci�n: \n1 - Cuadrado \n2 - Rectangulo \n3 - Triangulo \n4 - C�rculo");

	
	int figura = entrada.nextInt();
	
	switch(figura) {
		
	case 1:
		int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tama�o del lado del cuadrado"));
		System.out.println("El lado del cuadrado es " + Math.pow(lado, 2));
		break;
	case 2:
		int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del rectangulo"));
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));	
		System.out.println("El area del rectangulo es " + base * altura);
		break;
	case 3:
		base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triangulo"));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));	
		System.out.println("El area del triangulo es " + (base * altura)/2 );
		break;
	case 4:
		int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del c�rculo"));
		System.out.println("El area del c�rculo es " + (Math.PI * (Math.pow(radio, 2))));
		break;
	default:
		System.out.println("No has introducido ninguna figura valida");
	}
	
	}

}
