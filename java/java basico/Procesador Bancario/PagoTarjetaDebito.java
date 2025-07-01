//Clase tarjeta de debito
public class PagoTarjetaDebito extends MetodoPago{
    
    //metodo para no permitir pagos de mas de $5,000
    @Override
    public void procesarPago(double monto) throws PagoInvalidoException{

        if(monto<=5000){

        System.out.println("El pago con la tarjeta de debito ha sido aprobado");
       
        }else{

        throw new PagoInvalidoException("La tarjeta no cuenta con saldo suficiente");
       
        }
        
    }
}