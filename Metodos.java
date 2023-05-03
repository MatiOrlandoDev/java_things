package Clase_String;

public class Metodos {

	public static void main(String[] args) {
		
		//Metodos de la clase String
		//lenght(): devuelve la longitud de una cadena de caracteres
		//charAt(n): devuelve la posicion de un caracter dentro de una cadena (Las posiciones empiezan a contar de 0)
		//substring(x,y): devuelve una subcadena dentro de la cadena, siendo X el caracter a partir del cual se estrae e Y el nº de caracteres que se quieren extraer
		//equals(cadena): vevuelve true si dos cadenas que se comparan son iguales y false si no lo son. Distringue entre mayusculas y minusculas
		//equalsIgnoreCase(cadena): igual que el anterior pero sin tener en cuanta maysuculas y minusculas
		
		//String nombre="Juan"; //datos de tipo char con comillas simples
		
		//System.out.println("Mi nombre es " + nombre);
		
		//System.out.println("Mi nombre tiene " + nombre.length() + " letras");//usando lenght() que nos devuelve la cantidad de caracteres
		
		//System.out.println("La primer letra de mi nombre " + nombre + " es la " + nombre.charAt(0)); //usando charAt
		
		//int ultima_letra;
		//ultima_letra=nombre.length(); //Aqui estaremos guardando en este caso el 4 por que "Juan" tiene 4 L
		
		//System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra-1));
		//-----------------------------------------------------------------------------------------------------------
		
		//metodo substring
		
		/*String frase="Hoy es un estupendo dia para aprender a programar en java";
		
		//Segundo metodo substring que nos ofrece java 
		String frase_resumen=frase.substring(0, 29) + "irnos a la playa y olvidarnos de todo" + " y "+ 
		frase.substring(29, 57);
		//Posicion del caracter del cual se quiere empezar a extrar, y la posicion del caracter que no queremos extraer(Cuentan empacios)
						
		System.out.println(frase_resumen);
		
		//El primer metodo substring que nos ofrece java
		String frase_resumen1=frase.substring(29); // solo pones desde donde quieres comenzar y te toma de ahí en adelante.
		System.out.println(frase_resumen1);
		*/
		//-----------------------------------------------------------------------------------------------------------
		
		//Metodo equals
		
		/*String alumno1, alumno2;
		
		alumno1="David";
		
		alumno2="david";
		
		System.out.println(alumno1.equals(alumno2));//daria false
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2));//daria true
		
		*/
	}

}
