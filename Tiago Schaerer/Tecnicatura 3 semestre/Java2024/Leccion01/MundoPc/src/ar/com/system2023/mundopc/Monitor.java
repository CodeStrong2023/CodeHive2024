
package ar.com.system2023.mundopc;

public class Monitor{
    private final int idMonitor;
    //Se pone en rojo cuando trabajamos en final mientras no tengamos el constructor
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    //Constructor vacio de manera privada -> porque lo llama desde el publico
    //Va a ir haciendo el incremento de cada uno de los monitores
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    public Monitor(String marca, double tamanio){
        this(); //LLamado al constructor vacio
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
    //Ingresamos manualmente el getidMonitor. Ingresamos solo el GET porque no podemos modificar el valor
    public int getIdMonitor(){
        return this.idMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
    
    
}
