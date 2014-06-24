/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.prueba.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pe.edu.upeu.prueba.config.Conexion;
import pe.edu.upeu.prueba.modelo.Distrito;

/**
 *
 * @author admin-harold.rojas
 */
public class DistritoDAO {
    private final ArrayList<Distrito> lista = new ArrayList();
    Distrito d = new Distrito();
    private String sql;
    private Statement st;
    private Connection cx;
    private ResultSet rs;
    public ArrayList<Distrito> listarDistrito(){
    sql = "SELECT *FROM distrito";
        try {
            cx = Conexion.getConexion();
            if(cx!=null){
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Distrito.loadDistrito(rs));           
            }
            }else{ JOptionPane.showMessageDialog(null, "falla");}
        } catch (SQLException e) {
            
        }        
    return lista;
    }
}
