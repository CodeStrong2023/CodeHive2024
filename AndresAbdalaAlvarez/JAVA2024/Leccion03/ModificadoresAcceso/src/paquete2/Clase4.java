package paquete2;

public class Clase4 {
    private String atributoPrivate = "atributo Privado";
    
    
    private Clase4(){
        System.out.println("Constructor privado");
    }
    
    
    //Creamos un constructor public para poder crear objectos
    public Clase4(String argumento){ //Aqui se puede llamar al constructor vacio
        super();
        System.out.println("Constructor publico");
    }
    
    
    //Metodo privado
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivate() {
        return this.atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    
    
}
