/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fibonaccinums;

/**
 *
 * @author Van
 */
public class FibonacciNumsFrame extends javax.swing.JFrame {

    /**
     * Creates new form FibonacciNumsFrame
     */
    public FibonacciNumsFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    public class FibonacciCalc{
                // recursive method
        	public static long fibonacciRecursion(long n){
        	if(n == 0){
                	return 0;
                }
                if(n == 1 || n == 2){
                        	return 1;
                        }
                return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
                }
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblFiboInfo = new javax.swing.JLabel();
        lblEnterFiboTerm = new javax.swing.JLabel();
        txtUserFiboTerm = new javax.swing.JTextField();
        btnFindFiboNum = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutputFiboNum = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(240, 0, 0));
        lblTitle.setText("Fibonacci Numbers");

        lblFiboInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFiboInfo.setText("The first nine fibonacci numbers are listed as follows: 1, 1, 2, 3, 5, 8, 13, 21, 34");

        lblEnterFiboTerm.setText("Enter the fibonacci term that you would like to see:");

        btnFindFiboNum.setText("Find the Fibonacci Number");
        btnFindFiboNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindFiboNumActionPerformed(evt);
            }
        });

        txtOutputFiboNum.setColumns(20);
        txtOutputFiboNum.setRows(5);
        jScrollPane1.setViewportView(txtOutputFiboNum);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnFindFiboNum, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblEnterFiboTerm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(27, 27, 27)
                                .addComponent(txtUserFiboTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFiboInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addGap(27, 27, 27)
                .addComponent(lblFiboInfo)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterFiboTerm)
                    .addComponent(txtUserFiboTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnFindFiboNum)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindFiboNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindFiboNumActionPerformed

   	// created a variable to store the term the user inputed
        int term = Integer.parseInt(txtUserFiboTerm.getText());
        // output statement stored in a variable
        String fiboNumber = "Fibonacci number for term " + term + " is: ";
        String result = "Fibonacci Series of "+term+" term numbers are: ";
        // stores fibonacci term result
        String numbers = "";
	for(int i = 1; i < term+1; i++){
                        if (i == term) {
                            numbers = numbers + String.valueOf((FibonacciCalc.fibonacciRecursion(i)) + ".");
                        }
                        // creates the fibonacci series
                        else
                        {
                            numbers = numbers + String.valueOf((FibonacciCalc.fibonacciRecursion(i)) + ", ");
                        }
                        // determines last value in the list (aka the fibonacci term)
                        if (i == term) {
                        fiboNumber = fiboNumber + String.valueOf((FibonacciCalc.fibonacciRecursion(i)));
                        }
	}
        // outputs the fibonacci term and series
        txtOutputFiboNum.setText(fiboNumber + "\n" + result + numbers);
    }//GEN-LAST:event_btnFindFiboNumActionPerformed

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
            java.util.logging.Logger.getLogger(FibonacciNumsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FibonacciNumsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FibonacciNumsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FibonacciNumsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FibonacciNumsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFindFiboNum;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterFiboTerm;
    private javax.swing.JLabel lblFiboInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtOutputFiboNum;
    private javax.swing.JTextField txtUserFiboTerm;
    // End of variables declaration//GEN-END:variables
}
