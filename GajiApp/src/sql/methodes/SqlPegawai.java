/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql.methodes;

import java.sql.Date;
import java.sql.Statement;
import entity.Pegawai;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.interfaces.SqlInPegawai;

/**
 *
 * @author Prie
 */
public class SqlPegawai implements SqlInPegawai {
    private Connection conn = null;

    public SqlPegawai(Connection conn){
        this.conn = conn;
    }

    public void insert(Pegawai pegawai) {
        String sql = "INSERT INTO tbl_pegawai VALUES(null,?,?,?,?,?,?,?,?,?)";
        try {            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pegawai.getNik());
            ps.setInt(2, pegawai.getIdJab());
            ps.setString(3, pegawai.getNmPeg());
            ps.setString(4, pegawai.getAlmt());
            ps.setString(5, pegawai.getKota());
            ps.setString(6, pegawai.getTlp());
            ps.setDate(7, (Date) pegawai.getTglMsk());
            ps.setString(8, pegawai.getLvl());
            ps.setString(9, pegawai.getJrsn());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Pegawai pegawai, int idLama) {
        String sql = "UPDATE tbl_pegawai SET NIK=?,idJbtn=?,nmPegawai=?,alamat=?,"
                + "kota=?,telp=?,tglMasuk=?,lvlPendidikan=?,jrsPendidikan=? WHERE idPegawai=?";
        try {           
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pegawai.getNik());
            ps.setInt(2, pegawai.getIdJab());
            ps.setString(3, pegawai.getNmPeg());
            ps.setString(4, pegawai.getAlmt());
            ps.setString(5, pegawai.getKota());
            ps.setString(6, pegawai.getTlp());
            ps.setDate(7, (Date) pegawai.getTglMsk());
            ps.setString(8, pegawai.getLvl());
            ps.setString(9, pegawai.getJrsn());
            ps.setInt(10, idLama);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM tbl_pegawai WHERE idPegawai=?";
        try {            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Pegawai getBy(int id) {
        String sql = "SELECT * FROM tbl_pegawai WHERE idPegawai=?";
        Pegawai pgw = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            Statement sm = conn.createStatement();
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                pgw = new Pegawai();
                pgw.setIdPeg(rs.getInt("idPegawai"));
                pgw.setNik(rs.getString("NIK"));
                pgw.setIdJab(rs.getInt("idJbtn"));
                pgw.setNmPeg(rs.getString("nmPegawai"));
                pgw.setAlmt(rs.getString("alamat"));
                pgw.setKota(rs.getString("kota"));
                pgw.setTlp(rs.getString("telp"));
                pgw.setTglMsk(rs.getDate("tglMasuk"));
                pgw.setLvl(rs.getString("lvlPendidikan"));
                pgw.setJrsn(rs.getString("jrsPendidikan"));
            }
            return pgw;
        } catch (SQLException ex) {
            Logger.getLogger(SqlPegawai.class.getName()).log(Level.SEVERE, null, ex);
            return pgw;
        }
    }

    public List<Pegawai> getAll() {
        String sql = "SELECT * FROM tbl_pegawai AS p NATURAL JOIN tbl_jabatan AS j "
                + "ORDER BY idPegawai ASC";
        List<Pegawai> lst = new ArrayList<Pegawai>();
        try {            
            Statement sm = conn.createStatement();
            ResultSet rs = sm.executeQuery(sql);
            while (rs.next()) {
                Pegawai pgw = new Pegawai();
                pgw.setIdPeg(rs.getInt("idPegawai"));
                pgw.setNik(rs.getString("NIK"));
                pgw.setIdJab(rs.getInt("idJbtn"));
                pgw.setNmPeg(rs.getString("nmPegawai"));
                pgw.setAlmt(rs.getString("alamat"));
                pgw.setKota(rs.getString("kota"));
                pgw.setTlp(rs.getString("telp"));
                pgw.setTglMsk(rs.getDate("tglMasuk"));
                pgw.setLvl(rs.getString("lvlPendidikan"));
                pgw.setJrsn(rs.getString("jrsPendidikan"));
                pgw.setNmJab(rs.getString("nmJbtn"));
                lst.add(pgw);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;
    }

    public List<Pegawai> getAll(String kunci) {
        String sql = "SELECT * FROM tbl_pegawai AS p NATURAL JOIN tbl_jabatan AS j "
                + "WHERE nmPegawai LIKE ? ORDER BY idPegawai ASC";
        List<Pegawai> lst = new ArrayList<Pegawai>();
        try {            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + kunci + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pegawai pgw = new Pegawai();
                pgw.setIdPeg(rs.getInt("idPegawai"));
                pgw.setNik(rs.getString("NIK"));
                pgw.setIdJab(rs.getInt("idJbtn"));
                pgw.setNmPeg(rs.getString("nmPegawai"));
                pgw.setAlmt(rs.getString("alamat"));
                pgw.setKota(rs.getString("kota"));
                pgw.setTlp(rs.getString("telp"));
                pgw.setTglMsk(rs.getDate("tglMasuk"));
                pgw.setLvl(rs.getString("lvlPendidikan"));
                pgw.setJrsn(rs.getString("jrsPendidikan"));
                pgw.setNmJab(rs.getString("nmJbtn"));
                lst.add(pgw);
            }
            return lst;
        } catch (SQLException ex) {
            Logger.getLogger(SqlPegawai.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
