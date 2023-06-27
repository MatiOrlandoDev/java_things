import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList <Empleado> listaEmpleados=new ArrayList<Empleado>();//No permiten tipos primitivos, pero si objetos en su interior

        listaEmpleados.add(new Empleado("Mario", 45, 2500));
        listaEmpleados.add(new Empleado("Maria", 55, 2500));
        listaEmpleados.add(new Empleado("gabi", 31, 2500));

        for (Empleado e: listaEmpleados){
            System.out.println(e.dameDatos());
        }
    }
}

class Empleado {
    public Empleado(String nombre, int edad, double salario) {


        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public String dameDatos() {
        return "El empleado se llama " + nombre + ". Tiene " + edad + "años" + "Y un salario de " + salario;
    }
    private String nombre;
    private int edad;
    private Double salario;
}
