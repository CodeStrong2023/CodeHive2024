package UTN;

import UTN.conexion.Conexion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var conexion = Conexion.getConnection();
        if(conexion != null){
            System.out.println("CONEXION EXITOSA!: "+conexion);
        }else {
            System.out.println("ERROR AL CONECTARSE");
        }
    }//Fin Main

}//FIn clase