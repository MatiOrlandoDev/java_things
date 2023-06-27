public class J1 {
    public static void main(String[] args) {

        String [] Nombres = {"Ana", "Mario", "Anabella", "Maria", "Carla", "anamaria"};

        char Caracter = 'A';

        int contador= 0;

        for (String cadena : Nombres){
            if (cadena.charAt(0)==Caracter || cadena.charAt(0) == 'a'){
                contador++;

            }
        }

        System.out.println("La cantidad de nombres que comienzan con A son: " + contador);
    }
}
