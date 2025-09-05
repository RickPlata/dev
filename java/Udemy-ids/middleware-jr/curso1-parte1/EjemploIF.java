public class EjemploIF {
    public static void main(String[] args) {
        int edad = 15;
        boolean esMayorDeEdad = edad>=18;

        if (esMayorDeEdad){
            System.out.println("Puede ingresar al lugar");
        }else if (edad<=15){
            System.out.println("Llamar a sus padres y no permitir la entrada");
        }else{
            System.out.println("No dejar pasar");
        }
    }
}
