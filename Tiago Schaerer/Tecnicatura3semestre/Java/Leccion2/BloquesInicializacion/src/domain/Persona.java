
package domain;

class Persona {
    //exiten 2 tipos de bloques
    //estaticos y dinamicos
    //se ejecutan antes del constructor
    
    //creamos los atributos
    private final int IdPersona; //nos mostrara error ya que necesita el cosntructor
    
    private static int contadorPersonas;
    //creamos bloque de inicializacion estatico
    static{
        System.out.println("Ejecucion del bloque estatatico"); //se ejecuta primero
        //trabajamos incrementando el atributo estatico
        //dentro dle bloque estatico solo se trabajan con atributos estaticos
        ++Persona.contadorPersonas;   
    }
    //bloque no estatico solo abrimos llaves
    {//contexto dinamico
        System.out.println("Ejecucion dle bloque NO estatico");
        //utilizamos el operador this
        this.IdPersona= Persona.contadorPersonas++;//incrementamos el atributo
}
    
    //creamos elconstructor vacio
    public Persona(){
        System.out.println("Ejecucion del contructor");
    
}
    //realizamos metodo get
    public int getIdPersona(){
        return this.IdPersona;
}

    @Override
    public String toString() {
        return "Persona{" + "IdPersona=" + IdPersona + '}';
    }
    
}
