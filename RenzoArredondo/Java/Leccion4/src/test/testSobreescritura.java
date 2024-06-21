package test;
import domain.*;

public class testSobreescritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado empleado1=new Empleado("Juan",10000);
		System.out.println("gerente1= "+empleado1.ObtenerDetalles());
		
		Gerente gerente1=new Gerente("Jose",5000,"Sistemas");
		System.out.println("gerente1= "+gerente1.ObtenerDetalles());
		
		//polimorfismo
		imprimir(empleado1);
		imprimir(gerente1);
	}

	public static void imprimir(Empleado empleado) {//Polimorfismo
		System.out.println("gerente1= "+empleado.ObtenerDetalles());
		
	}
}
