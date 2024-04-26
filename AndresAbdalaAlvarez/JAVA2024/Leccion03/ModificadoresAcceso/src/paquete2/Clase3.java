package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1{
    
    
    //EL atributo protected es para que lo usen las clases hijas y para que se use por herencia
    public Clase3(){
        super("Protected");
        this.atributoProtected = "Accedemos des la clase hija";
        System.out.println("AtributoProtected = "+ this.atributoProtected);
        this.atributoPublic = "Es totalemte publico";
    }
    
    
}
