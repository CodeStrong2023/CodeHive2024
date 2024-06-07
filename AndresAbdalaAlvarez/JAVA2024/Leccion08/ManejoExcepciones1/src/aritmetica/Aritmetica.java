package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica extends Exception{
    public static int division(int numerador, int denominador){
        if(denominador == 0){
            throw new OperacionExcepcion("Division Entre Cero");
        }
        return numerador / denominador;
    }
}
