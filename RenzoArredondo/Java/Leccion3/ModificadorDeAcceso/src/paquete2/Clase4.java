package paquete2;

public class Clase4 {
	
	private String atributoPrivate="Atributo Privado";
	
	private Clase4() {
		
		System.out.println("Constructor privado");
	}
	
	public Clase4(String argumento) {
		
		this();
		System.out.println("Constructor publico");
	}
	
	private void metodoPrivado() {
		
		System.out.println("Metodo privado");
	}

	public String getAtributoPrivate() {
		return atributoPrivate;
	}

	public void setAtributoPrivate(String atributoPrivate) {
		this.atributoPrivate = atributoPrivate;
	}

	
	
}
