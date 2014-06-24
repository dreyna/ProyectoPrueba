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
import pe.edu.upeu.prueba.config.Conexion;
import pe.edu.upeu.prueba.modelo.Distrito;
import pe.edu.upeu.prueba.modelo.Tipo_Iglesia;

/**
 *
 * @author admin-harold.rojas
 */
public class Tipo_IglesiaDAO {
    private final ArrayList<Tipo_Iglesia> lista = new ArrayList();
    Distrito d = new Distrito();
    private String sql;
    private Statement st;
    private Connection cx;
    private ResultSet rs;
    public ArrayList<Tipo_Iglesia> listarTipo_Iglesia(){
    sql = "SELECT *FROM Tipo_Iglesia";//consulta a la tabla tipo iglesia
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Tipo_Iglesia.loadTipo_Iglesia(rs));           
            }
        } catch (SQLException e) {            
        }        
    return lista;
    }
     public int idTipoIglesia(String tipo_i){
    int id = 0;
        sql = "select *from tipo_iglesia where tipo_iglesia="+tipo_i;
        try{
        cx = Conexion.getConexion();
        st = cx.createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            id = rs.getInt("idtipo_iglesia");
        }
        }catch(SQLException ex){        
        }
    return id;
    }
}
