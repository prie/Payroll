/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package table;

import entity.User;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Prie
 */
public class TblUser extends AbstractTableModel {

    private List<User> lst;
    private String[] columnName = {"ID","Nama Pegawai","Username","Password"};

    public TblUser(List<User> lst){
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
            case 0: return lst.get(iBrs).getIdAdm();
            case 1: return lst.get(iBrs).getNmAdm();
            case 2: return lst.get(iBrs).getUsrNme();
            case 3: return "DiSembunyikan";
            default: return null;
        }
    }
    @Override
    public String getColumnName(int column) {
       if(column > columnName.length) return null;
       return columnName[column];
    }

}
