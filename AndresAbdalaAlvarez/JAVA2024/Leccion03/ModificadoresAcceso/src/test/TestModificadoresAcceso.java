
package test;

import paquete1.Clase1;
import paquete2.Clase3;


public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        //Clase1 clase1 = new Clase1("Tu vieja en tanga"); //No se puede
        System.out.println("clase1 = " + clase1);
        System.out.println("clase1 = " + clase1.atributoPublic);
        clase1.metodoPublico();
        
        Clase3 claseHija3 = new Clase3();
        System.out.println("claseHija3 = " + claseHija3);
    }
}
