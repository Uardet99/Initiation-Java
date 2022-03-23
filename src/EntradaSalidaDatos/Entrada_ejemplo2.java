package EntradaSalidaDatos;

import javax.swing.JOptionPane;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		
		 String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre por favor");
		 
		 
		 String edad = JOptionPane.showInputDialog("Introduce tu edad");
		 
		 int edadUsuario = Integer.parseInt(edad);
		 
		 System.out.println("Hola " + nombreUsuario + ". Tienes " + (edadUsuario + 1) + " años.");
		 
		 
		 
		 
		 
	}

}
