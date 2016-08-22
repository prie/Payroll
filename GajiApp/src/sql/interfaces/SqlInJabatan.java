/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql.interfaces;

import entity.Jabatan;
import java.util.List;

/**
 *
 * @author Prie
 */
public interface SqlInJabatan {
    public void insert(Jabatan jabatan);
    public void update(Jabatan jabatan, int idLama);
    public void delete(int id);
    public Jabatan getBy(String id);
    public List<Jabatan> getAll();
    public List<Jabatan> getAll(String kunci);
}
