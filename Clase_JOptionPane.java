import javax.swing.*;
class Clase_JOptionPane {

	public static void main(String[] args) {
		
		//ShowImputDialog es estatico, no hya que crear un objeto JOptionpane
		//Sino que podemos utilizar el nombre de la clase "." y el metodo
		
		String Nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		//Aqui creamos una ventana showImputDialog de la clase JOP, lo que escriba el usuario se guardara en, Nombre_usuario
		
		// int edad=JOptionPane.showInputDialog("Introduce la edad, por favor"); Esto nos daria error ya que showInputDialog nos devuelve un string
		
		String edad=JOptionPane.showInputDialog("Introduce la edad, por favor"); //de esta manera estara bien 
		
		//System.out.println("Hola " + Nombre_usuario + ". El año que viene tendras " + (edad+1) + " años"); // Daria mal por que almacenamos la edad como tipo String por lo que a edad lo considera un texto. Entonces si podemos (edad+1) lo toma como una concatenacion
		
		//debemos hacer el casteo parseInt(De la clase integer)
		// es estatico por lo que debo utilizar el nombre de la clase delante del metodo
		
		int edad_usuario=Integer.parseInt(edad);
		
		System.out.println("Hola " + Nombre_usuario + ". El año que viene tendras " + (edad_usuario+1) + " años"); // de esta manera daria bien ya que convertimos edad de un String a un int

		
	}

}
