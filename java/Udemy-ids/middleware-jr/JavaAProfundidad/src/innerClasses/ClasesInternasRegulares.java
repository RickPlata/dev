package innerClasses;

class Externa{
    void foo(){
        System.out.println("Foo");
    }
    class Internal{
        void bar(){
            System.out.println("Bar");
        }
    }
}

public class ClasesInternasRegulares {
    public static void main(String args[]){
        Externa ex = new Externa();
        ex.foo();
        Externa.Internal interna = ex.new Internal();
        interna.bar();
    }
}
