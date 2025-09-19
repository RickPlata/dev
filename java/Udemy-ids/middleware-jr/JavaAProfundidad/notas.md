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
 # Notas Sobres Operadores

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

### Constructores
previamente se habia usado **this** para llamar al constructor de la clase padre, cuando usamos herencia se puede usar **super()** para invocar al constructor de clase padre

### Sobreescritura de metodos
Los metodos heredados de las clases padre pueden sobreescribir con la etiqueta **@Override** 

*si se marcan como final (constante) entonces no se pueden sobreescribir*


## Nombrar Paquetes
se debe seguir la nomenlcatura de un dominio pero al reves Por ejemplo:

~~~
com.big.utils
~~~

## Nombrar Clases

Las clases deben empezar siempre con mayuscula y si hay mas plabras esas inician con mayuscula tambien
~~~
class Clase {}
class ClaseChida{}
~~~

## Nombrar Metodos

Los metodos inician con minuscula y si existen mas palabras estas inician con mayuscula

~~~
void metodo(){}
void metodoChido(){}
~~~

## Modificadores de acceso
- private
- default
- protected
- public

### Encapsulamiento

- Abstracción
Son clases que contienen metodos privados

### Plimorfismo

es cuando una clase hereda desde varias clases anteriores para complementar clases mas avanzadas por ejemplo

~~~
class Animal{}
class Ave Extends Animal{}
public class Aguila Extends Ave{}
~~~

En el ejemplo anterior se ve como de una clase padre Animal se herendan otras clases como, ave, pez, felino, etc, y a su vez estas clases pueden heredar a una clase publica como aguila, que a su vez hereda todas las estructuras anterioeres (Anima y Ave) y se complementaria con los atributos particulares para un aguila.

### Consideraciones a tener en cuenta

Las clases abstractas no pueden tener metodos *Final*

### Interfaces
Ejemplo en codigo para hacer un interface

~~~
public interface Dibujable{ //Las interfaces se definen por lo regular como en este ejemplo dibujable, medible, etc.
        void dibujar();

}
~~~

los metodos en las interfaces tan solo se declaran y despues se usan en las clases que las implementan 
con **Override** se sobreescriben los metodos y se cambia la logica segun las clase que los implementa.

### Temas Generales
#### Static
ststic no requiere de la previa creacion de un objeto para instanciar sus atributos
Desde un metodo static no se puede invocar una atributo static solo si se instalcia de la forma
~~~
objeto.atributo
~~~
#### Bloques anonimos
los bloques anonimos se ejecutan siempre que se inicializa un objeto
~~~
{
        Esto es un bloque anonimo
}
~~~

# Arreglos
Son objetos que almacenan múltiples valores del mismo tipo, una vez definido el tamaño este no puede cambiar.


- Pueden almacenar primitivos y objetos 
- Existen arreglos unidimensionales y multidimiensionales

ejemplo de como declarar un arary:
~~~
int array[] = new int[300];
array[0] = 24;
System.out.println(array[0]);//out -> 24
~~~

En la declaración del array se nombra como array (para este ejemplo) y la inicialización se hace a travez de la un objeto que le indica el tipo de dato que va a guardar 


- Tambien se pueden hacer arreglos de objetos 
Por ejemplo al hacer una clase taco, podemos crear arreglos para guiardar las ordenes, respetando los atributos del objeto taco


# Colecciones Java y Wrapper Clases
Existen dato primitivos y su sus respectivos Wrappers
por ejemplo

~~~
int x = 10; //este es un dato primitivo
Integer x1 = 10;//esta es una wrapper class y contiene metodos y otras caracteriscticas que el dato primitivo no tiene
~~~

# Colecciones en Java
- **List** permite generar listas simples
- **Set** Permite alamacenar objetos en pares llave valor y las llaves son unicas
- **Map** Permite alamacenar objetos en pares llave valor y las llaves son unicas
- **Queue** Almacenan objetosde acuerdo al orden de insercion o a reglas deifinidas

### Arraylist 
~~~
        ArrayList array = new ArrayList();
        array.add("String");
        System.out.println(array)
~~~

#### Interface Comparable
Se utiliza Comparable y comparator para
definir el orden en colecciones como
TreeSet y TreeMap.

#### Collections
La clase **java.utils.Collections** contiene metodos para trabajar con listas

# Manejo de Errores
La clase principal para manejar los errores es la clase **Throwable**

- nota: Todo en java son objetos a excepcion de los tipos de datos primitivos

Los bloque try catch, pueden tener solo 
- try y finally
- si tienen varios catch solo un catch se va a ejecutar
- siempre debe iniciar con un try

#### Throws/Throw

Palabra reservada para el mamejo de errores.
Indica que el error no sera manejado por el metodo actual, sino que será menjado por el metodo que ejecuta el meotodo actual


#### clases Anonimas
son clases que se instancian de manera anonima para crear 
implementaciones de clases abstractas por ejemplo


# Threads (Hilos)

Un hilo des un objeto en java que tiene variables y metodos.
esta clses permite ejecutar varais tareas de manera concurrente

#### Ciclos de vida del los hilos
~~~
- New
- Runnable
- Running
- Waiting/blocking
- Dead
~~~
**Una vez que un hilo ya ha sido ejecutado no puede volver a ejecutarse**

#### Metodos utiles al trabajar con hilos

~~~
- start()
- join()
- sleep()
- yield()
- wait()
- notify()
- nootifyAll()
- setName()
- setPriority()