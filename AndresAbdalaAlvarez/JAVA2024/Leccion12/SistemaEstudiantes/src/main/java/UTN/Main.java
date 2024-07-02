package UTN;

import UTN.conexion.Conexion;

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