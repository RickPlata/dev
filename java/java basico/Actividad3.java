public class Actividad3 {
    public static void main(String[] args){

        //Se declara un arreglo de tipo string de 3x2
        String[][] array = new String[3][2];

        //se guarda y se imprime el string en la posicion 2,1
        array[2][1] = "Hello World";
        
        System.out.println("---------Elemento en la posicion 2,1---------");
        System.out.println(array[2][1]);
    }

}