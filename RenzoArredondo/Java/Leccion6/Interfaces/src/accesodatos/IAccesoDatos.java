
package accesodatos;

public interface IAccesoDatos {
    //Una interface no hereda de la clase object
    //CUando declaramos un atributo dentro de una interface necesita que le asignemos un parametro si o si
    //Todos los metodos van a ser abstractos
    //Interface es comportamiento
    
    int MAX_REGISTRO = 10;//Publico Final y static(Por default)
    
    //Metodo insertar es abstracto y sin cuerpo
    void insertar();//No abrimos llaves
    
    void listar();
    
    void actualizar();
    
    void eliminar();
    
    
    
    
    
    
    
}
