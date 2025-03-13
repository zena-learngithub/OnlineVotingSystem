package com.onlinevotingsystem;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Zenawi Zemene
 */
public class SignForm extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement statement = null;
    ResultSet rs;
    String sqlAdmin,sqlUser;
    int userID;
    
    public SignForm() {
        super("Login");
        initComponents();
    }
    
    private boolean authenticateUser(String sql, String role, String password) throws SQLException {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = ConnectionDB.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, role);
            statement.setString(2, password);
            rs = statement.executeQuery();
        }catch(ClassNotFoundException | SQLException ce){
            ce.getMessage();
            ce.getStackTrace();
        }
        return rs.next();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        passwordField1 = new javax.swing.JPasswordField();
        comboBoxUserType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(79, 178, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Here", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 36), new java.awt.Color(0, 153, 0))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/onlinevotingsystem/icons/key.png"))); // NOI18N

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 204, 0));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 204, 0));
        btnRegister.setText("SignUp");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        passwordField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passwordField1.setText("password");
        passwordField1.setToolTipText("user type");

        comboBoxUserType.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        comboBoxUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Voter" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                    .addComponent(passwordField1)
                    .addComponent(comboBoxUserType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLogin, btnRegister});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(comboBoxUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnRegister))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLogin, btnRegister});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String role = (String)comboBoxUserType.getSelectedItem();
        char[] passwordChars = passwordField1.getPassword();
        String password = new String(passwordChars);
        
        sqlAdmin = "SELECT * FROM AdminTable WHERE Role = ? AND Password = ?";

        sqlUser = "SELECT * FROM VotersTable WHERE Role = ? AND password = ?";
    
            // Authenticate user
        try{
            if (authenticateUser(sqlAdmin, role, password)) {
                JOptionPane.showMessageDialog(this, "Admin authenticated successfully!","Message",JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new AdminHome().setVisible(true); 
            }else if (authenticateUser(sqlUser, role, password)) {
                userID = rs.getInt("voter_id");
                int approved = rs.getInt("approved");
                if(approved == 1){
                    JOptionPane.showMessageDialog(this, " User authenticated successfully!","Message",JOptionPane.INFORMATION_MESSAGE );
                    dispose();
                    new EPollingStation(userID).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, " User Not approved yet! Wait for some time and login again","Message",JOptionPane.INFORMATION_MESSAGE );
                }
            }else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.","Error",JOptionPane.ERROR_MESSAGE );
                passwordField1.setText("");
            } 
        }catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        dispose();
        RegistrationForm registerForm = new RegistrationForm();
        registerForm.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> comboBoxUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField1;
    // End of variables declaration//GEN-END:variables

}
