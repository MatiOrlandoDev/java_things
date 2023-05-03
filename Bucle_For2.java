import javax.swing.*;

public class Bucle_For2 {

	public static void main(String[] args) {
		
		boolean arroba=false;
		
		String mail=JOptionPane.showInputDialog("Introduce mail");
		
		for (int i =0; i<mail.length();i++) {
			
			if (mail.charAt(i)=='@'){	//''por el char
				
				arroba=true;
			}
		
		
		}
		
		if (arroba==true) {
			System.out.println("Es correcto");
		}
		else {
			System.out.println("No es correcto");
		}
	}

}
