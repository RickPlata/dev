package herencia;

import herencia.Persona;

public class Empleado extends Persona{
    float sueldo;

    void trabajar(){
        System.out.println(nombre + " Trabajo");
    }

    void cobrar(){
        System.out.println(nombre + " Cobro");
    }
}
