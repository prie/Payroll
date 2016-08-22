/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql.interfaces;

import entity.Potongan;
import java.util.List;

/**
 *
 * @author Prie
 */
public interface SqlInPotongan {
    public void insert(Potongan potongan);
    public void update(Potongan potongan, int oldId);
    public void delete(int id);
    public Potongan getBy(int id);
    public List<Potongan> getAll();
    public List<Potongan> getAll(String kunci);
}
