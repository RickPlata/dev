package model;

//imports para obtener fecha y hora
import java.time.LocalDate;
import java.time.LocalTime;

public class Account {

    //variables publicas
    private String customerName;
    private String accountNumber;
    private double balance;
    private LocalDate date;
    private LocalTime time;


    //bloque de inicializacion
    {
        customerName = "Ricardo Plata";
        accountNumber= "20259408";
        balance = 999.99;
    }

    //constructor por default
    public Account(){
        this.date = LocalDate.now();
        this.time = LocalTime.now();
    }

    //getters para acceder a los parametros de la clase
    public String getCustomerName(){
        return customerName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }


    public double getBalance(){
        return balance;
    }

    public LocalDate getDate(){
        return date;
    }

    public LocalTime getTime(){
        return time;
    }


}

// Modificar la clase Account del paquete model agregando dos campos más para manejo de hora y fecha.

// Cambiar los modificadores de acceso de public a private para asegurar el encapsulamiento de los campos.

// Inicializar en el constructor las variables correspondientes a la hora y fecha, tomando la hora del sistema.

// Generar métodos que se encarguen de obtener el valor de cada uno de los campos dentro de la misma clase Account.