public class Actividad2 {
    public static void main(String[] args){

    
        //Se guarda la cadena que se va a iterar
        String text = "Hello world, I am a developer";

        //variables auxiliares para la iteracion
        int length = text.length();
        char character;
        
        //for para obtener e imprimir cada uno de los caracteres durante la iteracion
        for(int i = 0; i < length; i++){
            character = text.charAt(i);
            System.out.println(character);
        }
    }

}
