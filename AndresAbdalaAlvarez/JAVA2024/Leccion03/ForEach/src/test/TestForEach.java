package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9};//Sintaxis resumida
        
        
        for (int edade: edades){//Sintaxis del ForEach
            System.out.println("edade = " + edade);
        }
        //NO podemos mostrar el indice con ForEach
        
        
        //EJEMPLO CON CLASES
        Persona personas[] = {new Persona("Juan"), new Persona("Carla"), new Persona("Beatriz")};
        //No podemos inferir el tipo en un arreglo
        
        //ForEach
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
        
        
        
        
        
    }
    
}
