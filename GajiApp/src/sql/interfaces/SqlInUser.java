/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql.interfaces;

import entity.User;
import java.util.List;

/**
 *
 * @author Prie
 */
public interface SqlInUser {
    public void insert(User user);
    public void update(User user, int idLama);
    public void delete(int id);
    public User getBy(String un, String pw);
    public List<User> getAll();
    public List<User> getAll(String kunci);
}
