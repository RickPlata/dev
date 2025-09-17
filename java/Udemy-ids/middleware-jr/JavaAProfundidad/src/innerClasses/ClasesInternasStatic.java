package innerClasses;

class ExternalStatic {
    public void foo(){
        System.out.println("Foo");
    }
    class InternalStatic{
        void bar(){
            System.err.println("Bar");
        }
    }
}

public class ClasesInternasStatic {
    public static void main(String args[]){
        ExternalStatic.InternalStatic obj = new ExternalStatic.InternalStatic();
        obj.bar();
    }
}
