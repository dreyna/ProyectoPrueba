/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.prueba.modelo;

/**
 *
 * @author benjamin.reyna
 */
public class Visita {
    private int idvis;
    private int idper;
    private String nom;
    private String fecha;
    private String direcc;
    private String tel;
    private String detalle;
    private String hora;
    private int nvis;
    private String bau;

    public Visita() {
    }

    public Visita(int idper, String direcc, String tel, String detalle, int nvis, String bau) {
        this.idper = idper;
        this.direcc = direcc;
        this.tel = tel;
        this.detalle = detalle;
        this.nvis = nvis;
        this.bau = bau;
    }

    public int getIdvis() {
        return idvis;
    }

    public void setIdvis(int idvis) {
        this.idvis = idvis;
    }

    public int getIdper() {
        return idper;
    }

    public void setIdper(int idper) {
        this.idper = idper;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getNvis() {
        return nvis;
    }

    public void setNvis(int nvis) {
        this.nvis = nvis;
    }

    public String getBau() {
        return bau;
    }

    public void setBau(String bau) {
        this.bau = bau;
    } 
}
