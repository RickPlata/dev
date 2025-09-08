package herencia;

public class Persona {
    public String nombre;
    public String fechaDeNacimiento;

    Persona(String nombre, String fechaDeNacimiento){
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void dormmir(){
        System.out.println(nombre + " Esta durmiendo");
    }

    public void respirar(){
        System.out.println(nombre + " Esta respirando");
    }

    public void comer(){
        System.out.println(nombre + " Esta comiendo");
    }
}
