/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tablechoice;

import entity.Jabatan;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Prie
 */
public class TblChJabatan extends AbstractTableModel {
    private List<Jabatan> lst;
    private String[] nmKolom = {"ID", "Nama Jabatan"};

    public TblChJabatan(List<Jabatan> lst){
        this.lst = lst;
    }

    public int getRowCount() {
        return lst.size();
    }

    public int getColumnCount() {
        return nmKolom.length;
    }

    public Object getValueAt(int iBrs, int iKlm) {
        switch(iKlm){
            case 0: return lst.get(iBrs).getIdJab();
            case 1: return lst.get(iBrs).getNmJab();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
       if(column > nmKolom.length) return null;
       return nmKolom[column];
    }
}
