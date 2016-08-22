/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql.interfaces;

import entity.Pegawai;
import java.util.List;

/**
 *
 * @author Prie
 */
public interface SqlInPegawai {
    public void insert(Pegawai pegawai);
    public void update(Pegawai pegawai, int idLama);
    public void delete(int id);
    public Pegawai getBy(int id);
    public List<Pegawai> getAll();
    public List<Pegawai> getAll(String kunci);
}
