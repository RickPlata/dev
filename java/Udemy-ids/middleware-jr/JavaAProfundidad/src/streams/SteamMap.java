package streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Persona{
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

public class SteamMap {

    public static void main(String[] args) {

        List<Persona> p = Arrays.asList(new Persona("Ricardo"), new Persona("Fernando"), new Persona("Roman"));
        List<String> nombres = p.stream().map(a -> a.getNombre()).collect(Collectors.toList());
        System.out.println(nombres);

        List<String> nombres2 = nombres.stream().map(n -> new Persona).collect(Collectors.toList());
        System.out.println(nombres2);
    }
}
