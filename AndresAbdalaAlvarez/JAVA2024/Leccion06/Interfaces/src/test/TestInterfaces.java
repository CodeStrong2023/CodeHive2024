package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        //No podemos instanciar los metodos de una insterface, tenemos que implementar los metodos de las clases
        IAccesoDatos datos = new ImplementacionMySql();
        //datos.listar();
        imprimir(datos);
        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
    
}
