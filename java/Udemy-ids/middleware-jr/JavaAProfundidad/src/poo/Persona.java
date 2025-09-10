class Persona{
	//Atributos
	String nombre;
	int edad;
	char genero;


    //Constructores
    
    Persona(){ //Los constructores se definene con el nombre de la misma clase de la cual van a ser el constructor
		System.out.println("Constructor por defecto");
    }


    Persona(String nombre, int edad, char genero){
		this(); //Llamada al constructor por defecto
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

	//Metodos
	void imprimirInfo(){
		System.out.println("Nombre "+nombre);
		System.out.println("Edad "+edad);
		System.out.println("Genero " + genero);
	}
	
	void jugarVideoJuegos(Persona p){
		System.out.println(nombre+" Esta jugando VideoJuegos con "+p.nombre);
	}
	public static void main(String args[]){
		Persona persona = new Persona();
		persona.nombre = "Ricardo";
		persona.edad = 31;
		persona.genero = 'H';

		persona.imprimirInfo();

		Persona persona2 = new Persona();
		persona2.nombre = "Fernando";
		persona2.edad = 22;
		persona2.genero = 'H';

		Persona persona3 = new Persona("Roman", 65, 'H');
		persona3.imprimirInfo();

		persona2.imprimirInfo();
		persona.jugarVideoJuegos(persona2);
	}
}
