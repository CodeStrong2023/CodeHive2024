package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeracion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Dia 1:"+ Dias.LUNES);
		indicarDiaSemana(Dias.LUNES);
		
		System.out.println("Continente n°4 "+ Continentes.AMERICA);
		System.out.println("Numero de paises del continente n°4 "+ Continentes.AMERICA.getPaises());
		System.out.println("Numero de habitantes del continente n°4 "+ Continentes.AMERICA.getHabitantes());
	}

	
	private static void indicarDiaSemana(Dias dias) {
		
		switch(dias) {
		
		case LUNES:
			System.out.println("Primer dia de la semana");
			break;
		
		case MARTES:
			System.out.println("Segundo dia de la semana");
			break;
			
		case MIERCOLES:
			System.out.println("Tercer dia de la semana");
			break;
			
		case JUEVES:
			System.out.println("Cuarto dia de la semana");
			break;
			
		case VIERNES:
			System.out.println("Quinto dia de la semana");
			break;
		
		case SABADO:
			System.out.println("Sexto dia de la semana");
			break;
		
		case DOMINGO:
			System.out.println("Septimo dia de la semana");
			break;
		
		default:
			System.out.println("Opcion Invalida");
			
			
			
		}
			
	}
}
