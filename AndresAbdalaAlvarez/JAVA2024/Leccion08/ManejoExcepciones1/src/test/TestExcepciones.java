package test;

//El sentido de una excepcion es que el programa siga corriendo sin detenerse

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;
//import aritmetica.Aritmetica;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = division(10, 0);
            //Podemos agregar varios catch pero respetando la jerarquia de Exceptions
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo OpeeracionExcepcion");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Ocurrio un ERROR");
            e.printStackTrace(System.out); //Se conoce como la pila de excepciones
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("La variable resultado tiene como valor: "+resultado);
        
        
      
    }
    
}
