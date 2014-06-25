/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.prueba.DAO;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
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
            int y = MaxId() + 1;
            JOptionPane.showMessageDialog(null, y);
            sql ="INSERT INTO Iglesia VALUES('"+y+"','"+idd+"','"+idt+"','"+igle+"','"+est+"')";
            cx = Conexion.getConexion();
            st = cx.createStatement();
            op = st.executeUpdate(sql);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "al guaradar: "+e);
        }   
    return op;
    }
    public int MaxId(){
        int k = 0;
     try {
            sql ="SELECT MAX(idiglesia) as idmax FROM iglesia";
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            k = rs.getInt("idmax");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "jonas: "+e);
        }   
    return k;
    
    }
}
