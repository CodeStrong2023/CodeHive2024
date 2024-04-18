package mundopc;
import system2023mundopc.*;
public class MundoPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monitor monitorHP=new Monitor("HP",13);
		Teclado tecladoHP=new Teclado("Bluetooth","HP");
		Raton ratonHP=new Raton("Bluetooth","HP");
		Computadora computadoraHP=new Computadora("Computadora HP",monitorHP,tecladoHP,ratonHP);
		
		//Creamos otros objeto de otra marca
		Monitor monitorGamer=new Monitor("Gamer",32);
		Teclado tecladoGamer=new Teclado("Bluetooth","Gamer");
		Raton ratonGamer=new Raton("Bluetooth","Gamer");
		Computadora computadoraGamer=new Computadora("Computadora Gamer",monitorHP,tecladoHP,ratonHP);
	
		//Creamos otros objeto de otra marca
				Monitor monitorVarias=new Monitor("Gamer",32);
				Teclado tecladoVarias=new Teclado("Bluetooth","Gamer");
				Raton ratonVarias=new Raton("Bluetooth","Gamer");
				Computadora computadoraVarias=new Computadora("Computadora Gamer",monitorHP,tecladoHP,ratonHP);
		
		Orden orden1=new Orden();
		Orden orden2=new Orden();
		
		orden1.agregarComputadora(computadoraHP);
		orden1.agregarComputadora(computadoraGamer);
		orden1.mostrarOrden();
		
		orden2.agregarComputadora(computadoraGamer);
		orden2.agregarComputadora(computadoraHP);
		orden2.agregarComputadora(computadoraHP);
		orden2.mostrarOrden();
	}

}
