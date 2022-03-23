package Arrays;

public class Arrays_1 {

	public static void main(String[] args) {
		// En este algoritmo vemos como declarar e inicializar los arrays y como mostrar sus valores
		
		
//		int [] mi_matriz = new int [5];
//		
//		mi_matriz[0] = 5;
//		mi_matriz[1] = 38;
//		mi_matriz[2] = -15;
//		mi_matriz[3] = 92;		
//		mi_matriz[4] = 71;
		
//		for (int i = 0; i < 5; i++) {
//		System.out.println("Valor de la posicion del array " + i + " = " + mi_matriz[i]);
//		
//	}
	
		
		// Aqui utilizamos el .lenth para recorrer todo el array sin necesidad de saber cual es su tamaño
		int [] mi_matriz = {5,38,-15,92,71,95,85,65,25,14,78};
		
		for (int i = 0; i < mi_matriz.length; i++) {
			System.out.println("Valor de la posicion del array " + i + " = " + mi_matriz[i]);
		}
		
	}
}
