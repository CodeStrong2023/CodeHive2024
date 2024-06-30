package test;

import domain.*;

public class TestConversionObjectos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles());//Si queremos acceder a metodos Escritor
        //empleado.getTipoEscritura();//No se puede hacer. Solamente esta definido en la clase Escritor
        //Para llamar a este metodo tenemos que hacer un casteo
        
        //Downcasting
        ((Escritor)empleado).getTipoEscritura();//Primera opcion es esta
        //Al objeto lo casteamos a la clase hija
        Escritor escritor = (Escritor)empleado;//Segunda opcion de hacerlo
        escritor.getTipoEscritura(); //Igual que la primera opcion pero usando 2 lineas de codigo
        
        //Upcasting
        Empleado empleado2 = escritor;
        System.out.println("empleado2 = " + empleado2.obtenerDetalles());
        
        
        
        
        
        
        
        
        
        
    }
    
}
