/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql.methodes;

import entity.Jabatan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.interfaces.SqlInJabatan;

/**
 *
 * @author Prie
 */
public class SqlJabatan implements SqlInJabatan {
    private Connection conn = null;

    public SqlJabatan(Connection conn){
        this.conn = conn;
    }

    public void insert(Jabatan jabatan) {
        String sql = "INSERT INTO tbl_jabatan(nmJbtn, gapok) VALUES(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, jabatan.getNmJab());
            ps.setDouble(2, jabatan.getGaPok());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlJabatan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Jabatan jabatan, int idLama) {
        String sql = "UPDATE tbl_jabatan SET nmJbtn=?,gapok=? WHERE idJbtn=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, jabatan.getNmJab());
            ps.setDouble(2, jabatan.getGaPok());
            ps.setInt(3, idLama);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlJabatan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM tbl_jabatan WHERE idJbtn=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlPotongan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Jabatan getBy(String id) {
        String sql = "SELECT * FROM tbl_jabatan WHERE idJbtn=? ORDER BY idJbtn ASC";
        Jabatan jbt = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                jbt = new Jabatan();
                jbt.setIdJab(rs.getInt("idJbtn"));
                jbt.setNmJab(rs.getString("nmJbtn"));
                jbt.setGaPok(rs.getDouble("gapok"));
            }
            return jbt;
        } catch (SQLException ex) {
            Logger.getLogger(SqlJabatan.class.getName()).log(Level.SEVERE, null, ex);
            return jbt;
        }
    }

    public List<Jabatan> getAll() {
        String sql = "SELECT * FROM tbl_jabatan ORDER BY idJbtn ASC";
        List<Jabatan> lst = new ArrayList<Jabatan>();
        try {
            Statement sm = conn.createStatement();
            ResultSet rs = sm.executeQuery(sql);
            while (rs.next()) {
                Jabatan jbt = new Jabatan();
                jbt.setIdJab(rs.getInt("idJbtn"));
                jbt.setNmJab(rs.getString("nmJbtn"));
                jbt.setGaPok(rs.getDouble("gapok"));
                lst.add(jbt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlJabatan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;
    }

    public List<Jabatan> getAll(String kunci) {
        String sql = "SELECT * FROM tbl_jabatan WHERE nmJbtn LIKE ? ORDER BY idJbtn ASC";
        List<Jabatan> lst = new ArrayList<Jabatan>();
        try {            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%"+kunci+"%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Jabatan jbt = new Jabatan();
                jbt.setIdJab(rs.getInt("idJbtn"));
                jbt.setNmJab(rs.getString("nmJbtn"));
                jbt.setGaPok(rs.getDouble("gapok"));
                lst.add(jbt);
            }
            return lst;
        } catch (SQLException ex) {
            Logger.getLogger(SqlJabatan.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
