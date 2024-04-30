
package domain;

public class TestCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Pampa", 1000);
        cuenta1.ingresar();
        System.out.println(cuenta1.getCantidad());
        cuenta1.retirar();
        System.out.println(cuenta1.getCantidad());
    }
    
}
