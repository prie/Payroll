/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prie
 */
public class KonekDB {
    private static Connection konek = null;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/kp_gaji";
    private static final String username = "root";
    private static final String password = "root";

    private static void buatKoneksi(){
        if(konek==null){
            try {
                Class.forName(driver).newInstance();
                konek = DriverManager.getConnection(url, username, password);
                System.out.println("Koneksi Database Sukses");
            } catch (InstantiationException ex) {
                Logger.getLogger(KonekDB.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(KonekDB.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(KonekDB.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(KonekDB.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    /**
     * @return the konek
     */
    public static Connection getKonek() {
        buatKoneksi();
        return konek;
    }
    
}
