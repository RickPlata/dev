package innerClasses;

class EjemploAnonima{
    void foo(){
        System.err.println("foo");
    }
}
public class ClasesAnonimas {
    public static void main(String args[]){
        EjemploAnonima obj = new EjemploAnonima(){

        @Override
        void foo(){
            System.err.println("Bar");
        }

        };
        obj.foo();
    }
}
