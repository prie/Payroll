/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmPegawai.java
 *
 * Created on 09 Des 12, 10:53:43
 */

package form.gaji;

import entity.Pegawai;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sql.methodes.SqlJabatan;
import sql.methodes.SqlPegawai;
import table.TblPegawai;
import tablechoice.TblChJabatan;
import tools.AutoFitTableColumns;
import tools.KonekDB;
import usu.widget.Form;

/**
 *
 * @author Prie
 */
public class frmPegawai extends Form {

    private boolean isEdit = false;
    /** Creates new form frmPegawai */
    public frmPegawai() {
        initComponents();
        statusAwal();
        tampilData();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gRdJKlm = new javax.swing.ButtonGroup();
        myPaanelInt1 = new tools.MyPaanelInt();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txNik = new javax.swing.JTextField();
        txNmPeg = new javax.swing.JTextField();
        txAlmt = new javax.swing.JTextField();
        txKota = new javax.swing.JTextField();
        txTlp = new javax.swing.JTextField();
        pnlId = new javax.swing.JPanel();
        lbIdPeg = new javax.swing.JLabel();
        txIdPeg = new javax.swing.JTextField();
        txIdJab = new javax.swing.JTextField();
        lbIdJab = new javax.swing.JLabel();
        tglMasuk = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbSeklh = new javax.swing.JComboBox();
        txJrsn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btCariJab = new javax.swing.JButton();
        txJabtn = new javax.swing.JTextField();
        pnlJab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJab = new javax.swing.JTable();
        btSimpan = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btTutup = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPeg = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setAnimationHide(usu.widget.constan.Animation.HIDE_TO_RIGHT);
        setAnimationShow(usu.widget.constan.Animation.SHOW_FROM_LEFT);
        setResizable(false);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Data Karyawan ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel2.setText("NIK");

        jLabel3.setText("Nama Pegawai");

        jLabel9.setText("Alamat");

        jLabel10.setText("Kota");

        jLabel11.setText("Telepon");

        pnlId.setOpaque(false);

        lbIdPeg.setText("ID Pegawai");

        txIdPeg.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txIdPegPropertyChange(evt);
            }
        });

        lbIdJab.setText("ID Jabatan");

        javax.swing.GroupLayout pnlIdLayout = new javax.swing.GroupLayout(pnlId);
        pnlId.setLayout(pnlIdLayout);
        pnlIdLayout.setHorizontalGroup(
            pnlIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIdPeg)
                .addGap(26, 26, 26)
                .addComponent(txIdPeg, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 392, Short.MAX_VALUE)
                .addComponent(lbIdJab)
                .addGap(18, 18, 18)
                .addComponent(txIdJab, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlIdLayout.setVerticalGroup(
            pnlIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdPeg)
                    .addComponent(txIdJab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIdJab)
                    .addComponent(txIdPeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tglMasuk.setDateFormatString("dd/MM/yyyy");

        jLabel12.setText("Tgl Masuk");

        jLabel1.setText("Pendidikan");

        cbSeklh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "S3", "S2", "S1", "D4", "D3", "D1", "SMA", "SMP", "SD" }));
        cbSeklh.setSelectedIndex(2);

        txJrsn.setText("-");

        jLabel7.setText("Jurusan");

        jLabel13.setText("Jabatan");

        btCariJab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cari.png"))); // NOI18N
        btCariJab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCariJabActionPerformed(evt);
            }
        });

        pnlJab.setOpaque(false);

        tblJab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tblJab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblJabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblJab);

        javax.swing.GroupLayout pnlJabLayout = new javax.swing.GroupLayout(pnlJab);
        pnlJab.setLayout(pnlJabLayout);
        pnlJabLayout.setHorizontalGroup(
            pnlJabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );
        pnlJabLayout.setVerticalGroup(
            pnlJabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txTlp)
                            .addComponent(txKota)
                            .addComponent(txAlmt)
                            .addComponent(txNmPeg)
                            .addComponent(txNik, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlJab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tglMasuk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txJabtn, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCariJab))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cbSeklh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txJrsn, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txNmPeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txAlmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txTlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(tglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbSeklh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txJrsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(txJabtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btCariJab))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlJab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        btSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/okeLgn.png"))); // NOI18N
        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/op_edit.png"))); // NOI18N
        btEdit.setText("Edit");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelLgn.png"))); // NOI18N
        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btTutup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit.png"))); // NOI18N
        btTutup.setText("Tutup");
        btTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTutupActionPerformed(evt);
            }
        });

        tblPeg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        tblPeg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPegMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPeg);

        javax.swing.GroupLayout myPaanelInt1Layout = new javax.swing.GroupLayout(myPaanelInt1);
        myPaanelInt1.setLayout(myPaanelInt1Layout);
        myPaanelInt1Layout.setHorizontalGroup(
            myPaanelInt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPaanelInt1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myPaanelInt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, myPaanelInt1Layout.createSequentialGroup()
                        .addComponent(btSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 516, Short.MAX_VALUE)
                        .addComponent(btTutup)))
                .addContainerGap())
        );
        myPaanelInt1Layout.setVerticalGroup(
            myPaanelInt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPaanelInt1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(myPaanelInt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSimpan)
                    .addComponent(btEdit)
                    .addComponent(btHapus)
                    .addComponent(btTutup))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(myPaanelInt1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-870)/2, (screenSize.height-459)/2, 870, 459);
    }// </editor-fold>//GEN-END:initComponents

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
        if(evt.getActionCommand().equalsIgnoreCase("Tambah")){
            siapSimpan();
            kosongJText();
            txNik.requestFocus();
            isEdit = false;
        }else{
            if(txNik.getText().equals("")){
                JOptionPane.showMessageDialog(this, "NIK harus diisi.!", "Peringatan", JOptionPane.OK_OPTION);
                txNik.requestFocus();
                return;
            }
            if(txNmPeg.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Nama Pegawai harus diisi.!", "Peringatan", JOptionPane.OK_OPTION);
                txNmPeg.requestFocus();
                return;
            }
            if(txAlmt.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Alamat harus diisi.!", "Peringatan", JOptionPane.OK_OPTION);
                txAlmt.requestFocus();
                return;
            }
            if(txKota.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Kota harus diisi.!", "Peringatan", JOptionPane.OK_OPTION);
                txKota.requestFocus();
                return;
            }
            if(txTlp.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Telepon harus diisi.!", "Peringatan", JOptionPane.OK_OPTION);
                txTlp.requestFocus();
                return;
            } else {                
                try {
                    int tlp = Integer.parseInt(txTlp.getText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this,"Anda memasukkan Huruf dalam No. Telepon!","Peringatan",JOptionPane.OK_OPTION);
                    txTlp.requestFocus();
                    return;
                }
            }
            try {
                String tgl = tglMasuk.getDate().toString();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Tanggal harus dipilih!","Peringatan",JOptionPane.OK_OPTION);
                tglMasuk.requestFocus();
                return;
            }
            
            if (txJrsn.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Jurusan harus diisi.!", "Peringatan", JOptionPane.OK_OPTION);
                txJrsn.requestFocus();
                return;
            }
            if(txIdJab.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Jabatan harus dipilih.!", "Peringatan", JOptionPane.OK_OPTION);
                btCariJab.requestFocus();
                return;
            }

            Pegawai pgw = new Pegawai();
            pgw.setNik(txNik.getText());
            pgw.setIdJab(Integer.parseInt(txIdJab.getText()));
            pgw.setNmPeg(txNmPeg.getText());
            pgw.setAlmt(txAlmt.getText());
            pgw.setKota(txKota.getText());
            pgw.setTlp(txTlp.getText());
            pgw.setTglMsk(new Date (tglMasuk.getDate().getTime()));
            pgw.setLvl((String) cbSeklh.getSelectedItem());
            pgw.setJrsn(txJrsn.getText());

            SqlPegawai qpg = new SqlPegawai(KonekDB.getKonek());
            if(isEdit){
                pgw.setIdPeg(Integer.parseInt(txIdPeg.getText()));
                qpg.update(pgw, Integer.parseInt(txIdPeg.getText()));
            }else{
                qpg.insert(pgw);
            }

            JOptionPane.showMessageDialog(this, "Data berhasil disimpan.");
            tampilData();
            statusAwal();
        }
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // TODO add your handling code here:
        isEdit = true;
        siapSimpan();
    }//GEN-LAST:event_btEditActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        if (tblPeg.getSelectedRow() >= 0 && JOptionPane.showConfirmDialog(this, "Data akan dihapus?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION) == 0){
            SqlPegawai qpg = new SqlPegawai(KonekDB.getKonek());
            qpg.delete(Integer.parseInt(txIdPeg.getText()));

            tampilData();
            JOptionPane.showMessageDialog(this, "Data telah dihapus.");
            statusAwal();
        }
    }//GEN-LAST:event_btHapusActionPerformed

    private void btTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTutupActionPerformed
        // TODO add your handling code here:
        if(evt.getActionCommand().equalsIgnoreCase("Tutup")){
            this.setVisible(false);
        }else{
            statusAwal();
        }
    }//GEN-LAST:event_btTutupActionPerformed

    private void tblPegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPegMouseClicked
        // TODO add your handling code here:
        tabelKlik();
        int idPeg =Integer.parseInt(tblPeg.getValueAt(tblPeg.getSelectedRow(),0).toString()) ;
        txIdPeg.setText(tblPeg.getValueAt(tblPeg.getSelectedRow(),0).toString());
        txNik.setText(tblPeg.getValueAt(tblPeg.getSelectedRow(),1).toString());
        txNmPeg.setText(tblPeg.getValueAt(tblPeg.getSelectedRow(),2).toString());
        txAlmt.setText(tblPeg.getValueAt(tblPeg.getSelectedRow(),4).toString());
        txKota.setText(tblPeg.getValueAt(tblPeg.getSelectedRow(),5).toString());
        txTlp.setText(tblPeg.getValueAt(tblPeg.getSelectedRow(),6).toString());
        tglMasuk.setDate((Date) tblPeg.getValueAt(tblPeg.getSelectedRow(),7));
        cbSeklh.setSelectedItem(tblPeg.getValueAt(tblPeg.getSelectedRow(),8));
        txJrsn.setText(tblPeg.getValueAt(tblPeg.getSelectedRow(),9).toString());
        txJabtn.setText(tblPeg.getValueAt(tblPeg.getSelectedRow(),3).toString());
        
        /*-------------------------------------------------------------------*/
        String sql = "SELECT * FROM tbl_pegawai WHERE idPegawai='"+idPeg+"'";
        try {
            Connection conn = KonekDB.getKonek();
            Statement sm = conn.createStatement();
            ResultSet rs = sm.executeQuery(sql);
            if(rs.next()){
                txIdJab.setText(Integer.toString(rs.getInt("idJbtn")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*-------------------------------------------------------------------*/
        
        /*
        SqlPegawai qpg = new SqlPegawai(KonekDB.getKonek());
        qpg.getBy(idPeg);        
        txIdJab.setText(Integer.toString(new Pegawai().getIdJab()));        
        */
    }//GEN-LAST:event_tblPegMouseClicked

    private void txIdPegPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txIdPegPropertyChange
        // TODO add your handling code here:        
    }//GEN-LAST:event_txIdPegPropertyChange

    private void btCariJabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCariJabActionPerformed
        // TODO add your handling code here:
        pnlJab.setVisible(true);
        SqlJabatan qjb = new SqlJabatan(KonekDB.getKonek());
        tblJab.setModel(new TblChJabatan(qjb.getAll()));
        AutoFitTableColumns.autoResizeTable(tblJab, true);
    }//GEN-LAST:event_btCariJabActionPerformed

    private void tblJabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJabMouseClicked
        // TODO add your handling code here:
        txIdJab.setText(tblJab.getValueAt(tblJab.getSelectedRow(),0).toString());
        txJabtn.setText(tblJab.getValueAt(tblJab.getSelectedRow(),1).toString());
    }//GEN-LAST:event_tblJabMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCariJab;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btSimpan;
    private javax.swing.JButton btTutup;
    private javax.swing.JComboBox cbSeklh;
    private javax.swing.ButtonGroup gRdJKlm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbIdJab;
    private javax.swing.JLabel lbIdPeg;
    private tools.MyPaanelInt myPaanelInt1;
    private javax.swing.JPanel pnlId;
    private javax.swing.JPanel pnlJab;
    private javax.swing.JTable tblJab;
    private javax.swing.JTable tblPeg;
    private com.toedter.calendar.JDateChooser tglMasuk;
    private javax.swing.JTextField txAlmt;
    private javax.swing.JTextField txIdJab;
    private javax.swing.JTextField txIdPeg;
    private javax.swing.JTextField txJabtn;
    private javax.swing.JTextField txJrsn;
    private javax.swing.JTextField txKota;
    private javax.swing.JTextField txNik;
    private javax.swing.JTextField txNmPeg;
    private javax.swing.JTextField txTlp;
    // End of variables declaration//GEN-END:variables

    private void statusAwal(){
        kosongJText();
        setInputan(false);
        btSimpan.setText("Tambah");
        btEdit.setText("Edit");
        btHapus.setText("Hapus");
        btTutup.setText("Tutup");
        btSimpan.setEnabled(true);
        btEdit.setEnabled(false);
        btHapus.setEnabled(false);
        pnlId.setVisible(false);
        pnlJab.setVisible(false);
      //tglMasuk.setDate(dt);
    }

    private void siapSimpan(){
        setInputan(true);
        btSimpan.setText("Simpan");
        btTutup.setText("Batal");
        btSimpan.setEnabled(true);
        btEdit.setEnabled(false);
        btHapus.setEnabled(false);
    }

    private void tabelKlik(){
        setInputan(false);
        btSimpan.setEnabled(false);
        btEdit.setEnabled(true);
        btHapus.setEnabled(true);
        btTutup.setText("Batal");
    }

    private void kosongJText(){
        txIdPeg.setText("");
        txIdJab.setText("");
        txNik.setText("");
        txNmPeg.setText("");
        txAlmt.setText("");
        txKota.setText("");
        txTlp.setText("");
        txJrsn.setText("-");
        txJabtn.setText("");
    }

    private void setInputan(boolean aktif){
        txNik.setEnabled(aktif);
        txNmPeg.setEnabled(aktif);
        txAlmt.setEnabled(aktif);
        txKota.setEnabled(aktif);
        txTlp.setEnabled(aktif);
        tglMasuk.setEnabled(aktif);
        cbSeklh.setEnabled(aktif);
        txJrsn.setEnabled(aktif);
        txJabtn.setEnabled(false);
        btCariJab.setEnabled(aktif);
        //tblJab.setVisible(aktif);
    }

    private void tampilData(){
        SqlPegawai qpg = new SqlPegawai(KonekDB.getKonek());
        tblPeg.setModel(new TblPegawai(qpg.getAll()));
        AutoFitTableColumns.autoResizeTable(tblPeg, true);
    }
}