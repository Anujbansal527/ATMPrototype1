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
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Anuj Bansal
 */
public class Deposite extends javax.swing.JFrame {

    /**
     * Creates new form Deposite
     */
    public Deposite() {
        initComponents();
    }
    
    int MyAccNum;
     public Deposite(int AccountNum) {
        initComponents();
        MyAccNum =AccountNum;
        AccNum.setText(""+MyAccNum);
        GetBalance();
    }

        Connection conn = null;
        PreparedStatement pst = null,pst1=null;
        ResultSet rs=null,rs1=null;
        Statement st=null,st1=null;
        
        int OldBalance;
        
    private void GetBalance()
    {
         String Query ="select * from accsingup where AccNum='"+MyAccNum+"'";
       try
       {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","root");
        st1 = conn.createStatement();
        rs1 = st1.executeQuery(Query);
        if(rs1.next())
        {
            OldBalance =  rs1.getInt(10);
            Bal.setText("Rs."+OldBalance);
        }
        else
            {
                //JOptionPane.showMessageDialog(this,"Wrong Account Number Or Pin");
            }
       }
       catch(Exception e)
        {
           
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AccNum = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LOGOUT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Amntb = new javax.swing.JTextField();
        Deposit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Bal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel1.setText("DEPOSIT");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ACCOUNT NUMBER :");

        AccNum.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AccNum.setForeground(new java.awt.Color(255, 255, 255));
        AccNum.setText("AccNum");

        jLabel12.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 255));
        jLabel12.setText("Welcome");

        LOGOUT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LOGOUT.setText("LOGOUT");
        LOGOUT.setBorder(new javax.swing.border.MatteBorder(null));
        LOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(497, 497, 497)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(519, 519, 519)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 495, Short.MAX_VALUE)
                .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(AccNum))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(LOGOUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Amount :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 301, 60));

        Amntb.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Amntb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmntbActionPerformed(evt);
            }
        });
        getContentPane().add(Amntb, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 530, 50));

        Deposit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Deposit.setText("DEPOSIT");
        Deposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositMouseClicked(evt);
            }
        });
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });
        getContentPane().add(Deposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 200, 50));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, 190, 50));

        Bal.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        Bal.setForeground(new java.awt.Color(255, 255, 255));
        Bal.setText("Balance");
        getContentPane().add(Bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 530, 60));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Your Balance :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, 60));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/atm.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
  
    String MyDate;
    public void GetDate()
    {
        Date d=new Date();
        SimpleDateFormat s=new SimpleDateFormat("dd-mm-yyy");
        MyDate = s.format(d);
    }
    
   
   int TrId=0;
    private void Count()
    {
        try
        {
            st1 =conn.createStatement();
            rs1=st1.executeQuery("select Max(Tid) from transecctions");
            TrId =parseInt(""+ rs1); 
        }catch(Exception e)
        {
        
        }
    }
    
    private void DepositeMoney()
    {
        try
            {
               GetDate();
               Count();
               conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","root");
               PreparedStatement Add =conn.prepareStatement("insert into transecctions values(?,?,?,?,?)");
               Add.setInt(1,TrId);
               Add.setInt(2, MyAccNum);
               Add.setString(3, "Deposit");
               Add.setString(4, AccNum.getText());
               Add.setString(5, MyDate);
              
                       
               int row= Add.executeUpdate();
               
               // JOptionPane.showMessageDialog(this,"Account Saved");
               
               conn.close();
               // Clear();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e);
            }
    }
    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositActionPerformed

    private void DepositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositMouseClicked
            
        if(Amntb.getText().isEmpty() || Amntb.getText().equals(0))
        {
               JOptionPane.showMessageDialog(this,"Enter Valid Ammount");
        }
        else
        {
            try{
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","root");
            String Query= "Update accsingup  SET Balance = ? WHERE AccNum = ? ";
            
            PreparedStatement ps = conn.prepareStatement(Query);
            ps.setInt(1,OldBalance+Integer.valueOf(Amntb.getText()));
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate()==1)
            {
                
                JOptionPane.showMessageDialog(this, "Balance Updated");
                DepositeMoney();
                
            }
            else
                {
                    JOptionPane.showMessageDialog(this,"Missing Information");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);

            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new login().setVisible(true);
         setVisible(false);
        
       new MainMenu(MyAccNum).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTActionPerformed

        new login().setVisible(true);
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_LOGOUTActionPerformed

    private void AmntbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmntbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmntbActionPerformed

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
            java.util.logging.Logger.getLogger(Deposite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccNum;
    private javax.swing.JTextField Amntb;
    private javax.swing.JLabel Bal;
    private javax.swing.JButton Deposit;
    private javax.swing.JButton LOGOUT;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
