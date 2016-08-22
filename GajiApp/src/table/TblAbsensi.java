/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package table;

import entity.Absensi;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Prie
 */
public class TblAbsensi extends AbstractTableModel {
    private List<Absensi> lst;
    private String[] columnName = {"ID","Nama Pegawai","Bulan","Tahun","Jml Hari Kerja",
                                "Jam Kerja perHari","Jml Hari Hadir"};

    public TblAbsensi(List<Absensi> lst){
        this.lst = lst;
    }

    public int getRowCount() {
        return lst.size();
    }

    public int getColumnCount() {
        return columnName.length;
    }

    public Object getValueAt(int iBrs, int iKlm) {
        switch(iKlm){
            case 0: return lst.get(iBrs).getIdAbs();
            case 1: return lst.get(iBrs).getNmPeg();
            case 2: return lst.get(iBrs).getBln();
            case 3: return lst.get(iBrs).getThn();
            case 4: return lst.get(iBrs).getJmHrKj();
            case 5: return lst.get(iBrs).getjKrHr();
            case 6: return lst.get(iBrs).getjHrHd();
            default: return null;
        }
    }
    @Override
    public String getColumnName(int column) {
       if(column > columnName.length) return null;
       return columnName[column];
    }
}
