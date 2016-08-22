/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author Prie
 */
public class DetPotongan {
    private int idDet;
    private int idGji;
    private int idPot;
    private String nmPot;
    private double jmlPot;

    public DetPotongan(){
    }

    public DetPotongan(int idDet,int idGji,int idPot,String nmPot,double jmlPot){
        this.idDet = idDet;
        this.idGji = idGji;
        this.idPot = idPot;
        this.nmPot = nmPot;
        this.jmlPot = jmlPot;
    }

    public int getIdDet() {
        return idDet;
    }

    public void setIdDet(int idDet) {
        this.idDet = idDet;
    }

    public int getIdGji() {
        return idGji;
    }

    public void setIdGji(int idGji) {
        this.idGji = idGji;
    }

    public int getIdPot() {
        return idPot;
    }

    public void setIdPot(int idPot) {
        this.idPot = idPot;
    }

    public String getNmPot() {
        return nmPot;
    }

    public void setNmPot(String nmPot) {
        this.nmPot = nmPot;
    }

    public double getJmlPot() {
        return jmlPot;
    }

    public void setJmlPot(double jmlPot) {
        this.jmlPot = jmlPot;
    }
    
}
