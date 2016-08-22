/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.sql.Date;

/**
 *
 * @author Prie
 */
public class Pegawai {
    private int idPeg;
    private String Nik;
    private int idJab;
    private String nmPeg;
    private String Almt;
    private String Kota;
    private String Tlp;
    private Date tglMsk;
    private String lvl;
    private String Jrsn;
    private String nmJab;

    public Pegawai(){
    }

    public Pegawai(int idPeg,String Nik,int idJab,String nmPeg,String Almt,String Kota,
            String Tlp,Date tglMask,String Lvl,String Jrsn){
        this.idPeg = idPeg;
        this.Nik = Nik;
        this.idJab = idJab;
        this.nmPeg = nmPeg;
        this.Almt = Almt;
        this.Kota = Kota;
        this.Tlp = Tlp;
        this.tglMsk = tglMask;
        this.lvl = Lvl;
        this.Jrsn = Jrsn;
    }

    public int getIdPeg() {
        return idPeg;
    }

    public void setIdPeg(int idPeg) {
        this.idPeg = idPeg;
    }

    public String getNik() {
        return Nik;
    }

    public void setNik(String Nik) {
        this.Nik = Nik;
    }

    public int getIdJab() {
        return idJab;
    }

    public void setIdJab(int idJab) {
        this.idJab = idJab;
    }

    public String getNmPeg() {
        return nmPeg;
    }

    public void setNmPeg(String nmPeg) {
        this.nmPeg = nmPeg;
    }

    public String getAlmt() {
        return Almt;
    }

    public void setAlmt(String Almt) {
        this.Almt = Almt;
    }

    public String getKota() {
        return Kota;
    }

    public void setKota(String Kota) {
        this.Kota = Kota;
    }

    public String getTlp() {
        return Tlp;
    }

    public void setTlp(String Tlp) {
        this.Tlp = Tlp;
    }

    public Date getTglMsk() {
        return tglMsk;
    }

    public void setTglMsk(Date tglMsk) {
        this.tglMsk = tglMsk;
    }

    public String getLvl() {
        return lvl;
    }

    public void setLvl(String lvl) {
        this.lvl = lvl;
    }

    public String getJrsn() {
        return Jrsn;
    }

    public void setJrsn(String Jrsn) {
        this.Jrsn = Jrsn;
    }

    public String getNmJab() {
        return nmJab;
    }

    public void setNmJab(String nmJab) {
        this.nmJab = nmJab;
    }
    
}
