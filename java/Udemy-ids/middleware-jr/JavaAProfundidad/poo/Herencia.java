
class Animal {
    String nombre;
    public void respirar() {
        System.out.println("El animal respira");
    }
}

class Perro extends Animal {

}

class Gato extends Animal {
    
}

public class Herencia{
    public static void main (String args[]){

        //aunque no tenga parameros o metodos las clases que heredan 
        //esto no causa un error de compilacion porque pueden usar
        //los atributos y metodos de la clase de la cual heredan
        Animal animal = new Animal();

        Perro perro = new Perro();
        perro.respirar();
        perro.nombre = "Luna";

        Gato gato = new Gato();
        gato.respirar();
        gato.nombre = "osu";

        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Object);
    }
}