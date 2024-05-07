package test;

public class TestAutoboxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Clases envolventes
		/*
		 * Clases envolventes de tipos primitivos
		 * int=la clase envolvente es integer
		 * long=la clase envolvente es Long
		 * float=Float
		 * byte=Byte
		 * 
		 * 
		 */
		
		int enteroPrim =10;//Tipo primitivo
		System.out.println("enteroPrim = "+enteroPrim);
		Integer entero=10;//Tipo object con la clase
		System.out.println("entero = "+entero.doubleValue());//Autoboxing
		
		int entero2=entero;
		System.out.println("entero2 = "+entero2);//Unboxing
	}

}
