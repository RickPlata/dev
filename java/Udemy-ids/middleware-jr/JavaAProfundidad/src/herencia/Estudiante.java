package herencia;

import herencia.Persona;

public class Estudiante extends Persona{
    int numeroCuenta;

    void aprobar(){
        System.out.println(nombre + " Aprobo");
    }

    void reprobar(){
        System.out.println(nombre + " Reprobo");
    }
}
