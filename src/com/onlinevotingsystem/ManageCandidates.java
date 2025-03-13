package com.onlinevotingsystem;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Zenawi Zemene
 */
public class ManageCandidates extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement statement = null;
    ResultSet rs;
    String sql;
    
    public ManageCandidates() {
        super("Manage candidates");
        initComponents();
        showCandidateInformation();
    }
    private void showCandidateInformation(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = ConnectionDB.getConnection();

            sql = "SELECT *FROM CandTable";
            statement = conn.prepareStatement(sql);
            rs = statement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tblCandidateShow.getModel();
            while (rs.next()) {
                Object[] row = {
                    rs.getInt("CID"),
                    rs.getString("Name"),
                    rs.getInt("Age"),
                    rs.getString("Gender"),
                    rs.getString("Address"),
                    rs.getString("Symbol"),
                    rs.getBlob("Picture")
                };
                model.addRow(row);
            }    
            conn.close();
            }catch(ClassNotFoundException e){
                System.out.println(e.getMessage());
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
    }
    private void registerCandidate(Candidate candidate) { 
        String name = candidate.getName();
        int age = Integer.parseInt(candidate.getAge());
        String gender = candidate.getGender();
        String address = candidate.getAddress();
        String symbol = candidate.getSymbol();
        sql = "INSERT INTO CandTable(Name, Age, Gender, Address, Symbol,Picture)"
        + " VALUES(?, ?, ?, ?, ?, ?)";
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
             conn = ConnectionDB.getConnection();
            statement = conn.prepareStatement(sql);
            
            InputStream image = new FileInputStream(picPath);
            statement.setString(1, name);
            statement.setInt(2, age);
            statement.setString(3, gender);
            statement.setString(4, address);
            statement.setString(5, symbol);
            statement.setBlob(6, image);

            int row = statement.executeUpdate();
            if(row > 0){
                JOptionPane.showMessageDialog(this, "Candidate registered successfully");
            }
            
        conn.close();
        }catch(ClassNotFoundException e){
            System.out.println("Oracle JDBC Driver not found.");
        }catch(SQLException e){
            System.err.println("Error registering user: " + e.getMessage());
        }catch(Exception e){
            System.err.println("Error registering user: " + e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfAge = new javax.swing.JTextField();
        comboBoxGender = new javax.swing.JComboBox<>();
        tfAddress = new javax.swing.JTextField();
        tfSymbol = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        imageSpaceLabel = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCandidateShow = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(79, 178, 204));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/onlinevotingsystem/icons/left-arrow.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Age");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Gender");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Symbol");

        tfName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        tfAge.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        comboBoxGender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        tfAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        tfSymbol.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 153, 0));
        btnAdd.setText("Register");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        imageSpaceLabel.setForeground(new java.awt.Color(255, 0, 0));
        imageSpaceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageSpaceLabel.setText("Drop Picture here");
        imageSpaceLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        imageSpaceLabel.setOpaque(true);

        btnBrowse.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(58, 58, 58)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(btnRemove)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(imageSpaceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBrowse)
                        .addGap(82, 82, 82))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfAddress, tfAge, tfName, tfSymbol});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(comboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)))))
                    .addComponent(imageSpaceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove)
                    .addComponent(btnBrowse))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboBoxGender, tfAddress, tfAge, tfName, tfSymbol});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnRemove});

        jPanel2.setBackground(new java.awt.Color(79, 178, 204));

        tblCandidateShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CID", "Name", "Age", "Gender", "Address", "Symbol", "Picture"
            }
        ));
        jScrollPane1.setViewportView(tblCandidateShow);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name = tfName.getText();
        String age = tfAge.getText();
        String gender = (String) comboBoxGender.getSelectedItem();
        String address = tfAddress.getText();
        String symbol = tfSymbol.getText();
        if(name.isEmpty() ||age.isEmpty() ||gender.isEmpty() ||address.isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields must be filled with data","Message",JOptionPane.ERROR_MESSAGE);
        }else if(Integer.parseInt(age) < 0){
            JOptionPane.showMessageDialog(null, "Age Must be Positive number","Error",JOptionPane.ERROR_MESSAGE);
        }else if(Integer.parseInt(age) < 21){
            JOptionPane.showMessageDialog(null, "Age Must be atleast 21 to be elected","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            Candidate userCandidate = new Candidate(name, age,gender, address, symbol);
        
            this.registerCandidate(userCandidate);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        AdminHome adminHome = new AdminHome();
        adminHome.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed
    String picPath = null;
    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null); //this will show us the dialog to choose files
        File fileImage = fileChooser.getSelectedFile(); //filImage is the selected image from the dialog
        String path = fileImage.getAbsolutePath(); // path holds the location of the image file
        try {
            BufferedImage bi = ImageIO.read(new File(path));
            Image image = bi.getScaledInstance(175, 152, Image.SCALE_SMOOTH);
            
            ImageIcon imageIcon = new ImageIcon(image); //convert image into icon
            imageSpaceLabel.setIcon(imageIcon); //set the icon on the label
        } catch (IOException ex) {
            Logger.getLogger(this.getName()).log(Level.SEVERE, null, ex);
        }
        
        picPath = path;
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        if(tblCandidateShow.getSelectedRow() != -1){
            DefaultTableModel model = (DefaultTableModel) tblCandidateShow.getModel();
            int id = (int) model.getValueAt(tblCandidateShow.getSelectedRow(), 0);
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = ConnectionDB.getConnection();
                
                sql = "DELETE FROM CandTable WHERE CID = ?";
                statement = conn.prepareStatement(sql);
                statement.setInt(1, id);
                statement.executeUpdate();
                conn.close();
                
                model.removeRow(tblCandidateShow.getSelectedRow());
                System.out.println("successfully deleted");
            }catch(ClassNotFoundException e){
                System.out.println(e.getMessage());
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please select a Candidate From the table to delete", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> comboBoxGender;
    private javax.swing.JLabel imageSpaceLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCandidateShow;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfSymbol;
    // End of variables declaration//GEN-END:variables
}
