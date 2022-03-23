package Arrays;

import javax.swing.JOptionPane;

public class Arrays_2 {

	public static void main(String[] args) {
	
//		String [] paises = new String[8];
//		String paises[] = {"España","Mexico","Colombia","Peru","Chile","Argentina","Ecuador", "Venezuela"};
//		
//		
//		for (int i = 0; i<8; i++) {
//			paises[i] = JOptionPane.showInputDialog("Introduce un pais " + (i +1));
//		}
//		
//		
//		// Este bucle for each sirve para minimizar la realizacion de bucles para recorrer un array
//		for (String elemento: paises) {
//			System.out.println("Pais: " + elemento);
//		}
		
		
		int[] matriz_aleatorios = new int[150];
		
		for (int i = 0;i<matriz_aleatorios.length;i++) {
			matriz_aleatorios[i]= (int) Math.round(Math.random()*100);
		}
		
		for (int numeros:matriz_aleatorios ) {
			System.out.print(numeros + " ");
		}
	}

}
