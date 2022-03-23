package EntradaSalidaDatos;

import java.util.*;

public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Introduce tu nombre porfavor: ");		

		String nombreUsuario = entrada.nextLine();
	
		System.out.println("Introduce tu edad porfavor: ");		

		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombreUsuario + " El año que viene tendras " + (edad+1) + "años" );		

	}

}
