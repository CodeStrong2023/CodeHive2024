package test;

import paquete1.Clase1;
import paquete2.Clase3;

public class TestModificadorDeAcceso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clase1 clase1=new Clase1();
		System.out.println("clase1: "+clase1);
		System.out.println("atributoPublic: "+clase1.atributoPublic);
		clase1.metodoPublico();
		
		Clase3 clasehija=new Clase3();
		System.out.println("Clasehija: "+clasehija);
	}

}
