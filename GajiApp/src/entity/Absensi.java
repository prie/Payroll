/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author Prie
 */
public class Absensi {
    private int idAbs;
    private int idPeg;
    private String nmPeg;
    private String bln;
    private int thn;
    private int jmHrKj;
    private int jKrHr;
    private int jHrHd;

    /******** Untuk input Jabtan di frmPenggajian*******/
    private String nmJab;
    private double gapok;

    public Absensi(){

    }

    public Absensi(int idAbs, int idPeg, String nmPeg, String bln,int thn,
            int jmHrKj,int jKrHr,int jHrHd){
        this.idAbs = idAbs;
        this.idPeg = idPeg;
        this.nmPeg = nmPeg;
        this.bln = bln;
        this.thn = thn;
        this.thn = jmHrKj;
        this.thn = jKrHr;
        this.thn = jHrHd;
    }

    public int getIdAbs() {
        return idAbs;
    }

    public void setIdAbs(int idAbs) {
        this.idAbs = idAbs;
    }

    public int getIdPeg() {
        return idPeg;
    }

    public void setIdPeg(int idPeg) {
        this.idPeg = idPeg;
    }

    public String getNmPeg() {
        return nmPeg;
    }

    public void setNmPeg(String nmPeg) {
        this.nmPeg = nmPeg;
    }

    public String getBln() {
        return bln;
    }

    public void setBln(String bln) {
        this.bln = bln;
    }

    public int getThn() {
        return thn;
    }

    public void setThn(int thn) {
        this.thn = thn;
    }

    public int getJmHrKj() {
        return jmHrKj;
    }

    public void setJmHrKj(int jmHrKj) {
        this.jmHrKj = jmHrKj;
    }

    public int getjKrHr() {
        return jKrHr;
    }

    public void setjKrHr(int jKrHr) {
        this.jKrHr = jKrHr;
    }

    public int getjHrHd() {
        return jHrHd;
    }

    public void setjHrHd(int jHrHd) {
        this.jHrHd = jHrHd;
    }
    
    public String getNmJab() {
        return nmJab;
    }

    public void setNmJab(String nmJab) {
        this.nmJab = nmJab;
    }

    public double getGapok() {
        return gapok;
    }

    public void setGapok(double gapok) {
        this.gapok = gapok;
    }
    
}
