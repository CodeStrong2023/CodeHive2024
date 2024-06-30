import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListadoPersonasApp {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //Empezamos con el menu
        var salir = false;
        while(!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada, personas);
            }catch(Exception e){
                System.out.println("Ocurrio un error "+e.getMessage());
            }
            System.out.println();//Salto de linea

        }//Fin del ciclo while
    }//Fin metodo Main

    private static void mostrarMenu(){
        //Mostrar las opciones
        System.out.print("""
               ******** Listado de Peronas ********
               1. Agregar
               2. Listar
               3. Salir
                """);
        System.out.print("Digite una de las opciones: ");

    }//Fin del metodo mostrarMenu

    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        //Revisamos la opcion digitada a traves de un Switch
        switch (opcion){
            case 1 -> {//Agregar una persona a la lista
                System.out.print("Digite el nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("Digite el telefono: ");
                var tel = entrada.nextLine();
                System.out.print("Digite el email: ");
                var email = entrada.nextLine();
                //Creamos el objeto Persona
                Persona persona = new Persona(nombre, tel, email);
                //Agregamos el objeto persona a la lista
                personas.add(persona);
                System.out.println("La lista tiene: "+personas.size()+" elementos");

            }//Fin del caso 1
            case 2 -> {//Listar a las personas
                System.out.println("Listado de personas: ");
                //Utilizamos Mejoras con Lambda y metodo de referencia??
                //personas.forEach((persona) -> System.out.println(persona));//1er forma con lambda
                personas.forEach(System.out::println); //Por cada objecto de tipo persona se va a imprimir --> Metodo de referencia
            }//Fin del caso 2

            case 3 -> {//Salir del ciclo
                System.out.println("Hasta pronto....");
                salir = true;
            }//Fin caso 3
            default -> System.out.println("Opcion Incorrecta "+ opcion);
        }//Fin del Switch
        return salir;
    }//Fin del metodo ejecutarOperacion
}//Fin de listadoPersonasApp



















