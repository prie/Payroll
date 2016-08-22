/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql.methodes;

import entity.Absensi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.interfaces.SqlInAbsensi;

/**
 *
 * @author Prie
 */
public class SqlAbsensi implements SqlInAbsensi {
    private Connection conn = null;

    public SqlAbsensi(Connection conn){
        this.conn = conn;
    }

    public void insert(Absensi absensi) {
        String sql = "INSERT INTO tbl_absensi VALUES(null,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, absensi.getIdPeg());
            ps.setInt(2, absensi.getJmHrKj());
            ps.setInt(3, absensi.getjKrHr());
            ps.setInt(4, absensi.getjHrHd());
            ps.setString(5, absensi.getBln());
            ps.setInt(6, absensi.getThn());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlAbsensi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Absensi absensi, int idLama) {
        String sql = "UPDATE tbl_absensi SET idPegawai=?,jmlHrKrj=?,jmlJpHr=?,"
                + "hrHadirJm=?,bulan=?,tahun=? WHERE idAbsen=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, absensi.getIdPeg());
            ps.setInt(2, absensi.getJmHrKj());
            ps.setInt(3, absensi.getjKrHr());
            ps.setInt(4, absensi.getjHrHd());
            ps.setString(5, absensi.getBln());
            ps.setInt(6, absensi.getThn());
            ps.setInt(7, idLama);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlAbsensi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM tbl_absensi WHERE idAbsen=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlAbsensi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Absensi getBy(int id) {
        String sql = "SELECT * FROM tbl_absensi WHERE idAbsen=?";
        Absensi abs = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            Statement sm = conn.createStatement();
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                abs = new Absensi();
                abs.setIdAbs(rs.getInt("idAbsen"));
                abs.setIdPeg(rs.getInt("idPegawai"));
                abs.setJmHrKj(rs.getInt("jmlHrKj"));
                abs.setjKrHr(rs.getInt("jmlJpHr"));
                abs.setjHrHd(rs.getInt("hrHadirJm"));
                abs.setBln(rs.getString("bulan"));
                abs.setThn(rs.getInt("tahun"));
            }
            return abs;
        } catch (SQLException ex) {
            Logger.getLogger(SqlAbsensi.class.getName()).log(Level.SEVERE, null, ex);
            return abs;
        }
    }

    public List<Absensi> getAll() {
        String sql = "SELECT * FROM tbl_absensi AS a NATURAL JOIN tbl_pegawai AS p "
                + "NATURAL JOIN tbl_jabatan as j ORDER BY idAbsen DESC";
        List<Absensi> lst = new ArrayList<Absensi>();
        try {            
            Statement sm = conn.createStatement();
            ResultSet rs = sm.executeQuery(sql);
            while (rs.next()) {
                Absensi abs = new Absensi();
                abs.setIdAbs(rs.getInt("idAbsen"));
                abs.setIdPeg(rs.getInt("idPegawai"));
                abs.setNmPeg(rs.getString("nmPegawai"));
                abs.setJmHrKj(rs.getInt("jmlHrKrj"));
                abs.setjKrHr(rs.getInt("jmlJpHr"));
                abs.setjHrHd(rs.getInt("hrHadirJm"));
                abs.setBln(rs.getString("bulan"));
                abs.setThn(rs.getInt("tahun"));

                /******** Untuk input Jabtan di frmPenggajian*******/
                abs.setNmJab(rs.getString("nmJbtn"));
                abs.setGapok(rs.getDouble("gapok"));
                lst.add(abs);
            }            
        } catch (SQLException ex) {
            Logger.getLogger(SqlAbsensi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;
    }

    public List<Absensi> getAll(String kunci) {
        String sql = "SELECT * FROM tbl_absensi AS a NATURAL JOIN tbl_pegawai AS p "
                + "WHERE nmPegawai LIKE ? ORDER BY idAbsen ASC";
        List<Absensi> lst = new ArrayList<Absensi>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + kunci + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Absensi abs = new Absensi();
                abs.setIdAbs(rs.getInt("idAbsen"));
                abs.setIdPeg(rs.getInt("idPegawai"));
                abs.setNmPeg(rs.getString("nmPegawai"));
                abs.setJmHrKj(rs.getInt("jmlHrKj"));
                abs.setjKrHr(rs.getInt("jmlJpHr"));
                abs.setjHrHd(rs.getInt("hrHadirJm"));
                abs.setBln(rs.getString("bulan"));
                abs.setThn(rs.getInt("tahun"));
                lst.add(abs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlAbsensi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;
    }
}
