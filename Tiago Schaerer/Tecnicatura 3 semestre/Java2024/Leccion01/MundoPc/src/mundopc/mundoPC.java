
package mundopc;

import ar.com.system2023.mundopc.Monitor;
import ar.com.system2023.mundopc.Teclado;
import ar.com.system2023.mundopc.*;



public class mundoPC {
    public static void main(String[] args) {
        //Primero debemos crear objetos del tipo raton, teclado, etc para
        // despues crear la orden
        Monitor monitorHP = new Monitor("HP", 13); //Importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        //Reafirmar la relacion de agregacion
        Computadora computadoraHP = new Computadora("ComputadoraHP", monitorHP, tecladoHP, ratonHP);
        
        //Creamos otros objetos de otras marcas
        Monitor monitorGamer = new Monitor("Gamer", 32); //Importar la clase
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        //Reafirmar la relacion de agregacion
        Computadora computadoraGamer = new Computadora("computadoraGamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Orden orden1 = new Orden();//Inicializamos el arreglo vacio
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
        
        
        Computadora computadoraVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        Orden orden2 = new Orden();//Nueva lista para el objeto Orden2
        orden2.agregarComputadora(computadoraVarias);
        //orden2.agregarComputadora(computadoraHP);
        orden2.mostrarOrden();
        
        //Crear mas objetos de tipo computadora y crear 1 lista mas
        //Creamos otros objetos de otras marcas
        Monitor monitorSamsung = new Monitor("Samsung", 44); //Importar la clase
        Teclado tecladoSamsung = new Teclado("Cable", "Samsung");
        Raton ratonSamsung = new Raton("Cable", "Samsung");
        //Reafirmar la relacion de agregacion
        Computadora computadoraSamsung = new Computadora("computadoraSamsung", monitorSamsung, tecladoSamsung, ratonSamsung);
        
        //Creamos otros objetos de otras marcas
        Monitor monitorLenovo = new Monitor("Lenovo", 32); //Importar la clase
        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        //Reafirmar la relacion de agregacion
        Computadora computadoraLenovo = new Computadora("computadoraLenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        
        //Crear mas objetos de tipo computadora y crear 1 lista mas
        //Creamos otros objetos de otras marcas
        Monitor monitorBGH = new Monitor("BGH", 16); //Importar la clase
        Teclado tecladoBGH = new Teclado("Cable", "BGH");
        Raton ratonBGH = new Raton("Cable", "BGH");
        //Reafirmar la relacion de agregacion
        Computadora computadoraBGH = new Computadora("computadoraBGH", monitorBGH, tecladoBGH, ratonBGH);
        
        //Creamos otros objetos de otras marcas
        Monitor monitorRandom = new Monitor("Random", 32); //Importar la clase
        Teclado tecladoRandom = new Teclado("Bluetooth", "Random");
        Raton ratonRandom = new Raton("Bluetooth", "Random");
        //Reafirmar la relacion de agregacion
        Computadora computadoraRandom = new Computadora("computadoraRandom", monitorRandom, tecladoRandom, ratonRandom);
        
        //Crear mas objetos de tipo computadora y crear 1 lista mas
        //Creamos otros objetos de otras marcas
        Monitor monitorGenerico1 = new Monitor("Generico1", 44); //Importar la clase
        Teclado tecladoGenerico1 = new Teclado("Cable", "Generico1");
        Raton ratonGenerico1 = new Raton("Cable", "Generico1");
        //Reafirmar la relacion de agregacion
        Computadora computadoraGenerica1 = new Computadora("computadoraGenerica1", monitorGenerico1, tecladoGenerico1, ratonGenerico1);
        
        //Creamos otros objetos de otras marcas
        Monitor monitorGenerico2 = new Monitor("Generico2", 32); //Importar la clase
        Teclado tecladoGenerico2 = new Teclado("Bluetooth", "Generico2");
        Raton ratonGenerico2 = new Raton("Bluetooth", "Generico2");
        //Reafirmar la relacion de agregacion
        Computadora computadoraGenerica2 = new Computadora("computadoraGenerica2", monitorGenerico2, tecladoGenerico2, ratonGenerico2);
        
        //Crear mas objetos de tipo computadora y crear 1 lista mas
        //Creamos otros objetos de otras marcas
        Monitor monitorGenerico3 = new Monitor("Generico3", 44); //Importar la clase
        Teclado tecladoGenerico3 = new Teclado("Cable", "Generico3");
        Raton ratonGenerico3 = new Raton("Cable", "Generico3");
        //Reafirmar la relacion de agregacion
        Computadora computadoraGenerica3 = new Computadora("computadoraGenerica3", monitorGenerico3, tecladoGenerico3, ratonGenerico3);
        
        //Creamos otros objetos de otras marcas
        Monitor monitorGenerico4 = new Monitor("Generico4", 32); //Importar la clase
        Teclado tecladoGenerico4 = new Teclado("Bluetooth", "Generico4");
        Raton ratonGenerico4 = new Raton("Bluetooth", "Generico4");
        //Reafirmar la relacion de agregacion
        Computadora computadoraGenerica4 = new Computadora("computadoraGenerica4", monitorGenerico4, tecladoGenerico4, ratonGenerico4);
        
        //Creamos otros objetos de otras marcas
        Monitor monitorGenerico5 = new Monitor("Generico5", 32); //Importar la clase
        Teclado tecladoGenerico5 = new Teclado("Bluetooth", "Generico5");
        Raton ratonGenerico5 = new Raton("Bluetooth", "Generico5");
        //Reafirmar la relacion de agregacion
        Computadora computadoraGenerica5 = new Computadora("computadoraGenerica5", monitorGenerico5, tecladoGenerico5, ratonGenerico5);
        
        Orden orden3 = new Orden();
        orden3.agregarComputadora(computadoraHP);
        orden3.agregarComputadora(computadoraGamer);
        orden3.agregarComputadora(computadoraVarias);
        orden3.agregarComputadora(computadoraSamsung);
        orden3.agregarComputadora(computadoraLenovo);
        orden3.agregarComputadora(computadoraBGH);
        orden3.agregarComputadora(computadoraRandom);
        orden3.agregarComputadora(computadoraGenerica1);
        orden3.agregarComputadora(computadoraGenerica2);
        orden3.agregarComputadora(computadoraGenerica3);
        orden3.agregarComputadora(computadoraGenerica4);
        orden3.agregarComputadora(computadoraGenerica5);
        orden3.mostrarOrden();
        
    }
    
}
