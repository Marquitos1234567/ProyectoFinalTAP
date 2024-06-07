/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    public Conexion(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/actividades_complementarias", "root", "");
        } catch (Exception e) {
            System.err.println("No se pudo establecer conexion con la base de datos. Error: "+ e);
        }
    }
    public Connection getConnection(){
    return con;
    }
}
