package mundopc;

import ar.com.system2023.mundopc.*;

public class mundopc {
    public static void main(String[] args) {
        Monitor monitorHP= new Monitor("HP", 13);// importar la clase
        Raton ratonHP = new Raton ("HP", "cable");
        Teclado tecladoHP =new Teclado ("HP", "cable");
        Computadora computadoraHP = new Computadora ("Computadora HP", monitorHP, tecladoHP, ratonHP);
        // creamos otrosobjetos de diferentes marcas
          Monitor monitorGamer= new Monitor("Gamer", 13);// importar la clase
        Raton ratonGamer = new Raton ("Gamer", "cable");
        Teclado tecladoGamer =new Teclado ("Gamer", "cable");
        Computadora computadoraGamer = new Computadora ("Computadora Gamer", monitorHP, tecladoHP, ratonHP);
         Orden orden2= new Orden(); //nueva lista para el objeto orden 2  
        Orden orden1 = new Orden();// inicializamos el arreglo
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraHP);
        
        Computadora computadorasVarias = new Computadora ("computadora de diferentes marcas ",monitorGamer,tecladoGamer,ratonHP  ); 
        orden2.agregarComputadora(computadorasVarias);
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        //crear mas objetos computadora
        //crear mas tipos de elementos hasta 10
    }
}
