
package domain;


public class Empleado {
    protected String nombre;
    protected double sueldo;
    
    
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    
    //Metodo para obtener la sobreescritura
    public String obtenerDetalles(){
        return "Nombre: "+this.nombre+ ", Sueldo: "+this.sueldo;
    }

    
    //-----------GETTER AND SETTER-----------
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    //-----------GETTER AND SETTER-----------
    
}
