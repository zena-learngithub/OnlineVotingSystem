
package com.onlinevotingsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Zenawi Zemene
 */
public class ManageElection extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement statement = null;
    String sql;

    public ManageElection() {
        super("Manage Election");
        initComponents();
        showElectionInformation();
    }
    
    private void showElectionInformation(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = ConnectionDB.getConnection();

            sql = "SELECT *FROM ElectionTable";
            statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tblElection.getModel();
            while (rs.next()) {
                Object[] row = {rs.getInt("ElectionId"), rs.getString("ElectionName"), rs.getString("ElectionDate")};
                model.addRow(row);
            }    
            conn.close();
            }catch(ClassNotFoundException e){
                System.out.println(e.getMessage());
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfElectionName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        btnAddElection = new javax.swing.JButton();
        btnRemoveElection = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblElection = new javax.swing.JTable();
        btnUpdateElection = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(79, 178, 204));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Election Management Panel");
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jLabel2.setText("Election Name");
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tfElectionName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setText("Date");
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        btnAddElection.setText("Add");
        btnAddElection.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAddElection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddElectionActionPerformed(evt);
            }
        });

        btnRemoveElection.setText("Remove");
        btnRemoveElection.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRemoveElection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveElectionMouseClicked(evt);
            }
        });
        btnRemoveElection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveElectionActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/onlinevotingsystem/icons/left-arrow.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblElection.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ElectionID", "Election Name", "Date Of Election"
            }
        ));
        tblElection.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblElection.setRowHeight(25);
        jScrollPane1.setViewportView(tblElection);

        btnUpdateElection.setText("Update");
        btnUpdateElection.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnUpdateElection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateElectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAddElection)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemoveElection))
                            .addComponent(tfElectionName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnUpdateElection)))
                        .addGap(0, 79, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddElection, btnRemoveElection, btnUpdateElection});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfElectionName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddElection)
                    .addComponent(btnRemoveElection)
                    .addComponent(btnUpdateElection))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnRemoveElection, btnUpdateElection});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        new AdminHome().setVisible(true);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddElectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddElectionActionPerformed

        if(tfElectionName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill the Election Name", "Erro", JOptionPane.ERROR_MESSAGE);
        }else {
            
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = ConnectionDB.getConnection();

                sql = "INSERT INTO ElectionTable(ElectionName,ElectionDate) VALUES(?, ?)";
                statement = conn.prepareStatement(sql);
                statement.setString(1,tfElectionName.getText());
                statement.setString(2,datePicker1.getDate().toString());

                int row = statement.executeUpdate();
                if(row > 0){
                    JOptionPane.showMessageDialog(this, "Election Added successsfully", "Message",JOptionPane.INFORMATION_MESSAGE);
                }
                
                conn.close();
            }catch(ClassNotFoundException e){
                System.out.println(e.getMessage());
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }

    }//GEN-LAST:event_btnAddElectionActionPerformed

    private void btnRemoveElectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveElectionMouseClicked

        if(tblElection.getSelectedRow() != -1){
            DefaultTableModel model = (DefaultTableModel) tblElection.getModel();
            int id = (int) model.getValueAt(tblElection.getSelectedRow(), 0);
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = ConnectionDB.getConnection();
                
                sql = "DELETE FROM ElectionTable WHERE ElectionId = ?";
                statement = conn.prepareStatement(sql);
                statement.setInt(1, id);
                statement.executeUpdate();
                conn.close();
                
                model.removeRow(tblElection.getSelectedRow());
               // System.out.println("successfully deleted");
            }catch(ClassNotFoundException e){
                System.out.println(e.getMessage());
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please select an Election From the table to delete", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnRemoveElectionMouseClicked

    private void btnUpdateElectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateElectionActionPerformed
        
        if(tblElection.getSelectedRow() != -1){
            if(tfElectionName.getText().isEmpty() || datePicker1.getDate().toString().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill the Election Name and date properly", "Error", JOptionPane.ERROR_MESSAGE);
            }else {
                int selectedRow = tblElection.getSelectedRow();
                DefaultTableModel model = (DefaultTableModel) tblElection.getModel();
                int id = (int) model.getValueAt(selectedRow, 0);
                try{
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    conn = ConnectionDB.getConnection();

                    sql = "UPDATE ElectionTable SET ElectionName = ?,ElectionDate = ? WHERE ElectionId = ?";
                    statement = conn.prepareStatement(sql);
                    statement.setString(1,tfElectionName.getText());
                    statement.setString(2,datePicker1.getDate().toString());
                    statement.setInt(3,id);
                    int row = statement.executeUpdate();
                    if(row > 0){
                        JOptionPane.showMessageDialog(this, "Election Updated successsfully", "Message",JOptionPane.INFORMATION_MESSAGE);
                    }
                    model.setValueAt(tfElectionName, selectedRow, 1);
                    conn.close();
                }catch(ClassNotFoundException e){
                    System.out.println(e.getMessage());
                }catch(SQLException e){
                    System.out.println(e.getMessage());
                }
            } 
        }else {
            JOptionPane.showMessageDialog(this, "Please select a row to update", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateElectionActionPerformed

    private void btnRemoveElectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveElectionActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnRemoveElectionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddElection;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemoveElection;
    private javax.swing.JButton btnUpdateElection;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblElection;
    private javax.swing.JTextField tfElectionName;
    // End of variables declaration//GEN-END:variables
}
