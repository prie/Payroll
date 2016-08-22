/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package table;

import entity.Jabatan;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Prie
 */
public class TblJabatan extends AbstractTableModel {
    private List<Jabatan> lst;
    private String[] columnName = {"ID", "Nama Jabatan","Gaji Pokok"};

    public TblJabatan(List<Jabatan> lst){
        this.lst = lst;
    }

    public int getRowCount() {
        return lst.size();
    }

    public int getColumnCount() {
        return columnName.length;
    }

    public Object getValueAt(int idxBrs, int idxKlm) {
        DecimalFormat df = new DecimalFormat("#");
        switch(idxKlm){
            case 0: return lst.get(idxBrs).getIdJab();
            case 1: return lst.get(idxBrs).getNmJab();
            case 2: return df.format(lst.get(idxBrs).getGaPok());
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
       if(column > columnName.length) return null;
       return columnName[column];
    }

}
