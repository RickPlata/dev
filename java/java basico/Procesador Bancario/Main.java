import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        //Se crea una lista de tipo MetodoPago llamada tarjetas
        List<MetodoPago> tarjetas = new ArrayList<>();
        //Se crean 4 objetos para comprobar las 4 posibilidades
        tarjetas.add(new PagoTarjetaCredito());
        tarjetas.add(new PagoTarjetaCredito());
        tarjetas.add(new PagoTarjetaDebito());
        tarjetas.add(new PagoTarjetaDebito());

        try{
            tarjetas.get(0).procesarPago(2000);
        }catch(PagoInvalidoException e){
            System.out.println(e.getMessage());
        }

        try{
            tarjetas.get(1).procesarPago(11000);
        }catch(PagoInvalidoException e){
            System.out.println(e.getMessage());
        }

        try{
            tarjetas.get(2).procesarPago(3000);
        }catch(PagoInvalidoException e){
            System.out.println(e.getMessage());
        }

        try{
            tarjetas.get(3).procesarPago(8000);
        }catch(PagoInvalidoException e){
            System.out.println(e.getMessage());
        }


    }

}
