package test;

import domain.Persona;

public class testForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edades[]= {5,6,8,9};
		
		for(int edad:edades) {//Sintaxis del for each
			System.out.println("edad= "+edad);
		}
		
		Persona personas[]= {new Persona("Juan"),new Persona("Pedro"),new Persona("Renzo")}; 
		
		for(Persona persona:personas) {//Sintaxis del for each
			System.out.println("Persona= "+persona);
		}
	}

	
	
}
