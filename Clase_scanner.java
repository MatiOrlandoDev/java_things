import java.util.*; //Importante importar el paquete de la clase Scanner
public class Clase_scanner {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in); //constructor clase Scanner, pidiendole que tome la informacion de System.in que es la consola
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine(); 	//Declaramos la variable nombre_usuario como tipo String, antes del next line debe de ir el nombre de nuestro objeto Scanner
													//nextLine hara que se pueda introducir un tipo String en la consola. Cuando se introduzca se guardara en nombre_usuario
		
		System.out.println("Introduce edad, por favor");
		
		int edad=entrada.nextInt(); //Scanea la proxima entrada como un entero
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad+1) + " años");
		
		
	}

}
