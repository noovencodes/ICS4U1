/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nchooser;


/**
 *
 * @author Van
 */
public class NChooseRFrame extends javax.swing.JFrame {

    /**
     * Creates new form NChooseRFrame
     */
    public NChooseRFrame() {
        initComponents();
    }

    // recursive method
    public static long choose(long total, long choose){
        
        // Identify the base
        if(total < choose)
            return 0;
        if(choose == 0 || choose == total)
            return 1;
        // recursion 
        return choose(total-1,choose-1)+choose(total-1,choose);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblInfoLine1 = new javax.swing.JLabel();
        lblInfoLine2 = new javax.swing.JLabel();
        lblEnterNumToChoose = new javax.swing.JLabel();
        lblEnterNumToChooseFrom = new javax.swing.JLabel();
        txtUserNumToChoose = new javax.swing.JTextField();
        txtUserNumToChooseFrom = new javax.swing.JTextField();
        btnNumOfWays = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutputNumOfWays = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("n Choose r");

        lblInfoLine1.setText("This program calculates the number of ways r different objects can be");

        lblInfoLine2.setText("chosen from set of n objects.");

        lblEnterNumToChoose.setText("Enter the number of objects to choose:");

        lblEnterNumToChooseFrom.setText("Enter the number of objects there are to choose from:");

        btnNumOfWays.setText("Calculate the Number of Ways");
        btnNumOfWays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumOfWaysActionPerformed(evt);
            }
        });

        txtOutputNumOfWays.setColumns(20);
        txtOutputNumOfWays.setRows(5);
        jScrollPane1.setViewportView(txtOutputNumOfWays);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInfoLine1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEnterNumToChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEnterNumToChooseFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUserNumToChoose, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(txtUserNumToChooseFrom))))
                        .addGap(48, 48, 48))))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(lblInfoLine2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnNumOfWays))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(lblTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInfoLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfoLine2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterNumToChoose)
                    .addComponent(txtUserNumToChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterNumToChooseFrom)
                    .addComponent(txtUserNumToChooseFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnNumOfWays)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNumOfWaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumOfWaysActionPerformed

        long n =  Long.parseLong(txtUserNumToChooseFrom.getText());
        long r =  Long.parseLong(txtUserNumToChoose.getText());
        String result;
        // calls recursive method and stores result in the created variable
        result = String.valueOf(choose(n, r));
        // outputs number of ways
        txtOutputNumOfWays.setText("There are " + result + " ways.");
           
    }//GEN-LAST:event_btnNumOfWaysActionPerformed

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
            java.util.logging.Logger.getLogger(NChooseRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NChooseRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NChooseRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NChooseRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NChooseRFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNumOfWays;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterNumToChoose;
    private javax.swing.JLabel lblEnterNumToChooseFrom;
    private javax.swing.JLabel lblInfoLine1;
    private javax.swing.JLabel lblInfoLine2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtOutputNumOfWays;
    private javax.swing.JTextField txtUserNumToChoose;
    private javax.swing.JTextField txtUserNumToChooseFrom;
    // End of variables declaration//GEN-END:variables
}
