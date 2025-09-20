package files;

import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {
    public static void main(String[] args) {
        int value = System.in.read();
        System.err.println(value);
    }
}
