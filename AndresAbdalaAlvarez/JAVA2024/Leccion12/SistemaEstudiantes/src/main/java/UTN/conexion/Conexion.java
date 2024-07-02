package UTN.conexion;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection(){
        Connection conexion = null;
        //Variables para conectarnos a la base de datos
        var baseDatos = "estudiantes";
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;
        var usuario = "root";
        var password = "admin";


        //cargamos la clase del driver de mySQL en memoria
        try{
            conexion = DriverManager.getConnection(url, usuario, password);
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Ocurrio un error en la conexion: "+ e);
        }//Fin catch

        return conexion;

    }//Fin metodo getConnection
}//Fin clase conexion
