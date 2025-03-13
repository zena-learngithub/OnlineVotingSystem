
package com.onlinevotingsystem;

import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Zenawi Zemene
 */
public class ElectionResult extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement statement = null;
    ResultSet rs;
    String sql;
    public ElectionResult() {
        super("Election Result");
        initComponents();
        showElectedNomineesInformation();
        attachWinnerInformation();
    }
    int electedPerson = 0;
    private int getElectedNomineeID(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = ConnectionDB.getConnection();

            sql = "SELECT CandidateId, COUNT(*) AS VoteCount FROM VotesTable GROUP BY CandidateId";
            statement = conn.prepareStatement(sql);
            rs = statement.executeQuery();
            int maxVoteCount = 0;
            int winnerNomineeId = -1;
            // Find the nominee with the highest vote count
            while (rs.next()) {
                int nomineeId = rs.getInt("CandidateId");
                int voteCount = rs.getInt("VoteCount");
                if (voteCount > maxVoteCount) {
                    maxVoteCount = voteCount;
                    winnerNomineeId = nomineeId;
                }
            }

            if (winnerNomineeId != -1) {
                electedPerson = winnerNomineeId;
            } else {
                electedPerson = 0;
            }
    
            }catch(ClassNotFoundException | SQLException e){
                System.out.println(e.getMessage());
            }
        return electedPerson;

    }
    
    private void attachWinnerInformation(){
        int winnerID = getElectedNomineeID();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = ConnectionDB.getConnection();

            sql = "SELECT * FROM CandTable WHERE CID = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, winnerID);
            rs = statement.executeQuery();
            while (rs.next()) {
                // Get the BLOB data of picture and Name of the winner
                Blob blob = rs.getBlob("picture"); //value of picture column
                String name = rs.getString("Name");
                // Convert BLOB data to an image
                byte[] imageData = blob.getBytes(1, (int) blob.length());
                ImageIcon originalImageIcon = new ImageIcon(imageData);
                
                Image scaledImage = originalImageIcon.getImage().getScaledInstance(228, 175,Image.SCALE_SMOOTH);
                ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

                // Set the image to the label
                lblPhotoArea.setIcon(scaledImageIcon);
                //set the name to the label
                lblNameArea.setText(name);
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }
    
    private void addResultToTable(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = ConnectionDB.getConnection();

            sql = "SELECT CandidateId, COUNT(*) AS VoteCount FROM VotesTable GROUP BY CandidateId";
            statement = conn.prepareStatement(sql);
            rs = statement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            while (rs.next()) {
                int userId = rs.getInt("CandidateId");
                int data = rs.getInt("VoteCount");
                for (int row = 0; row < model.getRowCount(); row++) {
                    if (Integer.parseInt(model.getValueAt(row, 0).toString()) == userId) {
                        model.setValueAt(data, row, 7); // Set data to the "Result" column (index 7)
                        break;
                    }
                }
            }
        }catch(ClassNotFoundException | SQLException e){
                System.out.println(e.getMessage());
                e.getStackTrace();
        }
    }
    private void showElectedNomineesInformation(){
        System.out.println("winner :"+getElectedNomineeID());
        
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = ConnectionDB.getConnection();

            sql = "SELECT *FROM CandTable";
            statement = conn.prepareStatement(sql);
            rs = statement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
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
            addResultToTable(); //add it to the last
            }catch(ClassNotFoundException | SQLException e){
                System.out.println(e.getMessage());
            }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblPhotoArea = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNameArea = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(79, 178, 204));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELL COME TO ONLINE VOTING SYSTEM. HERE YOU CAN SEE THE RESULT OF THE ELECTION");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ELECTED PERSON");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/onlinevotingsystem/icons/left-arrow.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblPhotoArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204)));
        lblPhotoArea.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Name :");
        jLabel4.setOpaque(true);

        lblNameArea.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNameArea.setForeground(new java.awt.Color(0, 153, 0));
        lblNameArea.setOpaque(true);

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 0, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NomineeID", "Name", "Age", "Gender", "Address", "Symbol", "Picture", "Total Votes"
            }
        ));
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblPhotoArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPhotoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        new AdminHome().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNameArea;
    private javax.swing.JLabel lblPhotoArea;
    // End of variables declaration//GEN-END:variables
}
