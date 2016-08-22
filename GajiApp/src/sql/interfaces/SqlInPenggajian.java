/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql.interfaces;

import entity.Penggajian;
import java.util.List;

/**
 *
 * @author Prie
 */
public interface SqlInPenggajian {
    public void insert(Penggajian gaji);
    public void update(Penggajian gaji, int idLama);
    public void delete(int id);
    public Penggajian getBy(int id);
    public List<Penggajian> getAll();
    public List<Penggajian> getAll(String kunci);
}
