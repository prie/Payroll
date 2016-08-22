/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import form.gaji.frmUtama;
import form.gaji.splash;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here

        splash spl = new splash();
        spl.setVisible(true);
        for(int i=0;i<100;i++){
            try {
                spl.getProgressBar().setValue(i);
                Thread.sleep(25);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        spl.dispose();
        frmUtama utm = new frmUtama();
        utm.setVisible(true);        
    }

}
