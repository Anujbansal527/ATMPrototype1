/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Anuj Bansal
 */
public class Withdraw extends javax.swing.JFrame {

    /**
     * Creates new form Withdraw
     */
    public Withdraw() {
        initComponents();
    }

    Connection conn = null;
    PreparedStatement pst = null, pst1 = null;
    ResultSet rs = null, rs1 = null;
    Statement st = null, st1 = null;

    int OldBalance;

    int MyAccNum;

    public Withdraw(int AccountNum) {
        initComponents();
        MyAccNum = AccountNum;
        AccNum.setText("" + MyAccNum);
        GetBalance();

    }

    String MyDate;

    public void GetDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        MyDate = dtf.format(now);
    }

    int TrId = 0;

    private void Count() {
        try {
            st1 = conn.createStatement();
            rs1 = st1.executeQuery("select Max(Tid) from trans");
            TrId = parseInt("" + rs1);
        } catch (Exception e) {

        }
    }

    private void WithDrawMoney() {
        try {
            GetDate();
            Count();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "root");
            PreparedStatement Add = conn.prepareStatement("insert into trans values(?,?,?,?,?)");
            Add.setInt(1, TrId);
            Add.setInt(2, MyAccNum);
            Add.setString(3, "WithDraw");
            Add.setString(4, MyDate);
            Add.setString(5, Integer.toString(OldBalance));

            int row = Add.executeUpdate();

            conn.close();
            // Clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            //error solve karna hai mini statement wali
        }
    }

    private void GetBalance() {
        String Query = "select * from accsingup where AccNum='" + MyAccNum + "'";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "root");
            st1 = conn.createStatement();
            rs1 = st1.executeQuery(Query);
            if (rs1.next()) {
                OldBalance = rs1.getInt(10);
                Bal.setText("" + OldBalance);
            } else {
                //JOptionPane.showMessageDialog(this,"Wrong Account Number Or Pin");
            }
        } catch (Exception e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AccNum = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Amntb = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Bal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setForeground(new java.awt.Color(0, 51, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 100));

        jLabel1.setBackground(new java.awt.Color(153, 255, 102));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WITHDRAW");

        jLabel12.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 255));
        jLabel12.setText("Welcome");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Account Number :");

        AccNum.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AccNum.setForeground(new java.awt.Color(255, 255, 255));
        AccNum.setText("AccNum");

        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(479, 479, 479)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AccNum)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 495, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(AccNum))
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Your Balance :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 320, 60));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ammount :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 320, 60));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("WITHDRAW");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 200, 50));

        Amntb.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Amntb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmntbActionPerformed(evt);
            }
        });
        getContentPane().add(Amntb, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 620, 70));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 510, 200, 50));

        Bal.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        Bal.setForeground(new java.awt.Color(255, 255, 255));
        Bal.setText("Balance");
        getContentPane().add(Bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 620, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/atm.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1370, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        if (Amntb.getText().isEmpty() || Amntb.getText().equals(0)) {
            JOptionPane.showMessageDialog(this, "Enter Valid Ammount");
        } else if (OldBalance < Integer.valueOf(Amntb.getText())) {
            JOptionPane.showMessageDialog(this, "Enough Ammount Is Not Available " + OldBalance);
        } else {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "root");
                String Query = "Update accsingup  SET Balance = ? WHERE AccNum = ? ";

                PreparedStatement ps = conn.prepareStatement(Query);
                ps.setInt(1, OldBalance - Integer.valueOf(Amntb.getText()));
                ps.setInt(2, MyAccNum);

                if (ps.executeUpdate() == 1) {
                    /*  String newbal =" select Balance from accsingup where AccNum = '"+MyAccNum+"';";
               try
                {
                 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","root");
                 st1 = conn.createStatement();
                 rs1 = st1.executeQuery(newbal);
                }
               catch(Exception e)
                  {
                   }*/

                    JOptionPane.showMessageDialog(this, "Balance Updated ");
                    JOptionPane.showMessageDialog(this, "Redirected to Balance for Checking Availavable Balance ");
                    WithDrawMoney();
                    new Balance(MyAccNum).setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);

            }

            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new MainMenu(MyAccNum).setVisible(true);
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AmntbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmntbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmntbActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new Login().setVisible(true);
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccNum;
    private javax.swing.JTextField Amntb;
    private javax.swing.JLabel Bal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
