import java.util.*;
import java.math.*;
public class Bucle_DoWhile {

	public static void main(String[] args) {
		//Do Te asegura que aunque la condicion sea falsa se ejecute de todas formas 1 vez
		
int aleatorio=(int)(Math.random()*100);	//La funcion random nos devuelve un doble por ello utilizamos el casteo a int
		
		Scanner entrada = new Scanner(System.in); //con esto le decimos al programa que vamos a usar la consola para ingresar informacion
		
		int numero=0;
		
		int intentos=0;
		
		do { 
			intentos++;
			System.out.println("Introduce un numero, por favor ");
		
			numero = entrada.nextInt(); // El numero tiene que ser igual al proximo entero que ingreses en consola
		
			if (aleatorio<numero) {
				System.out.println("Mas bajo");	//Para decir que el numero que a generado el programa es mas bajo del que introducimos nosotros
			}
				else if (aleatorio>numero) {
					System.out.println("Mas alto");
				}
			
		}   while (numero!=aleatorio); { //!=DIFERENTE DE
			System.out.println("Correcto. Lo conseguiste en " + intentos + "Intentos");

		}	

	}
}
	
