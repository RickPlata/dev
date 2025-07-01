//Clase tarjeta de credito
public class PagoTarjetaCredito extends MetodoPago{
    
    //metodo para no permitir pagos de mas de $10,000
    @Override
    public void procesarPago(double monto) throws PagoInvalidoException{

       if(monto<=10000){

        System.out.println("El pago con la tarjeta de credito ha sido aprobado");
       
        }else{

        throw new PagoInvalidoException("El pago excede el monto permitido");
       
        }
        
    }
}