/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.prueba.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import pe.edu.upeu.prueba.config.Conexion;

/**
 *
 * @author admin-harold.rojas
 */
public class IglesiaDAO {
    private String sql;
    private Statement st;
    private Connection cx;
    private ResultSet rs;
    int op;
    public int RegistrarIglesia(int idd, int idt, String igle, int est){
        try {
            sql ="INSERT INTO Iglesia VALUES(null,'"+idd+"','"+idt+"','"+igle+"','"+est+"')";
            cx = Conexion.getConexion();
            st = cx.createStatement();
            op = st.executeUpdate(sql);
        } catch (Exception e) {
        }   
    return op;
    }
}
