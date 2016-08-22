/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package table;

import entity.Potongan;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Prie
 */
public class TblPotongan extends AbstractTableModel {
    private List<Potongan> lst;
    private String[] columnName = {"ID", "Nama Potongan"};

    public TblPotongan(List<Potongan> lst){
        this.lst = lst;
    }

    public int getRowCount() {
        return lst.size();
    }

    public int getColumnCount() {
        return columnName.length;
    }

    public Object getValueAt(int idxBaris, int idxKolom) {
        switch(idxKolom){
            case 0: return lst.get(idxBaris).getIdPot();
            case 1: return lst.get(idxBaris).getNmPot();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
       if(column > columnName.length) return null;
       return columnName[column];
    }

}
