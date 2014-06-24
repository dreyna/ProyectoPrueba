/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.prueba.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin-harold.rojas
 */
public class Tipo_Iglesia {
    private int idti;
    private String nom_tipo;

    public Tipo_Iglesia() {
    }

    public Tipo_Iglesia(String nom_tipo) {
        this.nom_tipo = nom_tipo;
    }

    public int getIdti() {
        return idti;
    }

    public void setIdti(int idti) {
        this.idti = idti;
    }

    public String getNom_tipo() {
        return nom_tipo;
    }

    public void setNom_tipo(String nom_tipo) {
        this.nom_tipo = nom_tipo;
    }
    public static Tipo_Iglesia loadTipo_Iglesia(ResultSet rs) throws SQLException{
        Tipo_Iglesia i = new Tipo_Iglesia();
        i.setIdti(rs.getInt("idtipo_iglesia"));
        i.setNom_tipo(rs.getString("tipo_iglesia"));
        return i;
    }
}
