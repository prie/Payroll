/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql.interfaces;

import entity.Absensi;
import java.util.List;

/**
 *
 * @author Prie
 */
public interface SqlInAbsensi {
    public void insert(Absensi absensi);
    public void update(Absensi absensi, int idLama);
    public void delete(int id);
    public Absensi getBy(int id);
    public List<Absensi> getAll();
    public List<Absensi> getAll(String kunci);
}
