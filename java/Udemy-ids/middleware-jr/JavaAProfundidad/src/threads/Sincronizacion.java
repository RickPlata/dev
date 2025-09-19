package threads;

class SyncCounter{
    static int counter = 10;
     public static void decrement(){
        counter--;
        System.err.println(counter);
     }
}

class Decrementor extends Thread{
    @Override
    public void run(){
        System.err.println("Decrementando SyncCounter");
        SyncCounter.decrement();
    }
}

public class Sincronizacion {
    public static void main(String args[]){
        for (int i = 0; i < 10; i++){
            new Decrementor().start();
        }
    }
}
