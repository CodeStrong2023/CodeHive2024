
package test;

import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000);
        //System.out.println("empleado1 = " + empleado1.obtenerDetalles());
        
        //SObreescribimos el metodo para que aparezca el departamento
        empleado1 = new Gerente("Jose", 5000, "Sistemas");
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        
        imprimir(empleado1);
        //imprimir(gerente1);
        
    }
    
    //Concepto de polimorfismo
    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("detalles = " + detalles);
    }
    
}
