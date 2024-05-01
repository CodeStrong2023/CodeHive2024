
package domain;


public class Gerente extends Empleado{
    private String departamento; //No se va a extender a ninguna otra clase
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //Anotacion: modifica el comportamiento del metodo
    
    @Override
    public String obtenerDetalles(){
        //return "Nombre: "+super.nombre+", Sueldo: "+super.sueldo+", Departamento: "+this.departamento;
        return super.obtenerDetalles() + ", Departamento: "+this.departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
