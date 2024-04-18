package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //Bloque de inicializacion statico
    //Bloque de codigo de inicializacion
    static{
        System.out.println("Ejecucion bloque statico");
        ++Persona.contadorPersonas;
        //++contadorPersonas; --> tambien funciona
    }
    
    //Bloque de inicializacion NO estatico solo con ->{} (Contecto dinamico)
    //Se ejecuta antes del constructor de nuestra clase <----- IMPORTANTE!
    {
        System.out.println("Ejecucion del bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;//Incrementamos el atributo
    }
    
    //Los bloques de inicializacion se ejecutan antes del constructor
    
    
    public Persona(){
        System.out.println("Esta es la ejecucion del constructor");
    }
    
    //Getter para recuperar el idPersona
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
    
    
}
