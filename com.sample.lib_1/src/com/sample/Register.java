/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ranjit
 */
public class Register extends javax.swing.JFrame {

    Connection c = null;
    Statement stmt = null;

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    public void On_signup() {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "INSERT INTO STUDENT1 (ENO,NAME,EMAIL,DEPT,PASS) "
                    + "VALUES ('" + eno.getText() + "', '" + name.getText() + "'"
                    + ", '" + email.getText() + "', '" + dept.getText() + "', '" + pass.getText() + "' );";
            stmt.executeUpdate(sql);
            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Records created successfully");

        Login lg = new Login();
        lg.setVisible(true);
        dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        eno = new javax.swing.JTextField();
        dept = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        reg = new javax.swing.JButton();
        conpass = new javax.swing.JPasswordField();
        pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ENO");

        jLabel2.setText("NAME");

        jLabel3.setText("EMAIL");

        jLabel4.setText("DEPT.");

        jLabel5.setText("PASSWORD");

        jLabel6.setText("CONFIRM PASS.");

        eno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enoActionPerformed(evt);
            }
        });

        reg.setText("REGISTER");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eno)
                            .addComponent(name)
                            .addComponent(email)
                            .addComponent(dept)
                            .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(conpass)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(reg)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(conpass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(reg)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        // TODO add your handling code here:
        if (Utils.isEmpty(eno)) {
            JOptionPane.showMessageDialog(null, "Error you did not enter a ENO, please try again.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            eno.requestFocus();
            return;
        } else if (Utils.isValidMobileNumber(eno.getText().toString().trim()) == false) {
            JOptionPane.showMessageDialog(null, "Eno Should Contain 8 Digits, please try again.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            eno.requestFocus();
            return;
        }
         if (Utils.isEmpty(name)) {
            JOptionPane.showMessageDialog(null, "Error you did not enter a Name, please try again.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            name.requestFocus();
            return;
        }
         
        if (Utils.isEmpty(email)) {
            JOptionPane.showMessageDialog(null, "Error you did not enter a EMail, please try again.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            email.requestFocus();
            return;
        } else if (Utils.isemailValidator(email.getText().toString().trim()) == false) {
            JOptionPane.showMessageDialog(null, "Should Contain Proper Email, please try again.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            email.requestFocus();
            return;
        }
        
        if (Utils.isEmpty(dept)) {
            JOptionPane.showMessageDialog(null, "Error you did not enter a DEPT, please try again.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            dept.requestFocus();
            return;
        }
        
        
        if (Utils.isEmpty(pass)) {
            JOptionPane.showMessageDialog(null, "Error you did not enter a PASSWORD, please try again.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            pass.requestFocus();
            return;
        } 
//        else if (Utils.isValidPassword(pass.getText().toString().trim()) == false) {
//            JOptionPane.showMessageDialog(null, "Password Size should be Greater then 4, please try again.",
//                    "Error", JOptionPane.ERROR_MESSAGE);
//            pass.requestFocus();
//            return;
//        }
        
        if (Utils.isEmpty(conpass))
        {
           JOptionPane.showMessageDialog(null, "Error you did not enter a Conform Password, please try again.",
                    "Error", JOptionPane.ERROR_MESSAGE);
           conpass.requestFocus();
            return;
        }
        else if (conpass.getText().toString().compareTo(pass.getText().toString())!=0) {
            JOptionPane.showMessageDialog(null, "Password is wrong.., please try again.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            conpass.requestFocus();
            return;
        }
        
        On_signup();
        
        

    }//GEN-LAST:event_regActionPerformed

    private void enoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enoActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField conpass;
    private javax.swing.JTextField dept;
    private javax.swing.JTextField email;
    private javax.swing.JTextField eno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton reg;
    // End of variables declaration//GEN-END:variables
}