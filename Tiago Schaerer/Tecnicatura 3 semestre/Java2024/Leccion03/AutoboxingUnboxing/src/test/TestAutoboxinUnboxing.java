package test;

public class TestAutoboxinUnboxing {
    public static void main(String[] args) {
        //Clases Envolventes o Wrapper
        /*
            Clases envolventes de tipo primitivos
            int = la clase envolvente es integer
            long = la clase envolvente es Long
            float = la clase envolvente es Float
            double = la clase envolvente es Double
            boolean = la clase envolvente es Boolean
            byte = la clase envolvente es Byte
            char = la clase envolvente es Character
            short = la clase envolvente es Short
        */
        
        
        //int entero = 10;
        int enteroPrim = 10; //Tipo primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10; //Tipo Object
        entero.byteValue(); //Podemos acceder a metodos de la clase
        System.out.println("entero = " + entero.doubleValue()); //Autoboxing --> Lo convertimos a tipo primitivo Double
        
        int entero2 = entero; //Unboxing --> Ya no es un objeto, es un tipo primitivo
        System.out.println("entero2 = " + entero2);
        
        
    }
}
