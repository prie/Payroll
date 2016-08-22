/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql.methodes;

import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.interfaces.SqlInUser;

/**
 *
 * @author Prie
 */
public class SqlUser implements SqlInUser {
    private Connection conn = null;

    public SqlUser(Connection conn){
        this.conn = conn;
    }

    public void insert(User user) {
        String sql = "INSERT INTO tbl_user VALUES(null,?,?,MD5(?))";
        try {            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, user.getIdPeg());
            ps.setString(2, user.getUsrNme());
            ps.setString(3, user.getPssWrd());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(User user, int idLama) {
        String sql = "UPDATE tbl_user SET idPegawai=?,username=?,password=MD5(?) WHERE idPegawai=?";
        try {            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, user.getIdPeg());
            ps.setString(2, user.getUsrNme());
            ps.setString(3, user.getPssWrd());
            ps.setInt(4, idLama);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM tbl_user WHERE idUser=?";
        try {            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SqlUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User getBy(String un, String pw) {
        String sql = "SELECT * FROM tbl_user AS u NATURAL JOIN tbl_pegawai AS p "
                + "WHERE username=? AND password=MD5(?)";
        User usr = new User();
        try {            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, un);
            ps.setString(2, pw);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {               
                usr.setIdAdm(rs.getInt("idUser"));
                usr.setIdPeg(rs.getInt("idPegawai"));
                usr.setNmAdm(rs.getString("nmPegawai"));
                usr.setUsrNme(rs.getString("username"));
                usr.setPssWrd(rs.getString("password"));
            }
            return usr;
        } catch (SQLException ex) {
            Logger.getLogger(SqlUser.class.getName()).log(Level.SEVERE, null, ex);
            usr.setIdAdm(0);
            return usr;
        }
    }

    public List<User> getAll() {
        String sql = "SELECT * FROM tbl_user AS u NATURAL JOIN tbl_pegawai AS p "
                + "ORDER BY idUser ASC";
        List<User> lst = new ArrayList<User>();
        try {            
            Statement sm = conn.createStatement();
            ResultSet rs = sm.executeQuery(sql);
            while (rs.next()) {
                User usr = new User();
                usr.setIdAdm(rs.getInt("idUser"));
                usr.setIdPeg(rs.getInt("idPegawai"));
                usr.setNmAdm(rs.getString("nmPegawai"));
                usr.setUsrNme(rs.getString("username"));
                usr.setPssWrd(rs.getString("password"));
                lst.add(usr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;
    }

    public List<User> getAll(String kunci) {
        String sql = "SELECT * FROM tbl_user AS u NATURAL JOIN tbl_pegawai AS p "
                    + "WHERE nmPegawai LIKE ? ORDER BY idUser ASC";
        List<User> lst = new ArrayList<User>();
        try {            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + kunci + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User usr = new User();
                usr.setIdAdm(rs.getInt("idUser"));
                usr.setIdPeg(rs.getInt("idPegawai"));
                usr.setNmAdm(rs.getString("nmPegawai"));
                usr.setUsrNme(rs.getString("username"));
                usr.setPssWrd(rs.getString("password"));
                lst.add(usr);
            }
            return lst;
        } catch (SQLException ex) {
            Logger.getLogger(SqlUser.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
