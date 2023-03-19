/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalproject;

/**
 *
 * @author johnn
 */
public class RoundOptions extends javax.swing.JFrame {

    /**
     * Creates new form RoundOptions
     */
    public RoundOptions() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); // set location of gui location to the center of the screen
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
        btn1Round = new javax.swing.JButton();
        btn3Rounds = new javax.swing.JButton();
        btn5Rounds = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("How many rounds do you want to play?");

        btn1Round.setText("1 Round");
        btn1Round.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1RoundActionPerformed(evt);
            }
        });

        btn3Rounds.setText("3 Rounds");
        btn3Rounds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3RoundsActionPerformed(evt);
            }
        });

        btn5Rounds.setText("5 Rounds");
        btn5Rounds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5RoundsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btn1Round, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btn3Rounds, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btn5Rounds, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(btn1Round)
                .addGap(18, 18, 18)
                .addComponent(btn3Rounds)
                .addGap(18, 18, 18)
                .addComponent(btn5Rounds)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1RoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1RoundActionPerformed
        dispose();
        new Challenger(1).setVisible(true);
    }//GEN-LAST:event_btn1RoundActionPerformed

    private void btn3RoundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3RoundsActionPerformed
        dispose();
        new Challenger(3).setVisible(true);
    }//GEN-LAST:event_btn3RoundsActionPerformed

    private void btn5RoundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5RoundsActionPerformed
        dispose();
        new Challenger(5).setVisible(true);
    }//GEN-LAST:event_btn5RoundsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1Round;
    private javax.swing.JButton btn3Rounds;
    private javax.swing.JButton btn5Rounds;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
