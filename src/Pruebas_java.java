
public class Pruebas_java {

	public static void main(String[] args) {

		// declara la cadena como un objeto S1 S2
		int[] matriz_aleatorios = new int[150];

		for (int numeros_aleatorios : matriz_aleatorios) {
			System.out.println(numeros_aleatorios);
		}

		for (int i = 0; i < matriz_aleatorios.length; i++) {
			matriz_aleatorios[i] = (int) Math.round(Math.random() * 100);
		}

	}

}
