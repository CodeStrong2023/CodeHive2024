package Cuenta;
import java.util.Scanner;

public class Cuenta {
	
	static String titular;
	
	public double cantidad=0;
	
	public double retiroCantidad;
	
	//Constructor que solo solicita el titular
	
	public Cuenta(String titular) {
		
		
		Cuenta.titular=titular;
	}
	
	//Constructor q solicita el titular y la cantidad de dinero en la cuenta
	
	public Cuenta(String titular,double cantidad) {
		
		super();
		this.cantidad = cantidad;
		
	}

	
	public static String getTitular() {
		
		
		return Cuenta.titular;
	}
	

	public static void setTitular() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Indique el nombre del titular de la cuenta");
		Cuenta.titular=scanner.nextLine();
		
	
	}
	
	
	
	
	
	
	
	

	//GET

	

	public double getCantidad() {
		return this.cantidad;
	}

	//SET
	public void ingresar() {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese la cantidad a ingresar");
		double ingresoCantidad=scanner.nextDouble();
		if (ingresoCantidad<0) {
			
			System.out.println("Usted ha ingresado un valor incorrecto");
			
		}
		
		else {
			this.cantidad =this.cantidad + ingresoCantidad;
		}
			
		}
		
	//SET
	public void retirar() {
		Scanner retiro=new Scanner(System.in);
		System.out.println("Ingrese la cantidad a retirar");
		retiroCantidad=retiro.nextDouble();
		
		if(retiroCantidad>this.cantidad) {
			
			
			retiroCantidad=this.cantidad;
			this.cantidad=0;
			
		}
		else {
			this.cantidad=this.cantidad-retiroCantidad;
			
		}
	
		
	}

	public double getRetiro() {
		return retiroCantidad;
	}
	
	
}
