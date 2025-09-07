class Persona{
	//Atributos
	String nombre;
	int edad;
	char genero;

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

		persona2.imprimirInfo();
		persona.jugarVideoJuegos(persona2);
	}
}
