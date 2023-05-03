import javax.swing.*;

public class Bucle_while {

	public static void main(String[] args) {
		
		String clave ="Matias"; //Clave de acceso
		
		String password=""; 	//Variable vacia de tipo String

		while(clave.equals(password)==false) {	//Si el texto clave no es igual a pasword
			
			password=JOptionPane.showInputDialog("Introduce la contraseña"); //Cambiamos el valor de la variable password
			
			if (clave.equals(password)==false) {
				System.out.println("Contraseña incorrecta"); 
			}
			
		
		}	//Importante las llaves
		
		System.out.println("Contraseña correcta, acceso permitido");
	}

}
