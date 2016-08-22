/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql.methodes;

import entity.Potongan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.interfaces.SqlInPotongan;

/**
 *
 * @author Prie
 */
public class SqlPotongan implements SqlInPotongan {
    private Connection conn = null;

    public SqlPotongan(Connection conn){
        this.conn = conn;
    }

    public void insert(Potongan potongan){
        String sql = "INSERT INTO tbl_potongan(nmPotong) VALUES(?)";
        try {            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, potongan.getNmPot());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlPotongan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void update(Potongan potongan, int oldId){
        String sql = "UPDATE tbl_potongan SET nmPotong=? WHERE idPotong=?";
        try {            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, potongan.getNmPot());
            ps.setInt(2, oldId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlPotongan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void delete(int id){
        String sql = "DELETE FROM tbl_potongan WHERE idPotong=?";
        try {            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlPotongan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Potongan getBy(int id){
        String sql = "SELECT * FROM tbl_potongan WHERE idPotong=? ORDER BY idPotong ASC";
        Potongan ptg = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ptg = new Potongan();
                ptg.setIdPot(rs.getInt("idPotong"));
                ptg.setNmPot(rs.getString("nmPotong"));
            }
            return ptg;
        } catch (SQLException ex) {
            Logger.getLogger(SqlPotongan.class.getName()).log(Level.SEVERE, null, ex);
            return ptg;
        }
    }
    public List<Potongan> getAll(){
        String sql = "SELECT * FROM tbl_potongan ORDER BY idPotong ASC";
        List<Potongan> lst = new ArrayList<Potongan>();
        try {            
            Statement sm = conn.createStatement();
            ResultSet rs = sm.executeQuery(sql);
            while (rs.next()) {
                Potongan ptg = new Potongan();
                ptg.setIdPot(rs.getInt("idPotong"));
                ptg.setNmPot(rs.getString("nmPotong"));
                lst.add(ptg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlPotongan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;
    }
    public List<Potongan> getAll(String kunci){
        String sql = "SELECT * FROM tbl_potongan WHERE nmPotong LIKE ? ORDER BY idPotong ASC";
        try {            
            List<Potongan> lst = new ArrayList<Potongan>();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + kunci + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Potongan ptg = new Potongan();
                ptg.setIdPot(rs.getInt("idPotong"));
                ptg.setNmPot(rs.getString("nmPotong"));
                lst.add(ptg);
            }
            return lst;
        } catch (SQLException ex) {
            Logger.getLogger(SqlPotongan.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
