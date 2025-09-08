# Archivos y clases
Al generar un archivo la clase debe llevar el mismo nombre 
Por ejemplo 
~~~
class public Uno{}
~~~        
Para este caso el nombre del archivo debe ser **Uno.java**

# Identificadores
Los identificadores son los nombres que se le asignan a las variables y siguen algunas reglas para nombrarlas.
        
        - No usar palabras reservadas
        - No debe empezar con un un numero aunque el nombre si puede llevar numeros en el nombre
        -Puede inicar con '$' '_' pero no con otro simbolo
 # Notas Sobres Operacdores

Incremento y Decremento en post o pre
        count++ count-- //Esto es post, es decir primero resuelve la instruccion y despues hace el incremento/decremento
        ++count --conut //Esto es pre, primero hacer el incremento/decremento y depues ejecuta la operacion 

# Ciclos

En los ciclos se pueden usar las palabras reservadas **break** y **continue** para romper los ciclos o darle continuación dependiendo de lo que se necesite por ejemplo con el uso de un if

~~~
for(int i=0;i<=10;i++){
        if(i==2){
                break;
        }
        System.out.println(i);
}
~~~

# POO

Clases contienen 
- Atributos
- Metodos

Se pueden crear muchos objetos a partir de una sola clase

~~~
//Suponiendo que se tiene la clase persona la forma de isntanciar varios objetos seria la siguiente

public static void main(String args []){
        Persona persona1 = new Persona();

//el primer "Persona" se refiere al nombre de la clase "persona" es como si fuera el nombre de la variable "= new Persona()" inicializa la variable persona que contien los atributos del objeto
}
~~~
