package db.conn;


import com.mysql.cj.protocol.Resultset;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohit
 */
public class LoginFinal extends javax.swing.JFrame {

    
    /**
     * Creates new form login
     */
    public LoginFinal() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginpanel = new javax.swing.JPanel();
        loginheading = new javax.swing.JLabel();
        loginimage = new javax.swing.JLabel();
        tip = new javax.swing.JLabel();
        usernametextlogin = new javax.swing.JLabel();
        usernamelogin = new javax.swing.JTextField();
        passwordtextlogin = new javax.swing.JLabel();
        cancel1 = new javax.swing.JButton();
        login = new javax.swing.JButton();
        newaccount = new javax.swing.JLabel();
        forgotpass = new javax.swing.JLabel();
        passwordlogin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(44, 62, 80));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(Toolkit.getDefaultToolkit().getScreenSize());

        loginpanel.setBackground(new java.awt.Color(44, 62, 80));

        loginheading.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        loginheading.setForeground(new java.awt.Color(255, 255, 255));
        loginheading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginheading.setText("LOGIN");

      

        tip.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tip.setForeground(new java.awt.Color(255, 255, 0));
        tip.setText("**Please enter your username and password");

        usernametextlogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernametextlogin.setForeground(new java.awt.Color(255, 255, 255));
        usernametextlogin.setText("Username:");

        usernamelogin.setBackground(new java.awt.Color(108, 122, 137));
        usernamelogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernamelogin.setToolTipText("Enter Mobile Number or Email id");
        usernamelogin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usernamelogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameloginActionPerformed(evt);
            }
        });

        passwordtextlogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordtextlogin.setForeground(new java.awt.Color(255, 255, 255));
        passwordtextlogin.setText("Password:");

        cancel1.setBackground(new java.awt.Color(255, 0, 0));
        cancel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel1.setText("Exit");
        cancel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cancel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel1.setFocusCycleRoot(true);
        cancel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(0, 153, 0));
        login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login.setText("Login");
        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        newaccount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newaccount.setForeground(new java.awt.Color(255, 255, 0));
        newaccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newaccount.setText("Create new account");
        newaccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newaccountMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newaccountMousePressed(evt);
            }
        });

        forgotpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        forgotpass.setForeground(new java.awt.Color(255, 255, 0));
        forgotpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotpass.setText("Forgot Password");
        forgotpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                forgotpassMousePressed(evt);
            }
        });

        passwordlogin.setBackground(new java.awt.Color(108, 122, 137));
        passwordlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginheading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(438, 438, 438)
                .addComponent(loginimage)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(tip, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(loginpanelLayout.createSequentialGroup()
                                .addComponent(forgotpass, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginpanelLayout.createSequentialGroup()
                                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordtextlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernametextlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(loginpanelLayout.createSequentialGroup()
                                        .addComponent(cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(usernamelogin, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)))))
                .addGap(0, 206, Short.MAX_VALUE))
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(loginheading, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addComponent(tip, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernamelogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernametextlogin))
                        .addGap(25, 25, 25)
                        .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordtextlogin))
                        .addGap(25, 25, 25)
                        .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(loginimage))
                .addGap(21, 21, 21)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newaccount)
                    .addComponent(forgotpass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(282, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(loginpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
            this.dispose();
    }//GEN-LAST:event_cancel1ActionPerformed

    
    /**************************************ENCRYPTION ALGORITHMS***********************************************************/
   public  String rev(char  a[] ,int d){
       String pass = null;
        for(int i=0;i<d;i++){
         pass = pass + a[i];   
        }
        String retstr = pass.substring(4);
        return retstr;
    }
   
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itsa?useTimezone=true&serverTimezone=UTC", "root","");
           
            
            char [] ch = passwordlogin.getPassword();
            String pass = rev(ch,ch.length);                ///////////////////////////PASS ROTATION//////////////////////////
                        
            
           Statement stmnt= con.createStatement();
           String query = ("SELECT * FROM users where `username`=? and `userpassword`=? ");
           PreparedStatement ps = con.prepareStatement(query);
           ps.setString(1,usernamelogin.getText());
           ps.setString(2,pass);
           
            ResultSet executeQuery = ps.executeQuery();
            if(executeQuery.next()){
                new Event().setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"Check Login Credentials...");
            }
            
        }
        catch (ClassNotFoundException ex) {
            JOptionPane.showConfirmDialog(null,"Please Contact Support Team");
        } catch (SQLException ex) {
          //  System.out.println();
            JOptionPane.showMessageDialog(null,"Please Contact Support Team");

        }
    }//GEN-LAST:event_loginActionPerformed

    private void usernameloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameloginActionPerformed

    private void passwordloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordloginActionPerformed

    private void forgotpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpassMousePressed
           new Forgot().setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_forgotpassMousePressed

    private void newaccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newaccountMousePressed
           new SignUp().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_newaccountMousePressed

    private void newaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newaccountMouseClicked
                    // TODO add your handling code here:
                   
    }//GEN-LAST:event_newaccountMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_loginMouseClicked
public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                } else {
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      
        
        new LoginFinal().setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel1;
    private javax.swing.JLabel forgotpass;
    private javax.swing.JButton login;
    private javax.swing.JLabel loginheading;
    private javax.swing.JLabel loginimage;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JLabel newaccount;
    private javax.swing.JPasswordField passwordlogin;
    private javax.swing.JLabel passwordtextlogin;
    private javax.swing.JLabel tip;
    private javax.swing.JTextField usernamelogin;
    private javax.swing.JLabel usernametextlogin;
    // End of variables declaration//GEN-END:variables
}
