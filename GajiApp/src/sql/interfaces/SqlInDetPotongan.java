/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql.interfaces;

import entity.DetPotongan;
import java.util.List;

/**
 *
 * @author Prie
 */
public interface SqlInDetPotongan {
    public void insert(DetPotongan detpotong);
    public void update(DetPotongan detpotong, int oldId);
    public void delete(int id);
    public DetPotongan getBy(int id);
    public List<DetPotongan> getAll();
    public List<DetPotongan> getAll(int kunci);
}
