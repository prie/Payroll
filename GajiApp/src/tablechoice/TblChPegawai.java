/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tablechoice;

import entity.Pegawai;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Prie
 */
public class TblChPegawai extends AbstractTableModel {
    private List<Pegawai> lstP;
    private String[] columnName = {"ID","NIK","Nama Pegawai"};

    public TblChPegawai(List<Pegawai> lstp){
        this.lstP = lstp;
    }

    public int getRowCount() {
        return lstP.size();
    }

    public int getColumnCount() {
        return columnName.length;
    }

    public Object getValueAt(int iBrs, int iKlm) {
        switch(iKlm){
            case 0: return lstP.get(iBrs).getIdPeg();
            case 1: return lstP.get(iBrs).getNik();
            case 2: return lstP.get(iBrs).getNmPeg();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
       if(column > columnName.length) return null;
       return columnName[column];
    }
}
