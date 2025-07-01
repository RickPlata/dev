//clase abstracta con el metodo procesarPago
public abstract class MetodoPago{
    public abstract void procesarPago(double monto) throws PagoInvalidoException;
}