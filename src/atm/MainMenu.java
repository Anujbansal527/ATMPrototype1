/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm;

/**
 *
 * @author Anuj Bansal
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MianMenu
     */
    public MainMenu() {
        initComponents();
    }

    int MyAccNum;

    public MainMenu(int AccountNum) {
        initComponents();
        MyAccNum = AccountNum;
        AccNum.setText("" + MyAccNum);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AccNum = new javax.swing.JLabel();
        deposit = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        fastcash = new javax.swing.JButton();
        ministatement = new javax.swing.JButton();
        changepin = new javax.swing.JButton();
        balance = new javax.swing.JButton();
        Transfer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setForeground(new java.awt.Color(0, 51, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 255, 102));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MAIN MENU");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 11, 230, 32));

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton7.setText("LOGOUT");
        jButton7.setBorder(new javax.swing.border.MatteBorder(null));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 50, 80, 34));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 255));
        jLabel12.setText("Welcome");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ACCOUNT NUMBER :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 64, -1, -1));

        AccNum.setBackground(new java.awt.Color(0, 255, 0));
        AccNum.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AccNum.setForeground(new java.awt.Color(255, 255, 255));
        AccNum.setText("AccNum");
        jPanel1.add(AccNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 64, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.getAccessibleContext().setAccessibleName("");

        deposit.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        deposit.setText("DEPOSIT");
        deposit.setBorder(new javax.swing.border.MatteBorder(null));
        deposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositMouseClicked(evt);
            }
        });
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });
        getContentPane().add(deposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 210, 250, 50));

        withdraw.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        withdraw.setText("WITHDRAW");
        withdraw.setBorder(new javax.swing.border.MatteBorder(null));
        withdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawMouseClicked(evt);
            }
        });
        getContentPane().add(withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 346, 250, 50));

        fastcash.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        fastcash.setText("FAST CASH");
        fastcash.setBorder(new javax.swing.border.MatteBorder(null));
        fastcash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fastcashMouseClicked(evt);
            }
        });
        fastcash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastcashActionPerformed(evt);
            }
        });
        getContentPane().add(fastcash, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 606, 250, 50));

        ministatement.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ministatement.setForeground(new java.awt.Color(255, 0, 0));
        ministatement.setText("MINI STATEMENT");
        ministatement.setBorder(new javax.swing.border.MatteBorder(null));
        ministatement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ministatementMouseClicked(evt);
            }
        });
        ministatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ministatementActionPerformed(evt);
            }
        });
        getContentPane().add(ministatement, new org.netbeans.lib.awtextra.AbsoluteConstraints(1072, 481, 250, 50));

        changepin.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        changepin.setText("CHANGE PIN");
        changepin.setBorder(new javax.swing.border.MatteBorder(null));
        changepin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepinMouseClicked(evt);
            }
        });
        getContentPane().add(changepin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1072, 351, 250, 50));

        balance.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        balance.setText("BALANCE");
        balance.setBorder(new javax.swing.border.MatteBorder(null));
        balance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                balanceMouseClicked(evt);
            }
        });
        getContentPane().add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 210, 250, 50));

        Transfer.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Transfer.setText("TRANSFER");
        Transfer.setBorder(new javax.swing.border.MatteBorder(null));
        Transfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransferMouseClicked(evt);
            }
        });
        getContentPane().add(Transfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 476, 250, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AMMOUNT  DEPOSITE :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 216, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AMMOUNT WITHDRAW :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 352, 360, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TRANSFER AMMOUNT:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 482, 340, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FAST AMMOUNT :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 612, 290, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PIN CHANGING :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 352, 270, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BALANCE CHECK :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 300, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MINI STATEMENT :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 482, 300, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/atm.jpg"))); // NOI18N
        jLabel11.setText(".");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1380, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositActionPerformed

    private void depositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositMouseClicked
        new Deposite(MyAccNum).setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_depositMouseClicked

    private void withdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawMouseClicked
        new Withdraw(MyAccNum).setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawMouseClicked

    private void fastcashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fastcashMouseClicked
        new FasthCash(MyAccNum).setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_fastcashMouseClicked

    private void ministatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ministatementActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_ministatementActionPerformed

    private void ministatementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ministatementMouseClicked
        new MiniState(MyAccNum).setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ministatementMouseClicked

    private void changepinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepinMouseClicked
        new ChangePin(MyAccNum).setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_changepinMouseClicked

    private void balanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balanceMouseClicked
        new Balance(MyAccNum).setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceMouseClicked

    private void TransferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransferMouseClicked
        new Transfer(MyAccNum).setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_TransferMouseClicked

    private void fastcashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastcashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fastcashActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        new Login().setVisible(true);
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccNum;
    private javax.swing.JButton Transfer;
    private javax.swing.JButton balance;
    private javax.swing.JButton changepin;
    private javax.swing.JButton deposit;
    private javax.swing.JButton fastcash;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ministatement;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables

}
