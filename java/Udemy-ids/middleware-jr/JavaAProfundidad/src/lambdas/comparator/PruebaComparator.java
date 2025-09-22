package lambdas.comparator;

import java.util.TreeSet;
import java.util.Set;

public class PruebaComparator {
    public static void main(String[] args) {
        Set<Persona> personas = new TreeSet<>(new NombrePersonaComparator());

        personas.add(new Persona("Ricardo", "Plata"));
        personas.add(new Persona("Fernando", "Plata"));

        System.out.println(personas);
    }
}
