
package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        
        //Llamamos al metodo desde el main
        imprimirNumero(3, 4, 5);
        imprimirNumero(1, 2);
        
        variosParametros("Tu vieja", "en tanga",3, 4, 5, 6, 7, 8, 9);
        
        
    }
    //Los 3 puntos nos dicen que esos son argumentos variables y son indeterminados
    //Definimos el tipo y la sintaxis es utilizar los ...(3 puntos)
    //Esto se va a convertir en un arreglo
    //EL argumento variable debe ser el ultimo argumento del metodo
    private static void imprimirNumero(int ...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: "+numeros[i]);
        }
    }
    
    private static void variosParametros(String nombre, String apellido, int ...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("nombre y apellido= " + nombre +" "+ apellido);
            imprimirNumero(numeros);
        }
    }
    
}
