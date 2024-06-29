package domain;

import java.io.Serializable;

//Para que se considere Java Beans debemos agregar el implements y el serializable
//Estamos convirtiendo nuestro objeto a 0 y 1
public class Persona implements Serializable {
    //las variables deben ser private
    private String nombre;
    private String apellido;
    
    //Debe tener un constructor vacio
    public Persona(){
        
    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
}
