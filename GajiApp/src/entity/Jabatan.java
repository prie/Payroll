/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author Prie
 */
public class Jabatan {
    private int idJab;
    private String nmJab;
    private double  gaPok;

    public Jabatan(){
    }

    public Jabatan(int idjab, String nmjab, double  gapok){
        this.idJab = idjab;
        this.nmJab = nmjab;
        this.gaPok = gapok;
    }

    public int getIdJab() {
        return idJab;
    }

    public void setIdJab(int idJab) {
        this.idJab = idJab;
    }

    public String getNmJab() {
        return nmJab;
    }

    public void setNmJab(String nmJab) {
        this.nmJab = nmJab;
    }

    public double getGaPok() {
        return gaPok;
    }

    public void setGaPok(double gaPok) {
        this.gaPok = gaPok;
    }

    
}
