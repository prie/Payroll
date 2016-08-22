/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package table;

import entity.DetPotongan;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Prie
 */
public class TblDetPotongan extends AbstractTableModel {
    private List<DetPotongan> lst;
    private String[] columnName = {"ID", "Nama Potongan","Jumlah"};

    public TblDetPotongan(List<DetPotongan> lst){
        this.lst = lst;
    }

    public int getRowCount() {
        return lst.size();
    }

    public int getColumnCount() {
        return columnName.length;
    }

    public Object getValueAt(int iBrs, int iKlm) {
        DecimalFormat df = new DecimalFormat("#");
        switch(iKlm){
            case 0: return lst.get(iBrs).getIdDet();
            case 1: return lst.get(iBrs).getNmPot();
            case 2: return df.format(lst.get(iBrs).getJmlPot());
            default: return null;
        }
    }
    @Override
    public String getColumnName(int column) {
       if(column > columnName.length) return null;
       return columnName[column];
    }
}
