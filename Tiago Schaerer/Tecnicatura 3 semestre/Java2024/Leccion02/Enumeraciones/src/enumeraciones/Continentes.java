package enumeraciones;

public enum Continentes {
    AFRICA(53, "1.2 billones"),
    EUROPA(46, "5 billones"),
    ASIA(44, "3.5 billones"),
    AMERICA(34, "2.1 billones"),
    OCEANIA(14, "7 billones");//Al terminar se puede utilizar el punto y coma
    
    private final int paises;
    private String habitantes;
    
    Continentes(int paises, String habitantes){
    this.paises = paises;
    this.habitantes = habitantes;
    }
    
    //Metodo Get
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
}
