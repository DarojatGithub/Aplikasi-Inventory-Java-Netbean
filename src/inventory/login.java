/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author TOSHIBA DC
 */
public class login extends javax.swing.JFrame {
Connection conn;
    Statement st;
    ResultSet rs;
 private Object Login;
    /**
     * Creates new form login
     */
    public login() {
       setIcon();
        setKoneksi();
        initComponents();
        setLocationRelativeTo(null);
    }
     private void setIcon() {
          ImageIcon img = new ImageIcon("src/gambar/kredit.png");
        setIconImage(img.getImage());
    }
public Connection setKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/inventory","root","");
            st=conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Koneksi Gagal :" +e);
        }
       return conn; 
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        nameTF = new javax.swing.JTextField();
        aksesCB = new javax.swing.JComboBox<>();
        loginBT = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        passTF = new javax.swing.JPasswordField();
        jRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo unindra.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 130));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CV ANGUGERAH BERKAH JAYA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 270, -1));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 270, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 520));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("LOGIN APLIKASI");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Username  :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Password  :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Hak Akses :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 40));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 320, 10));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 320, -1));

        nameTF.setBorder(null);
        jPanel3.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 250, 30));

        aksesCB.setEditable(true);
        aksesCB.setForeground(new java.awt.Color(255, 255, 255));
        aksesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "petugas", "persediaan", "pemilik", "" }));
        aksesCB.setBorder(null);
        jPanel3.add(aksesCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 250, 40));

        loginBT.setBackground(new java.awt.Color(255, 255, 255));
        loginBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginBT.setText("LOGIN");
        loginBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBTMouseEntered(evt);
            }
        });
        loginBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTActionPerformed(evt);
            }
        });
        jPanel3.add(loginBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 260, 50));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 320, -1));

        passTF.setBorder(null);
        jPanel3.add(passTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 250, 30));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Show Password");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 170, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 400, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 420, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTActionPerformed
        // TODO add your handling code here:
         String u_nama = null;
        if(nameTF.getText().equals("") || passTF.getText().equals("")|| aksesCB.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Lengkapi inputan login","Pesan",JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                setKoneksi();
                String sql="select * from admin where username='"+nameTF.getText()
                +"' and password='"+passTF.getText()+"'and hakakses='"+aksesCB.getSelectedItem()+"'";
                ResultSet rs=st.executeQuery(sql);

                if (rs.next()) {
                    u_nama = rs.getString("nama");
                }
                rs.last();

                if(rs.getRow()>=1){
                    
login.setU_nama(u_nama);
                    if(aksesCB.getSelectedItem().equals("pemilik")){
                        menu MU=new menu();
                        MU.setLocationRelativeTo(null);
                        MU.setVisible(true);
                        MU.hakAksesPemilik();
                        
                        dispose();
                    }else if(aksesCB.getSelectedItem().equals("petugas")){
                        menu MU=new menu();
                        MU.setLocationRelativeTo(null);
                        MU.setVisible(true);
                        MU.hakAksespetugas();
                       
                        dispose();
                    }else if(aksesCB.getSelectedItem().equals("persediaan")){
                        menu MU=new menu();
                        MU.setLocationRelativeTo(null);
                        MU.setVisible(true);
                        MU.hakAksesPersediaan();
                        
                        dispose();
                    }
                }else if(rs.getRow()==0){
                    JOptionPane.showMessageDialog(null,"Username, password atau hak akses tidak sesuai","CV ANUGERAH Berkah", JOptionPane.WARNING_MESSAGE);
                    nameTF.grabFocus();
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_loginBTActionPerformed

    private void loginBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBTMouseEntered
        // TODO add your handling code here:
         loginBT.setBackground(new Color(204,145,226));
        loginBT.setForeground(Color.black);
    }//GEN-LAST:event_loginBTMouseEntered

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aksesCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JButton loginBT;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPasswordField passTF;
    // End of variables declaration//GEN-END:variables


private static String u_nama;
    
    public static String getU_nama() {
        return u_nama;
    }

    public static void setU_nama(String u_nama) {
        login.u_nama = u_nama;
    } 

}
