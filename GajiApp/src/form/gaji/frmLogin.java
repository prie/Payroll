/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmLogin.java
 *
 * Created on 19 Des 12, 6:49:05
 */

package form.gaji;

import entity.User;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import sql.methodes.SqlUser;
import tools.KonekDB;
import usu.widget.Form;

/**
 *
 * @author Prie
 */
public class frmLogin extends Form {

    private frmUtama utm;

   // public String idAm;
    /** Creates new form frmLogin */
    public frmLogin(){
        initComponents();
    }

    public frmLogin(frmUtama utm) {
        this.utm = utm;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myPaanelInt1 = new tools.MyPaanelInt();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        psWrd = new javax.swing.JPasswordField();
        btBtl = new javax.swing.JButton();
        btLgn = new javax.swing.JButton();

        setAnimationHide(usu.widget.constan.Animation.HIDE_TO_BOTTOM);
        setAnimationShow(usu.widget.constan.Animation.SHOW_FROM_BOTTOM);
        setResizable(false);
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lockp.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login1.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "  L O G I N  ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        btBtl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelLgn.png"))); // NOI18N
        btBtl.setText("Batal");
        btBtl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBtlActionPerformed(evt);
            }
        });

        btLgn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/okeLgn.png"))); // NOI18N
        btLgn.setText("Login");
        btLgn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLgnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(psWrd, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(txUser, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btLgn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBtl)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(psWrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBtl)
                    .addComponent(btLgn))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout myPaanelInt1Layout = new javax.swing.GroupLayout(myPaanelInt1);
        myPaanelInt1.setLayout(myPaanelInt1Layout);
        myPaanelInt1Layout.setHorizontalGroup(
            myPaanelInt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPaanelInt1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myPaanelInt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(myPaanelInt1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))
                .addContainerGap())
        );
        myPaanelInt1Layout.setVerticalGroup(
            myPaanelInt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPaanelInt1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myPaanelInt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(myPaanelInt1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-318)/2, (screenSize.height-268)/2, 318, 268);
    }// </editor-fold>//GEN-END:initComponents

    private void btLgnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLgnActionPerformed
        // TODO add your handling code here:
        if(txUser.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Harap masukkan Username Anda!", "Peringatan", JOptionPane.OK_OPTION);
            txUser.requestFocus();
            return;
        }
        if(psWrd.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Harap masukkan Password Anda!", "Peringatan", JOptionPane.OK_OPTION);
            psWrd.requestFocus();
            return;
        }
        login(utm);
    }//GEN-LAST:event_btLgnActionPerformed

    private void btBtlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBtlActionPerformed
        // TODO add your handling code here:
        int jawab = JOptionPane.showConfirmDialog(null, "Anda membatalkan Login?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (jawab==JOptionPane.YES_OPTION){
            this.setVisible(false);
        }
    }//GEN-LAST:event_btBtlActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBtl;
    private javax.swing.JButton btLgn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private tools.MyPaanelInt myPaanelInt1;
    private javax.swing.JPasswordField psWrd;
    private javax.swing.JTextField txUser;
    // End of variables declaration//GEN-END:variables

    public JPasswordField getPsWrd() {
        return psWrd;
    }

    private void login(frmUtama utm){
        String un = txUser.getText();
        String pw = psWrd.getText();
        SqlUser qus = new SqlUser(KonekDB.getKonek());
        User usr = qus.getBy(un,pw);
        //System.out.println("ID = "+usr.getIdAdm());
        if(usr.getIdAdm()==0){
            JOptionPane.showMessageDialog(this, "Maaf, USERNAME atau PASSWORD Anda salah!","Peringatan",JOptionPane.OK_OPTION);
            txUser.setText("");
            psWrd.setText("");
            txUser.requestFocus();
        }else {
            int ida = usr.getIdAdm();
            JOptionPane.showMessageDialog(this, "Login Sukses...");
            this.setVisible(false);
            utm.siap();
            utm.setIdm(ida);            
        }
    }

}
