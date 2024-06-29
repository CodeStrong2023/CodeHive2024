package paquete1;

import paquete2.Clase4;


public class TestDefault {
    public static void main(String[] args) {
     
        ClaseHija2 claseH2 = new ClaseHija2();
        claseH2.atributoDefault = "Cambio desde la prueba(Test)";
        System.out.println("claseH2 atributoDefault= " + claseH2.atributoDefault);
        
        Clase4 clase4 = new Clase4("Publico");
        clase4.setAtributoPrivate("Cambio");
//        clase4.getAtributoPrivate();
        System.out.println("clase4 = " + clase4.getAtributoPrivate());
    }
    
}
