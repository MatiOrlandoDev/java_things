import javax.swing.*;

public class Bucle_DoWhile2 {

	public static void main(String[] args) {
		
		String genero =""; //Declaracion de variable
		
		do {	//En caso de introducir algo incorrecto el JOP saldra una y otra vez
			
			genero=JOptionPane.showInputDialog("Introduce tu genero (H/M)");
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);//se va a repetir infinitvas veces en cuanto se haya introducido algo diferente a H o M
	
		int altura =Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en centimetros"));
	
		int pesoideal=0;
		
		if(genero.equalsIgnoreCase("H")) {
			pesoideal=altura-110;
		}
	
		else if (genero.equalsIgnoreCase("M")) {
			pesoideal=altura-120;
		}
	System.out.println("Tu peso ideal es " + pesoideal + "KG");
	}

}
