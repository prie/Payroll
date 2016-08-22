/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql.methodes;

import entity.DetPotongan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.interfaces.SqlInDetPotongan;

/**
 *
 * @author Prie
 */
public class SqlDetPotongan implements SqlInDetPotongan {
    private Connection conn = null;

    public SqlDetPotongan(Connection conn){
        this.conn = conn;
    }

    public void insert(DetPotongan detpotong) {
        String sql = "INSERT INTO tbl_detpotgaj VALUES(null,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, detpotong.getIdGji());
            ps.setInt(2, detpotong.getIdPot());
            ps.setDouble(3, detpotong.getJmlPot());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlDetPotongan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(DetPotongan detpotong, int oldId) {
        String sql = "UPDATE tbl_detpotgaj SET idGaji=?,idPotong=?,jmlPotong=? WHERE idDpj=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, detpotong.getIdGji());
            ps.setInt(2, detpotong.getIdPot());
            ps.setDouble(3, detpotong.getJmlPot());
            ps.setInt(4, oldId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlDetPotongan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM tbl_detpotgaj WHERE idDpj=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlDetPotongan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DetPotongan getBy(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<DetPotongan> getAll() {
        String sql = "SELECT * FROM tbl_detpotgaj AS dp NATURAL JOIN tbl_potongan AS p ORDER BY idDpj DESC";
        List<DetPotongan> lst = new ArrayList<DetPotongan>();
        try {
            Statement sm = conn.createStatement();
            ResultSet rs = sm.executeQuery(sql);
            while (rs.next()) {
                DetPotongan dpt = new DetPotongan();
                dpt.setIdDet(rs.getInt("idDpj"));
                dpt.setIdGji(rs.getInt("idGaji"));
                dpt.setIdPot(rs.getInt("idPotong"));
                dpt.setNmPot(rs.getString("nmPotong"));
                dpt.setJmlPot(rs.getDouble("jmlPotong"));
                lst.add(dpt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlPotongan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;
    }

    public List<DetPotongan> getAll(int kunci) {
        String sql = "SELECT * FROM tbl_detpotgaj AS dp NATURAL JOIN tbl_potongan AS p WHERE idGaji=? ORDER BY idDpj ASC";
        List<DetPotongan> lst = new ArrayList<DetPotongan>();
        try {            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, kunci);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DetPotongan dpt = new DetPotongan();
                dpt.setIdDet(rs.getInt("idDpj"));
                dpt.setIdGji(rs.getInt("idGaji"));
                dpt.setIdPot(rs.getInt("idPotong"));
                dpt.setNmPot(rs.getString("nmPotong"));
                dpt.setJmlPot(rs.getDouble("jmlPotong"));
                lst.add(dpt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlDetPotongan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;
    }
}
