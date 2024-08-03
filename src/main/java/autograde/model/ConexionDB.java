/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autograde.model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author juanr
 */
public class ConexionDB {
    Connection con;
    
    public Connection conectarBD(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(""," ","");
            System.out.println("Conexion completa");
        }catch(Exception e){
            System.out.println("Conexion fallida"+e);
        }
        return con;
}
}
