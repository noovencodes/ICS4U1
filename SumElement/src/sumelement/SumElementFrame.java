/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sumelement;
import java.util.*;
/**
 *
 * @author Van
 */
public class SumElementFrame extends javax.swing.JFrame {

    /**
     * Creates new form SumElementFrame
     */
    public SumElementFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEnterInt = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnSumAll = new javax.swing.JButton();
        btnSumEven = new javax.swing.JButton();
        lblEnterInt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArrayDisplay = new javax.swing.JTextArea();
        txtArrayEntries = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnSumOdd = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnList.setText("List");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        btnSumAll.setText("Sum All");
        btnSumAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumAllActionPerformed(evt);
            }
        });

        btnSumEven.setText("Sum Even");
        btnSumEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumEvenActionPerformed(evt);
            }
        });

        lblEnterInt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEnterInt.setText("Enter an Integer:");

        txtArrayDisplay.setColumns(20);
        txtArrayDisplay.setRows(5);
        jScrollPane1.setViewportView(txtArrayDisplay);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(240, 0, 0));
        lblTitle.setText("Integer Sums");

        btnSumOdd.setText("Sum Odd");
        btnSumOdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumOddActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtArrayEntries, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 28, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnExit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEnterInt)
                                        .addGap(36, 36, 36)
                                        .addComponent(txtEnterInt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAdd)
                                        .addGap(79, 79, 79)
                                        .addComponent(btnRemove)))
                                .addGap(54, 54, 54)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSumAll)
                                    .addComponent(btnSumEven)
                                    .addComponent(btnSumOdd))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnList)
                                .addGap(143, 143, 143))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblTitle)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnterInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove)
                    .addComponent(lblEnterInt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnList)
                        .addGap(31, 31, 31)
                        .addComponent(btnSumAll)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnExit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnSumEven)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSumOdd)
                        .addGap(32, 32, 32)))
                .addComponent(txtArrayEntries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // function used to check if the base and exponent inputs are valid integers
    private void VerifyIfInt(){
       String UserInt; 
    
       UserInt = txtEnterInt.getText();
      
        try {
            int IntCheck = Integer.parseInt(UserInt);
        }
        catch(NumberFormatException ex) {
            txtArrayEntries.setText(UserInt +" isn't a valid number. Try again!");
        }
    }
    
    // creates an array of the numbers the user inputs
    ArrayList<Integer> UserIntList = new ArrayList<Integer>();
   
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        // calling integer verification function
        VerifyIfInt();
        
        // creating variable to store user input
        int UserInt;
        
        // storing what user entered in the text field, in the variable created
        UserInt = Integer.parseInt(txtEnterInt.getText());
        
        // adds the number the user inputed into the array
        UserIntList.add(UserInt);
        
        // a message is outputed notifying the user that the number has been successfully added to their list
        txtArrayEntries.setText(UserInt + " has been added to your list!");
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
       VerifyIfInt();
       
       // creating variable to store the size/length of the user's list
       int count = UserIntList.size();
       
       // creating iterator object
       Iterator temp = UserIntList.iterator();
       
       // holds true till there is single element remaining in the object
        while (temp.hasNext()) {
  
            // remove elements that match criteria
            int x = (Integer)temp.next();
            if (x == Integer.parseInt(txtEnterInt.getText())){
                temp.remove();
            }
        }
       // a loop statement that checks if the inputed number exists within the list. if it does, it is removed.
       for (int i = 0; i<= count; i++){
            if (UserIntList.get(i) == Integer.parseInt(txtEnterInt.getText())){
                UserIntList.remove(i); 
                count--;
                // a message is outputed notifying the user that the number has been successfully removed from their list
                txtArrayEntries.setText(txtEnterInt.getText() + " has been removed from your list!");
        }
            else {
                // a message is outputed notifying the user that the number they inputed does not exist within their list
                txtArrayEntries.setText(txtEnterInt.getText() +" doesn't exist within your list. Try again!");
            }
       }
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        
        VerifyIfInt();
        int UserInt;
        String ListOutput = "";
        
        // loop that prints out each value within the list
        Iterator stepper = UserIntList.iterator();
        while (stepper.hasNext()) {
            UserInt = (Integer)stepper.next();
            ListOutput = ListOutput + UserInt + "\n";
        }
        txtArrayDisplay.setText(ListOutput);
        
    }//GEN-LAST:event_btnListActionPerformed

    private void btnSumAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumAllActionPerformed
       
        VerifyIfInt();
        
        // sums all of the value within the list together
        int sum = UserIntList.stream().mapToInt(Integer::intValue).sum();
        
        txtArrayEntries.setText("The total of the enteries is: " + String.valueOf(sum));
        
    }//GEN-LAST:event_btnSumAllActionPerformed

    private void btnSumEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumEvenActionPerformed
      
       VerifyIfInt();
       int count = UserIntList.size();
       int even_sum = 0;
        
      // a loop statement that checks if each value within the list is an even number. if it is, they are summed together.
       for (int i = 0; i<= count; i++){
            if (UserIntList.get(i) % 2 == 0){
            even_sum = even_sum + UserIntList.get(i);
        }
        txtArrayEntries.setText("The total of the enteries is: " + String.valueOf(even_sum));
       }
       
    }//GEN-LAST:event_btnSumEvenActionPerformed

    private void btnSumOddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumOddActionPerformed
        
       VerifyIfInt();
       int count = UserIntList.size();
       int odd_sum = 0;
        
       // a loop statement that checks if each value within the list is an odd number. if it is, they are summed together.
       for (int i = 0; i<= count; i++){
            if (UserIntList.get(i) % 2 > 0){
            odd_sum = odd_sum + UserIntList.get(i);
        }
        txtArrayEntries.setText("The total of the enteries is: " + String.valueOf(odd_sum));
       } 
       
    }//GEN-LAST:event_btnSumOddActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        // exits program upon clicking the exit button
        System.exit(0);
        
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(SumElementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SumElementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SumElementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SumElementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SumElementFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSumAll;
    private javax.swing.JButton btnSumEven;
    private javax.swing.JButton btnSumOdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterInt;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtArrayDisplay;
    private javax.swing.JTextField txtArrayEntries;
    private javax.swing.JTextField txtEnterInt;
    // End of variables declaration//GEN-END:variables
}
