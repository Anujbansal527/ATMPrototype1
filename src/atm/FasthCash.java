/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Anuj Bansal
 */
public class FasthCash extends javax.swing.JFrame {

    /**
     * Creates new form FasthCash
     */
    public FasthCash() {
        initComponents();
    }
    int MyAccNum;  
    public FasthCash(int AccountNum) {
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AccNum = new javax.swing.JLabel();
        a100 = new javax.swing.JButton();
        a200 = new javax.swing.JButton();
        a500 = new javax.swing.JButton();
        a1000 = new javax.swing.JButton();
        a10000 = new javax.swing.JButton();
        a20000 = new javax.swing.JButton();
        Bal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setForeground(new java.awt.Color(0, 51, 0));

        jLabel1.setBackground(new java.awt.Color(153, 255, 102));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fast Cash");

        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 255));
        jLabel12.setText("Welcome");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ACCOUNT NUMBER :");

        AccNum.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AccNum.setForeground(new java.awt.Color(255, 255, 255));
        AccNum.setText("AccNum");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(523, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccNum)
                .addGap(494, 494, 494)
                .addComponent(logout)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(508, 508, 508)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(AccNum)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 100));

        a100.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        a100.setText("RS.100");
        a100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a100MouseClicked(evt);
            }
        });
        getContentPane().add(a100, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 200, 50));

        a200.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        a200.setText("RS.200");
        a200.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a200MouseClicked(evt);
            }
        });
        getContentPane().add(a200, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, 200, 50));

        a500.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        a500.setText("RS.500");
        a500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a500MouseClicked(evt);
            }
        });
        getContentPane().add(a500, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 200, 50));

        a1000.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        a1000.setText("RS.1000");
        a1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a1000MouseClicked(evt);
            }
        });
        getContentPane().add(a1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 460, 200, 50));

        a10000.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        a10000.setText("RS.10000");
        a10000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a10000MouseClicked(evt);
            }
        });
        getContentPane().add(a10000, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, 200, 50));

        a20000.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        a20000.setText("RS.20000");
        a20000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a20000MouseClicked(evt);
            }
        });
        getContentPane().add(a20000, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, 200, 50));

        Bal.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        Bal.setForeground(new java.awt.Color(255, 255, 255));
        Bal.setText("BALANCE ");
        getContentPane().add(Bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Available Balance :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 660, 200, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/atm.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1370, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a100MouseClicked
        
        if(OldBalance < 100)
                    {
                    JOptionPane.showMessageDialog(this,"Enough Ammount Not Available"+OldBalance);
                    }
                else
                    {
            try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","root");
            String Query= "Update accsingup  SET Balance = ? WHERE AccNum = ? ";
            
            PreparedStatement ps = conn.prepareStatement(Query);
            ps.setInt(1,OldBalance-100);
            ps.setInt(2,MyAccNum);
            
            if(ps.executeUpdate()==1)
            {
             
                JOptionPane.showMessageDialog(this, "Balance Updated ");
                
            }
            else
                {
                    JOptionPane.showMessageDialog(this,"Unsufficient Balance");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);

            }
    }                
        // TODO add your handling code here:
    }//GEN-LAST:event_a100MouseClicked

    private void a200MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a200MouseClicked
        
         if(OldBalance < 200)
                    {
                    JOptionPane.showMessageDialog(this,"Enough Ammount Not Available"+OldBalance);
                    }
                else
                    {
            try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","root");
            String Query= "Update accsingup  SET Balance = ? WHERE AccNum = ? ";
            
            PreparedStatement ps = conn.prepareStatement(Query);
            ps.setInt(1,OldBalance-200);
            ps.setInt(2,MyAccNum);
            
            if(ps.executeUpdate()==1)
            {
             
                JOptionPane.showMessageDialog(this, "Balance Updated ");
              
            }
            else
                {
                    JOptionPane.showMessageDialog(this,"Unsufficient Balance");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);

            }
    }   
        // TODO add your handling code here:
    }//GEN-LAST:event_a200MouseClicked

    private void a500MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a500MouseClicked
             if(OldBalance < 500)
                    {
                    JOptionPane.showMessageDialog(this,"Enough Ammount Not Available"+OldBalance);
                    }
                else
                    {
            try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","root");
            String Query= "Update accsingup  SET Balance = ? WHERE AccNum = ? ";
            
            PreparedStatement ps = conn.prepareStatement(Query);
            ps.setInt(1,OldBalance-500);
            ps.setInt(2,MyAccNum);
            
            if(ps.executeUpdate()==1)
            {
             
                JOptionPane.showMessageDialog(this, "Balance Updated ");
               
            }
            else
                {
                    JOptionPane.showMessageDialog(this,"Unsufficient Balance");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);

            }
    }   
        // TODO add your handling code here:
    }//GEN-LAST:event_a500MouseClicked

    private void a1000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1000MouseClicked
             if(OldBalance < 1000)
                    {
                    JOptionPane.showMessageDialog(this,"Enough Ammount Not Available"+OldBalance);
                    }
                else
                    {
            try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","root");
            String Query= "Update accsingup  SET Balance = ? WHERE AccNum = ? ";
            
            PreparedStatement ps = conn.prepareStatement(Query);
            ps.setInt(1,OldBalance-1000);
            ps.setInt(2,MyAccNum);
            
            if(ps.executeUpdate()==1)
            {
             
                JOptionPane.showMessageDialog(this, "Balance Updated ");
               
            }
            else
                {
                    JOptionPane.showMessageDialog(this,"Unsufficient Balance");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);

            }
    }   
        // TODO add your handling code here:
    }//GEN-LAST:event_a1000MouseClicked

    private void a10000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a10000MouseClicked
         if(OldBalance < 10000)
                    {
                    JOptionPane.showMessageDialog(this,"Enough Ammount Not Available"+OldBalance);
                    }
                else
                    {
            try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","root");
            String Query= "Update accsingup  SET Balance = ? WHERE AccNum = ? ";
            
            PreparedStatement ps = conn.prepareStatement(Query);
            ps.setInt(1,OldBalance-10000);
            ps.setInt(2,MyAccNum);
            
            if(ps.executeUpdate()==1)
            {
             
                JOptionPane.showMessageDialog(this, "Balance Updated ");
               
            }
            else
                {
                    JOptionPane.showMessageDialog(this,"Unsufficient Balance");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);

            }
    }   
        // TODO add your handling code here:
    }//GEN-LAST:event_a10000MouseClicked

    private void a20000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a20000MouseClicked

             if(OldBalance < 20000)
                    {
                    JOptionPane.showMessageDialog(this,"Enough Ammount Not Available"+OldBalance);
                    }
                else
                    {
            try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","root");
            String Query= "Update accsingup  SET Balance = ? WHERE AccNum = ? ";
            
            PreparedStatement ps = conn.prepareStatement(Query);
            ps.setInt(1,OldBalance-20000);
            ps.setInt(2,MyAccNum);
            
            if(ps.executeUpdate()==1)
            {
             
                JOptionPane.showMessageDialog(this, "Balance Updated ");
                
            }
            else
                {
                    JOptionPane.showMessageDialog(this,"Unsufficient Balance");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);

            }
    }   
        // TODO add your handling code here:
    }//GEN-LAST:event_a20000MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MainMenu(MyAccNum).setVisible(true);
          setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
            new login().setVisible(true);
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
            java.util.logging.Logger.getLogger(FasthCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FasthCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FasthCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FasthCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FasthCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccNum;
    private javax.swing.JLabel Bal;
    private javax.swing.JButton a100;
    private javax.swing.JButton a1000;
    private javax.swing.JButton a10000;
    private javax.swing.JButton a200;
    private javax.swing.JButton a20000;
    private javax.swing.JButton a500;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
