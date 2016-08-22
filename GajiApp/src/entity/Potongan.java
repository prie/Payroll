/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author Prie
 */
public class Potongan {
    private int idPot;
    private String nmPot;

    public Potongan(){
    }

    public Potongan(int idPot, String nmPot){
        this.idPot = idPot;
        this.nmPot = nmPot;
    }

    public String getNmPot() {
        return nmPot;
    }

    public void setNmPot(String nmPot) {
        this.nmPot = nmPot;
    }

    public int getIdPot() {
        return idPot;
    }

    public void setIdPot(int idPot) {
        this.idPot = idPot;
    }
    
}
