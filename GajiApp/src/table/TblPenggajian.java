/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package table;

import entity.Penggajian;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Prie
 */
public class TblPenggajian extends AbstractTableModel {
    private List<Penggajian> lst;
    private String[] columnName = {"ID","No. Slip","Nama Pegawai","Jabatan","Gaji Pokok",
                                "Bulan","Tahun","Hari Kerja","Hari Hadir","Gaji Awal",
                                "Insentif","Bonus","Gaji Kotor","Jml Potongan","Gaji Bersih",
                                "Tanggal","Nama Admin"};

    public TblPenggajian(List<Penggajian> lst){
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
            case 0: return lst.get(iBrs).getIdGji();
            case 1: return lst.get(iBrs).getSlip();
            case 2: return lst.get(iBrs).getNmPeg();
            case 3: return lst.get(iBrs).getNmJab();
            case 4: return df.format(lst.get(iBrs).getGaPok());
            case 5: return lst.get(iBrs).getBln();
            case 6: return lst.get(iBrs).getThn();
            case 7: return lst.get(iBrs).getHrKrj();
            case 8: return lst.get(iBrs).getHrHdr();
            case 9: return df.format(lst.get(iBrs).getAwGji());
            case 10: return df.format(lst.get(iBrs).getInStf());
            case 11: return df.format(lst.get(iBrs).getBns());
            case 12: return df.format(lst.get(iBrs).getKtGji());
            case 13: return df.format(lst.get(iBrs).getTtPot());
            case 14: return df.format(lst.get(iBrs).getBsGji());
            case 15: return lst.get(iBrs).getTgl();
            case 16: return lst.get(iBrs).getNmUsr();
            default: return null;
        }
    }
    @Override
    public String getColumnName(int column) {
       if(column > columnName.length) return null;
       return columnName[column];
    }
}
