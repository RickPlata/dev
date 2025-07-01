//Clase para manejar un mensaje de error personalizado
public class PagoInvalidoException extends Exception{
    public PagoInvalidoException(String err){
        super(err);
    }
}