/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author Prie
 */
public class User {
    private int idAdm;
    private int idPeg;
    private String nmAdm;
    private String usrNme;
    private String pssWrd;

    public User(){

    }

    public User(int idAdm, int idPeg, String nmAdm, String usrNme,String pssWrd){
        this.idAdm = idAdm;
        this.idPeg = idPeg;
        this.nmAdm = nmAdm;
        this.usrNme = usrNme;
        this.pssWrd = pssWrd;
    }

    public int getIdAdm() {
        return idAdm;
    }

    public void setIdAdm(int idAdm) {
        this.idAdm = idAdm;
    }

    public int getIdPeg() {
        return idPeg;
    }

    public void setIdPeg(int idPeg) {
        this.idPeg = idPeg;
    }

    public String getNmAdm() {
        return nmAdm;
    }

    public void setNmAdm(String nmAdm) {
        this.nmAdm = nmAdm;
    }

    public String getUsrNme() {
        return usrNme;
    }

    public void setUsrNme(String usrNme) {
        this.usrNme = usrNme;
    }

    public String getPssWrd() {
        return pssWrd;
    }

    public void setPssWrd(String pssWrd) {
        this.pssWrd = pssWrd;
    }

    
}
