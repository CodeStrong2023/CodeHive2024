
package ar.com.system2023.mundopc;


public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor Monitor;
    private Teclado Teclado;
    private Raton Raton;
    private static int contadorComputadoras;
    //Relacion de agregacion: los objectos Monitor pueden existir sin que exista la clase computadora
    
    //Creamos el constructor Vacio
    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;
    }
    
    //Constructor 2
    public Computadora(String nombre, Monitor Monitor, Teclado Teclado, Raton Raton){
        this();
        this.nombre  = nombre;
        this.Monitor = Monitor;
        this.Teclado = Teclado;
        this.Raton = Raton;
    }
    
    //idComputadora
    public int getIdComputadora(){
        return this.idComputadora;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return this.Monitor;
    }

    public void setMonitor(Monitor Monitor) {
        this.Monitor = Monitor;
    }

    public Teclado getTeclado() {
        return this.Teclado;
    }

    public void setTeclado(Teclado Teclado) {
        this.Teclado = Teclado;
    }

    public Raton getRaton() {
        return this.Raton;
    }

    public void setRaton(Raton Raton) {
        this.Raton = Raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", Monitor=" + Monitor + ", Teclado=" + Teclado + ", Raton=" + Raton + '}';
    }
    
    
    
    
    
}
