/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.prueba.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author admin-harold.rojas
 */
public class Conexion {
    private static final String url ="jdbc:mysql://localhost/bd_visitas";
    private static final String usuario ="root";
    private static final String clave ="root";
    private static Connection conex=null;   
    public static Connection getConexion(){
        try {
            if(conex==null){
            Class.forName("com.mysql.jdbc.Driver");//cargar driver de mysql
            conex = DriverManager.getConnection(url, usuario, clave);
            }
        } catch (ClassNotFoundException | SQLException e) {
        } 
    return conex;
    }
}
