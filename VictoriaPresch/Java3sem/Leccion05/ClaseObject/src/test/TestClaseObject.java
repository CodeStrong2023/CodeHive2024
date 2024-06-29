package test;
import domain.*;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);
        
        if(empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }else{
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        //El metodo equals compara el contenido de 2 objetos
        if(empleado1.equals(empleado2)){
            System.out.println("Los 2 objetos son iguales en contenido");
        }else{
            System.out.println("Los 2 objetos son distintos en contenido");
        }
        
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("El valor HashCode es igual");
        }else{
            System.out.println("El valor HashCode es diferente");
        }
        
    }
    
}
