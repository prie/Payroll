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
public class Penggajian {
    private int idGji;
    private String Slip;
    private int idAbs;
    private String nmPeg;
    private String nmJab;
    private double  gaPok;
    private String bln;
    private int thn;
    private int hrKrj;
    private int hrHdr;
    private double awGji;
    private double inStf;
    private double bns;
    private double ktGji;
    private String nmPot;
    private double jlPot;
    private double TtPot;
    private double bsGji;
    private Date tgl;
    private int idUsr;
    private String nmUsr;

    public Penggajian(){
    }

    public Penggajian(int idGji,String Slip,int idAbs,String nmPeg,String nmJab,double  gapok,
            String bln,int thn,int hrKrj,int hrHdr,double awGji,double inStf,double bns,
            double ktGji,String nmPot,double jlPot,double TtPot,double bsGji,Date tgl,
            int idUsr,String nmUsr){
        this.idGji = idGji;
        this.Slip = Slip;
        this.idAbs = idAbs;
        this.nmPeg = nmPeg;
        this.nmJab = nmJab;
        this.gaPok = gapok;
        this.bln = bln;
        this.thn = thn;
        this.hrKrj = hrKrj;
        this.hrHdr = hrHdr;
        this.awGji = awGji;
        this.inStf = inStf;
        this.bns = bns;
        this.ktGji = ktGji;
        this.nmPot = nmPot;
        this.jlPot = jlPot;
        this.TtPot = TtPot;
        this.bsGji = bsGji;
        this.tgl = tgl;
        this.idUsr = idUsr;
        this.nmUsr = nmUsr;
    }

    public int getIdGji() {
        return idGji;
    }

    public void setIdGji(int idGji) {
        this.idGji = idGji;
    }

    public String getSlip() {
        return Slip;
    }

    public void setSlip(String Slip) {
        this.Slip = Slip;
    }

    public int getIdAbs() {
        return idAbs;
    }

    public void setIdAbs(int idAbs) {
        this.idAbs = idAbs;
    }

    public String getNmPeg() {
        return nmPeg;
    }

    public void setNmPeg(String nmPeg) {
        this.nmPeg = nmPeg;
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

    public int getHrKrj() {
        return hrKrj;
    }

    public void setHrKrj(int hrKrj) {
        this.hrKrj = hrKrj;
    }

    public int getHrHdr() {
        return hrHdr;
    }

    public void setHrHdr(int hrHdr) {
        this.hrHdr = hrHdr;
    }

    public double getAwGji() {
        return awGji;
    }

    public void setAwGji(double awGji) {
        this.awGji = awGji;
    }

    public double getInStf() {
        return inStf;
    }

    public void setInStf(double inStf) {
        this.inStf = inStf;
    }

    public double getBns() {
        return bns;
    }

    public void setBns(double bns) {
        this.bns = bns;
    }

    public double getKtGji() {
        return ktGji;
    }

    public void setKtGji(double ktGji) {
        this.ktGji = ktGji;
    }

    public String getNmPot() {
        return nmPot;
    }

    public void setNmPot(String nmPot) {
        this.nmPot = nmPot;
    }

    public double getJlPot() {
        return jlPot;
    }

    public void setJlPot(double jlPot) {
        this.jlPot = jlPot;
    }

    public double getTtPot() {
        return TtPot;
    }

    public void setTtPot(double TtPot) {
        this.TtPot = TtPot;
    }

    public double getBsGji() {
        return bsGji;
    }

    public void setBsGji(double bsGji) {
        this.bsGji = bsGji;
    }

    public Date getTgl() {
        return tgl;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

    public int getIdUsr() {
        return idUsr;
    }

    public void setIdUsr(int idUsr) {
        this.idUsr = idUsr;
    }

    public String getNmUsr() {
        return nmUsr;
    }

    public void setNmUsr(String nmUsr) {
        this.nmUsr = nmUsr;
    }
    
}
