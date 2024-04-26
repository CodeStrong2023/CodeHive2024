
package paquete1;

//Ejemplo de default o package. Puede extender o heredar de otra clase padre
class Clase2 extends Clase1{
    String atributoDefault = "Valor del atributo default o package";
    
    
//    Clase2(){
//        System.out.println("Constructor Default o package");
//    }
    
    public Clase2(){
        super();
        this.atributoDefault = "Modificacion del atributo default";
        System.out.println("atributoDefault " + this.atributoDefault);
        this.metodoDefault();
    }
    
    
    
    void metodoDefault(){
        System.out.println("Metodo Default o package");
    }
    
    
}
