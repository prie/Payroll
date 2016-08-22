/**
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 **/

/*
 * Waktu.java
 *
 * Created on Feb 17, 2011, 10:36:22 PM
 */
package tools;

import java.util.Date;
import java.util.Timer;
import java.util.Calendar;
import javax.swing.JLabel;
import java.util.TimerTask;
import java.text.DateFormat;

/**
 * @author Prie
 **/
public class Waktu {

//Variabel Global
    private Date date;
    private Timer timer;
    private Calendar cal;
    private DateFormat dateFormatter;
//TimerTime Constructor

    public Waktu(JLabel label, int seconds) {
        timer = new Timer();
        timer.scheduleAtFixedRate(new clsTime(label), 0, seconds * 1000);
    }
//TimerTime inner class

    public class clsTime extends TimerTask {

        private JLabel label = new JLabel();
        private boolean visible = false;
        //Method untuk menampilkan waktu system

        public clsTime(JLabel label) {
            this.label = label;
        }

        public void run() {
            cal = Calendar.getInstance();
            date = cal.getTime();           //Ambil waktu default system
            dateFormatter = DateFormat.getTimeInstance();
            //Tampilkan ke JLabel
            String temp = (new java.util.Date(new java.util.Date().getYear(), new java.util.Date().getMonth(), new java.util.Date().getDate()).toString());
            String temp2 = temp.substring(0, 11);
            String temp3 = temp.substring(24, 28);
            label.setText(dateFormatter.format(date));
        }
    }
}
