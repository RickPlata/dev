package herencia;

import herencia.Estudiante;

public class EjemploPersonas {
    public static void main (String args[]){
        Estudiante estudiante = new Estudiante();

        estudiante.nombre = "Ricardo";
        estudiante.fechaDeNacimiento = "15-08-1994";
        estudiante.numeroCuenta = 4444;

        estudiante.aprobar();
        estudiante.reprobar();
        estudiante.dormmir();
    }
}
