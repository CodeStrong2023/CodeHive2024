package test;

import Cuenta.Cuenta;

public class testCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Cuenta.setTitular();
		Cuenta cuenta1=new Cuenta(Cuenta.getTitular());
		
		System.out.println("Cuenta 1, sin solicitud de ingresos previo, perteneciente a "+cuenta1.getTitular());
		cuenta1.ingresar();
		System.out.println("Usted tiene "+cuenta1.getCantidad());
		cuenta1.retirar();
		System.out.println("Usted ha retirado "+ cuenta1.getRetiro());
		System.out.println("Usted tiene "+ cuenta1.cantidad);
		
		
		Cuenta.setTitular();
		Cuenta cuenta2=new Cuenta(Cuenta.getTitular(),22);
		
		System.out.println("Cuenta 2, con ingresos previo, perteneciente a "+cuenta2.getTitular());
		cuenta2.ingresar();
		System.out.println("Usted tiene "+cuenta2.getCantidad());
		cuenta2.retirar();
		System.out.println("Usted ha retirado "+ cuenta2.getRetiro());
		System.out.println("Usted tiene "+ cuenta2.cantidad);
		
		
		
	}

}
