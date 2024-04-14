
package test;
public class TestArgumentosVariables {
    public static void main(String[] args) {
     imprimirNumeros(3, 4, 5);
     imprimirNumeros(1,2);
     variosParametros("Juan", "Garcia", 7, 8, 9);
    }
    private static void variosParametros(String nombre, String apellido, int...numeros){ //el elemento variable va al final
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+ apellido);
        imprimirNumeros(numeros);
        
    }
            
    private static void imprimirNumeros(int ...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: "+numeros[i]);    
        }
    }
    
}
