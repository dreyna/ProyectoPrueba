/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.prueba.modelo;

/**
 *
 * @author admin-harold.rojas
 */
public class Iglesia {
    private int idi;
    private int idd;
    private int idti;
    private String igle;
    private String cuenta;

    public Iglesia() {
    }

    public Iglesia(int idd, int idti, String igle, String cuenta) {
        this.idd = idd;
        this.idti = idti;
        this.igle = igle;
        this.cuenta = cuenta;
    }

    public int getIdi() {
        return idi;
    }

    public void setIdi(int idi) {
        this.idi = idi;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public int getIdti() {
        return idti;
    }

    public void setIdti(int idti) {
        this.idti = idti;
    }

    public String getIgle() {
        return igle;
    }

    public void setIgle(String igle) {
        this.igle = igle;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
}
