package ArrayList_;

import java.sql.ResultSet;
import java.sql.SQLOutput;

public class J3 {
    public static void main(String[] args) {

        String [] Palabras = {"Yo", "estoy", "intentando", "aprobar", "esta" , "materia"};
        String resultado = " ";

        for(String P1 : Palabras){
            resultado += " " +  P1;

            }
        System.out.println("El resultado es: " + resultado);
        }
    }

