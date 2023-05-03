import javax.swing.*;//para el JOPtionPane
import java.util.*; //para la clase Scanner

public class Condicional_switch {

	public static void main(String[] args) {
		//Averiguaremos el area de 4 figuras geometricas (cuadrado, rectangulo, triangulo, circulo)
		/*El area del cuadrado es lado al cuadrado
		rectangulo base por altura 
		triangulo (base por altura) /2
		circulo pi por radio al cuadraro*/
		
		Scanner entrada=new Scanner (System.in);
		
		System.out.println("Elige una opcion: \n1) Cuadrado\n2) Rectangulo \n3) Triangulo \n4) Circulo");
	
		int figura=entrada.nextInt(); 	//vamos a almacenar en la variable fugura el proximo entero que el usuario introduzca en consola
										//nextInt no es estatico por eso necesito usar un objeto de la clase Scanner
		switch (figura) {	//lo que quiero evaluar va en el () 
							//Quiero evaluar si el usuario va a ingresar 1, 2, 3 o 4
		case 1:
			
			//Si descomentamos esta frase daria error ya que ShowInputDialog nos devuelve un String y aca estamos poniendo que devuelva un int
			//int lado=JOptionPane.showInputDialog("Introduce el lado");		//para sacar el area del cuadrado es lado*lado
												//showInputDialog es un metodo estatico, por lo que no necesito construir un objeto tipo JOPtionPane para hacer por ej lo que hicimos con Scanner
		
		int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado")); //De este modo estaria bien
		
		System.out.println("El area del cuadraro es " + Math.pow(lado, 2));		//Para sacar el area del cuadrado 
		
		break;		//No olvidarse break
		
		case 2:		//el area del rectangulo es base*altura
			
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
		
			int	altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));	
			
			System.out.println("El area del rectangulo es " + base*altura);
			
			break;
			
		case 3:		//El triangulo es base por altura sobre 2
			
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));	//Reutilizamos la base creada en el case 2
			
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));//Reutilizamos la altura creada en el case 2
			
			System.out.println("El area del triangulo es " + (base*altura)/2);
			
			break;
			
		case 4:		//El circulo es pi por radio al cuadrado
			
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));	
			
			System.out.print("El area del circulo es ");
			System.out.printf("%1.2f",Math.PI*Math.pow(radio, 2)); // El printf para imprimir con formato, de esta manera acortamos la parte decimal
		
			break;
			
			default: 
				System.out.println("La opcion no es correcta"); //Para evitar que se pongan por ej un 5,etc
		}
	}
	
}
