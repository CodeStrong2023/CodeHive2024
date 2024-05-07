package paquete1;
import paquete2.Clase4;

public class TestDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClaseHija2 claseH2=new ClaseHija2();
		claseH2.atributoDefault="Cambio desde la prueba";
		System.out.println("clase atributo default: "+claseH2.atributoDefault);
		
		Clase4 clase4=new Clase4("Publico");
		System.out.println("clase 4: "+clase4.getAtributoPrivate());
		clase4.setAtributoPrivate("Cambio");
		System.out.println("clase 4: "+clase4);
		System.out.println("clase 4: "+clase4.getAtributoPrivate());
	
	}

}
