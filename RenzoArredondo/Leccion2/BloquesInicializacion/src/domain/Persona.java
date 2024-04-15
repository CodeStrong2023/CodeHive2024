package domain;

public class Persona {
	
	private final int idPersona;
	private static int contadorPersonas;
	
	static {//Bloque de inicializacion estatico
		
		System.out.println("Ejercucion bloque estatico");
		++Persona.contadorPersonas;
		//idPersona=10; No es un atributo estatico por eso tenemos error. Solo se pueden atirbutos estaticos
		
		
	}
	
	{//Bloque de inicializacion no estatico(contexto dinamico) se ejecuta antes del constructor
		
		System.out.println("Ejercucion bloque no estatico");
		this.idPersona=Persona.contadorPersonas++;//Incrementamos el atributo
	}
	//Los bloques de inicializacion se ejecutan antes del constructor de nuestra clase
	
	public Persona() {
		
		System.out.println("Ejercucion del constructor");
		
	}
	
	public int idPersona() {
		
		return this.idPersona;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + "]";
	}

	
}
