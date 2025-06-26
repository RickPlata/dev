import java.util.ArrayList;

public class Actividad1{
    public static void main(String[] args){

        String[]  coleccion = new String[4];
        coleccion[0] = "Hello";
        coleccion[1] = "Hello";
        coleccion[2] = "Bye";
        coleccion[3] = "World";

        System.out.println("---------Coleccion con todos los elementos---------");
        System.out.println(coleccion[0]);
        System.out.println(coleccion[1]);
        System.out.println(coleccion[2]);
        System.out.println(coleccion[3]);

        ArrayList<String> palabras = new ArrayList<>();
        
        //con este for se extraen los elementos de la coleccion sin duplicados y se guardan en un array
        for(String palabra: coleccion){

            if(!palabras.contains(palabra)){
                palabras.add(palabra);
            }

        }
        
        System.out.println("---------Array sin elementos repetidos---------");
        System.out.println(palabras);

        //con este ciclo encontramos las palabras que contien una "y"
        for(String palabra: palabras){
            if(palabra.contains("y")){
                System.out.println("---------Este elemento contiene la letra Y---------");
                System.out.println(palabra);

                //reverso del string
                String rev = new StringBuilder(palabra).reverse().toString();
                System.out.println(rev);

            }
        }
    }
}