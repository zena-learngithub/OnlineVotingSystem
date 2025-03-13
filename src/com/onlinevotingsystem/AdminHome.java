
package com.onlinevotingsystem;
import javax.swing.*;
/**
 *
 * @author Zenawi Zemene
 */
public class AdminHome extends javax.swing.JFrame {

    public AdminHome() {
        super("Dashboard");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNominee = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblVoters = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        btnNominee = new javax.swing.JButton();
        btnVoters = new javax.swing.JButton();
        btnResult = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnElection = new javax.swing.JButton();
        lblElectioDate = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(79, 178, 204));

        lblNominee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/onlinevotingsystem/icons/mayor.png"))); // NOI18N
        lblNominee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNomineeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Online voting system");

        lblVoters.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/onlinevotingsystem/icons/voters.png"))); // NOI18N
        lblVoters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVotersMouseClicked(evt);
            }
        });

        lblResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/onlinevotingsystem/icons/results.png"))); // NOI18N
        lblResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblResultMouseClicked(evt);
            }
        });

        btnNominee.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnNominee.setForeground(new java.awt.Color(79, 178, 204));
        btnNominee.setText("Nominee");
        btnNominee.setBorderPainted(false);
        btnNominee.setOpaque(true);
        btnNominee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNomineeActionPerformed(evt);
            }
        });

        btnVoters.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnVoters.setForeground(new java.awt.Color(79, 178, 204));
        btnVoters.setText("Voters");
        btnVoters.setBorderPainted(false);
        btnVoters.setOpaque(true);
        btnVoters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotersActionPerformed(evt);
            }
        });

        btnResult.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnResult.setForeground(new java.awt.Color(79, 178, 204));
        btnResult.setText("Result");
        btnResult.setBorderPainted(false);
        btnResult.setOpaque(true);
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 0, 0));
        btnLogout.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnElection.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnElection.setForeground(new java.awt.Color(79, 178, 204));
        btnElection.setText("Election");
        btnElection.setBorderPainted(false);
        btnElection.setOpaque(true);
        btnElection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElectionActionPerformed(evt);
            }
        });

        lblElectioDate.setBackground(new java.awt.Color(255, 255, 255));
        lblElectioDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/onlinevotingsystem/icons/election-day.png"))); // NOI18N
        lblElectioDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblElectioDateMouseClicked(evt);
            }
        });

        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/onlinevotingsystem/icons/lock.png"))); // NOI18N
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblNominee, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNominee, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnVoters, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lblVoters, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnElection)
                                .addGap(18, 18, 18)
                                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lblElectioDate, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 26, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnElection, btnResult});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNominee, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(lblVoters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblElectioDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNominee)
                    .addComponent(btnVoters)
                    .addComponent(btnResult)
                    .addComponent(btnElection)
                    .addComponent(btnLogout))
                .addGap(52, 52, 52))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnElection, btnLogout, btnNominee, btnResult, btnVoters});

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int adminChoice = JOptionPane.showConfirmDialog(AdminHome.this, "Are you sure you want to logout", "Confirm Message",
                JOptionPane.YES_NO_OPTION);
        if (adminChoice == JOptionPane.YES_OPTION) {
            dispose();
            new SignForm().setVisible(true);
        } else {
            //stays there on the current page
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnElectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElectionActionPerformed
        dispose();
        new ManageElection().setVisible(true);
    }//GEN-LAST:event_btnElectionActionPerformed

    private void btnVotersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotersActionPerformed

        dispose();
        new Voters().setVisible(true);
    }//GEN-LAST:event_btnVotersActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        dispose();
        ElectionResult result = new ElectionResult();
        result.setVisible(true);
    }//GEN-LAST:event_btnResultActionPerformed

    private void btnNomineeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNomineeActionPerformed
        dispose();
        ManageCandidates mc = new ManageCandidates();
        mc.setVisible(true);
    }//GEN-LAST:event_btnNomineeActionPerformed

    private void lblNomineeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNomineeMouseClicked
        dispose();
        ManageCandidates mc = new ManageCandidates();
        mc.setVisible(true);
        
    }//GEN-LAST:event_lblNomineeMouseClicked

    private void lblVotersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVotersMouseClicked
        dispose();
        new Voters().setVisible(true);
    }//GEN-LAST:event_lblVotersMouseClicked

    private void lblResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResultMouseClicked
        dispose();
        ElectionResult result = new ElectionResult();
        result.setVisible(true);
    }//GEN-LAST:event_lblResultMouseClicked

    private void lblElectioDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblElectioDateMouseClicked
        dispose();
        new ManageElection().setVisible(true);
    }//GEN-LAST:event_lblElectioDateMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        int adminChoice = JOptionPane.showConfirmDialog(AdminHome.this, "Are you sure you want to log ou", "Confirm Message",
                JOptionPane.YES_NO_OPTION);
        if (adminChoice == JOptionPane.YES_OPTION) {
            dispose();
            new SignForm().setVisible(true);
        } else {
            //stays there on the current page
        }
    }//GEN-LAST:event_lblLogoutMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AdminHome().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElection;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNominee;
    private javax.swing.JButton btnResult;
    private javax.swing.JButton btnVoters;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblElectioDate;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblNominee;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblVoters;
    // End of variables declaration//GEN-END:variables
}
