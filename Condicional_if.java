import java.util.*;
public class Condicional_if {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		if(edad >=18) {		//NO OLVIDAR LLAVE
							//condiciones a evualar casi siempre utilizamos operadores de comparacion <, >, !=, ==
		System.out.println("Eres mayor de edad"); //Se ejecutaria en caso de que sea true el >= de 18
		
		}
				
		else{	//sino se cumple el if pasa al else
			
		System.out.println("Eres menor de edad");	
		}
			
		
	}

}
