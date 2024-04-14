
package enumeraciones;


public enum Continentes {
    AFRICA(56, "1.5 billones"),
    EUROPA(40, "0.5 billones"),
    AMERICA(78, "2.2 billones"),
    OCEANIA(15, "1.2 billones"),
    ASIA(12, "3.0 billones"),
    ANTARTIDA(3,"0.3 billones ");
    
   
    private final int paises; //es int porque el atributo de la enum
    private String habitantes; //si queremos agregar mas atributos a la enum
    //creamos tambien la clase string
    
    Continentes(int paises, String habitantes){ //es necesario agregar al constructor los datos del string
        this.paises=paises;
        this.habitantes=habitantes;
}
    //Metodo get
    public int getPaises(){
        return  this.paises;
        
}
    //creamos tambien el get para el string
    public String getHabitantes(){
        return this.habitantes;
    }
}
