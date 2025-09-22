package java8;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Ricardo", "Fernando");

        //metodo como referencia
        name.stream().forEach(System.out::println);
    }
}
