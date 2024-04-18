package paquete1;

class Clase2 {
	
	String atributoDefault="Valor del atrubuto default";
	
	//Clase2(){
		//System.out.println("Constructor default");
	
	//}
	
	public Clase2() {
		
		super();
		this.atributoDefault="Modificacion del atributo default";
		System.out.println("Atributo default "+atributoDefault);
		this.metodoDefault();
	}

	void metodoDefault() {
		System.out.println("Metodo default");
		
	}
}
