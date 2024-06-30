
package domain;

import java.util.Scanner;


public class Cuenta {
    
    public String titular;
    public double cantidad;
    
    public Cuenta(String titular){
        this.titular = titular;
    }
    
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    //GETTER AND SETTER-----------------------------------
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    //GETTER AND SETTER-----------------------------------
    
    public void ingresar(){
        System.out.println("Monto a Ingresar: ");
        Scanner entrada = new Scanner(System.in);
        double cantidadEntrada = Double.parseDouble(entrada.nextLine());
        if(cantidadEntrada < 0){
            System.out.println("ERROR: El monto ingresado es menor que 0");
        }else{
            cantidad += cantidadEntrada;
            System.out.println("Se ingreso a su cuenta: " + cantidadEntrada);
            System.out.println("Su cuenta queda con un total de: "+ cantidad);
        }
        
    }
    
    public void retirar(){
        System.out.println("Ingrese el monto a retirar");
        Scanner entrada1 = new Scanner(System.in);
        double cantidadRetirar = Double.parseDouble(entrada1.nextLine());
        if(cantidadRetirar < 0 ){
            System.out.println("ERROR: El monto ingresado es menor que 0");
        }else{
            cantidad -= cantidadRetirar;
            System.out.println("Se retiro es de : " + cantidadRetirar);
            System.out.println("Su cuenta queda con un total de: "+ cantidad);
        }
    }
    
    //ToString -------------------------

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
    
}
