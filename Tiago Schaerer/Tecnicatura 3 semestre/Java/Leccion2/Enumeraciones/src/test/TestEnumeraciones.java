
package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        String continente;
      // System.out.println("Dia: 1 "+Dias.LUNES );
        //indicarDiaSemana(Dias.MIERCOLES);
        System.out.println("Continente #4: "+Continentes.OCEANIA);// accedemos a la enum del metodo continente
        //realizaremos un print para mostrar los habitantes
        System.out.println("Cantidad de habitantes del pais #4"+Continentes.OCEANIA.getHabitantes()); //para ahcer esto llamaos al metodo get de habitantes
        //podemos por ejemplo agregar mas atributos al enum de continentes y mostrarlos con sus respectivos get
        
         
    }
   private static void indicarDiaSemana(Dias dias){
       switch(dias){
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
                 }
       
   } 
}
