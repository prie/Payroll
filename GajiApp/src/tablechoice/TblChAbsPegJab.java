/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tablechoice;

import entity.Absensi;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Prie
 */
public class TblChAbsPegJab extends AbstractTableModel {
    private List<Absensi> lst;
    private String[] columnName = {"ID","Pegawai","Jabatan","Gaji Pokok","Bulan","Tahun",
                                "Hari Kerja","Hari Hadir"};

    public TblChAbsPegJab(List<Absensi> lst){
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
            case 0: return lst.get(iBrs).getIdAbs();
            case 1: return lst.get(iBrs).getNmPeg();
            case 2: return lst.get(iBrs).getNmJab();
            case 3: return df.format(lst.get(iBrs).getGapok());
            case 4: return lst.get(iBrs).getBln();
            case 5: return lst.get(iBrs).getThn();
            case 6: return lst.get(iBrs).getJmHrKj();
            case 7: return lst.get(iBrs).getjHrHd();
            default: return null;
        }
    }
    @Override
    public String getColumnName(int column) {
       if(column > columnName.length) return null;
       return columnName[column];
    }
}
