
package test;

import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("Jose", 5000, "Sistemas");
        //determinarTipo(empleado1);
        
    }
    
    //Concepto de polimorfismo
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente)empleado;  //1ra forma
            //((Gerente) empleado).getDepartamento(); //2da forma
            System.out.println("gerente = " + gerente.getDepartamento());
        }else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
//            Gerente gerente = (Gerente)empleado;
//            System.out.println("gerente = " + gerente.getDepartamento());
        }else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
    
}
