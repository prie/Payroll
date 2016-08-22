/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package table;

import entity.Pegawai;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Prie
 */
public class TblPegawai extends AbstractTableModel {
    private List<Pegawai> lstP;
    private String[] columnName = {"ID","NIK","Nama Pegawai","Jabatan","Alamat",
                           "Kota","Telepon","Tgl Masuk","Pendidikan","Jurusan"};

    public TblPegawai(List<Pegawai> lstp){
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
            case 3: return lstP.get(iBrs).getNmJab();
            case 4: return lstP.get(iBrs).getAlmt();
            case 5: return lstP.get(iBrs).getKota();
            case 6: return lstP.get(iBrs).getTlp();
            case 7: return lstP.get(iBrs).getTglMsk();
            case 8: return lstP.get(iBrs).getLvl();
            case 9: return lstP.get(iBrs).getJrsn();
            default: return null;
        }
    }
    @Override
    public String getColumnName(int column) {
       if(column > columnName.length) return null;
       return columnName[column];
    }

}
