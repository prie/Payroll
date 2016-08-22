/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql.methodes;

import entity.Penggajian;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.interfaces.SqlInPenggajian;

/**
 *
 * @author Prie
 */
public class SqlPenggajian implements SqlInPenggajian {
    private Connection conn = null;

    public SqlPenggajian(Connection conn){
        this.conn = conn;
    }

    public void insert(Penggajian gaji) {
        String sql = "INSERT INTO tbl_penggajian VALUES(?,?,?,?,?,?,?,?,?,DATE(NOW()),?)";
        try {            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, gaji.getIdGji());
            ps.setString(2, gaji.getSlip());
            ps.setInt(3, gaji.getIdAbs());
            ps.setDouble(4, gaji.getAwGji());
            ps.setDouble(5, gaji.getInStf());
            ps.setDouble(6, gaji.getBns());
            ps.setDouble(7, gaji.getKtGji());
            ps.setDouble(8, gaji.getTtPot());
            ps.setDouble(9, gaji.getBsGji());
           // ps.setDate(10, gaji.getTgl());
            ps.setInt(10, gaji.getIdUsr());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlPenggajian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Penggajian gaji, int idLama) {
        String sql = "UPDATE tbl_penggajian SET noSlip=?,idAbsen=?,awlGaji=?,insentif=?,"
                + "bonus=?,ktrGaji=?,ttlPotong=?,brshGaji=?,idUser=? WHERE idGaji=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, gaji.getSlip());
            ps.setInt(2, gaji.getIdAbs());
            ps.setDouble(3, gaji.getAwGji());
            ps.setDouble(4, gaji.getInStf());
            ps.setDouble(5, gaji.getBns());
            ps.setDouble(6, gaji.getKtGji());
            ps.setDouble(7, gaji.getTtPot());
            ps.setDouble(8, gaji.getBsGji());
           // ps.setDate(9, gaji.getTgl());
            ps.setInt(9, gaji.getIdUsr());
            ps.setInt(10, idLama);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlPenggajian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM tbl_penggajian WHERE idGaji=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlPenggajian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Penggajian getBy(int id) {
        String sql = "SELECT * FROM tbl_penggajian WHERE idGaji=?";
        Penggajian pgj = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            Statement sm = conn.createStatement();
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                pgj = new Penggajian();
                pgj.setSlip(rs.getString("noSlip"));
                pgj.setIdAbs(rs.getInt("idAbsen"));
                pgj.setAwGji(rs.getDouble("awlGaji"));
                pgj.setInStf(rs.getDouble("insentif"));
                pgj.setBns(rs.getDouble("bonus"));
                pgj.setKtGji(rs.getDouble("ktrGaji"));
                pgj.setTtPot(rs.getDouble("ttlPotong"));
                pgj.setBsGji(rs.getDouble("brshGaji"));
                pgj.setTgl(rs.getDate("tglRekap"));
                pgj.setIdUsr(rs.getInt("idUser"));
            }
            return pgj;
        } catch (SQLException ex) {
            Logger.getLogger(SqlPenggajian.class.getName()).log(Level.SEVERE, null, ex);
            return pgj;
        }
    }

    public List<Penggajian> getAll() {
        String sql = "SELECT * FROM gaji_rekap ORDER BY idGaji DESC";
        List<Penggajian> lst = new ArrayList<Penggajian>();
        try {
            Statement sm = conn.createStatement();
            ResultSet rs = sm.executeQuery(sql);
            while(rs.next()){
                Penggajian pgj = new Penggajian();
                pgj.setIdGji(rs.getInt("idGaji"));
                pgj.setSlip(rs.getString("noSlip"));
                pgj.setIdAbs(rs.getInt("idAbsen"));
                pgj.setNmPeg(rs.getString("nmPegawai"));
                pgj.setNmJab(rs.getString("nmJbtn"));
                pgj.setGaPok(rs.getDouble("gapok"));
                pgj.setBln(rs.getString("bulan"));
                pgj.setThn(rs.getInt("tahun"));
                pgj.setHrKrj(rs.getInt("jmlHrKrj"));
                pgj.setHrHdr(rs.getInt("hrHadirJm"));
                pgj.setAwGji(rs.getDouble("awlGaji"));
                pgj.setInStf(rs.getDouble("insentif"));
                pgj.setBns(rs.getDouble("bonus"));
                pgj.setKtGji(rs.getDouble("ktrGaji"));
                pgj.setTtPot(rs.getDouble("ttlPotong"));
                pgj.setBsGji(rs.getDouble("brshGaji"));
                pgj.setTgl(rs.getDate("tglRekap"));
                pgj.setIdUsr(rs.getInt("idUser"));
                pgj.setNmUsr(rs.getString("admin"));
                lst.add(pgj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlPenggajian.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;
    }

    public List<Penggajian> getAll(String kunci) {
        String sql = "SELECT * FROM gaji_rekap WHERE noSlip LIKE ? ORDER BY idGaji DESC";
        List<Penggajian> lst = new ArrayList<Penggajian>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + kunci + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Penggajian pgj = new Penggajian();
                pgj.setIdGji(rs.getInt("idGaji"));
                pgj.setSlip(rs.getString("noSlip"));
                pgj.setIdAbs(rs.getInt("idAbsen"));
                pgj.setNmPeg(rs.getString("nmPegawai"));
                pgj.setNmJab(rs.getString("nmJbtn"));
                pgj.setGaPok(rs.getDouble("gapok"));
                pgj.setBln(rs.getString("bulan"));
                pgj.setThn(rs.getInt("tahun"));
                pgj.setHrKrj(rs.getInt("jmlHrKrj"));
                pgj.setHrHdr(rs.getInt("hrHadirJm"));
                pgj.setAwGji(rs.getDouble("awlGaji"));
                pgj.setInStf(rs.getDouble("insentif"));
                pgj.setBns(rs.getDouble("bonus"));
                pgj.setKtGji(rs.getDouble("ktrGaji"));
                pgj.setTtPot(rs.getDouble("ttlPotong"));
                pgj.setBsGji(rs.getDouble("brshGaji"));
                pgj.setTgl(rs.getDate("tglRekap"));
                pgj.setIdUsr(rs.getInt("idUser"));
                pgj.setNmUsr(rs.getString("admin"));
                lst.add(pgj);
            }
            return lst;
        } catch (SQLException ex) {
            Logger.getLogger(SqlPenggajian.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
