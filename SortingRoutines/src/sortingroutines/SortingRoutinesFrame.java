/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sortingroutines;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

/**
 *
 * @author Van
 */
public class SortingRoutinesFrame extends javax.swing.JFrame {

    /**
     * Creates new form SortingRoutinesFrame
     */
    public SortingRoutinesFrame() {
        initComponents();
    }

    public int binarySearch(Integer[] a, int key) {
        int start = 0;
        int end = a.length -1;
        int searchedValue = key;

        for (int i = 0; i <= a.length; i++) {
            int mid = (start + end) / 2;

            if (searchedValue == a[mid]) {
                return mid;
            }

            if (searchedValue > a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    
    
        public static void bubblesort(Integer[] arr, String dir) {
               for(int i=0; i<(arr.length-1); i++)
               {
                    for(int j=0; j<(arr.length-i-1); j++)
                    {
                    if (dir.equals("Ascending")) {
                        if(arr[j]>arr[j+1])
                       {
                          int temp = arr[j];
                          arr[j] = arr[j+1];
                          arr[j+1] = temp;
                       }}
                    else {
                       if(arr[j]<arr[j+1])
                       {
                          int temp = arr[j];
                          arr[j] = arr[j+1];
                          arr[j+1] = temp;
                       }
                    }
                 }
                }
        }
        
        
        public static void quickSort(Integer[] arr, int low, int high, String dir) 
            {
              //check for empty or null array
              if (arr == null || arr.length == 0){
                return;
              }

              if (low >= high){
                return;
              }

              //Get the pivot element from the middle of the list
              int middle = low + (high - low) / 2;
              int pivot = arr[middle];

              // make left < pivot and right > pivot
              int i = low, j = high;
              while (i <= j) 
              {
                //Check until all values on left side array are lower than pivot
                if (dir.equals("Ascending")) {  
                    while (arr[i] < pivot) 
                    {
                      i++;
                    }
                }
                else {
                    while (arr[i] > pivot) 
                    {
                      i++;
                    }    
                }
                //Check until all values on left side array are greater than pivot
                if (dir.equals("Ascending")) {  
                    while (arr[j] > pivot) 
                    {
                      j--;
                    }
                }
                else
                {
                    while (arr[j] < pivot) 
                    {
                      j--;
                    }    
                }
                //Now compare values from both side of lists to see if they need swapping 
                //After swapping move the iterator on both lists
                if (dir.equals("Ascending")) {  
                    if (i <= j) 
                    {
                      swap (arr, i, j);
                      i++;
                      j--;
                    }
                }
                else
                {
                    if (i <= j) 
                    {
                      swap (arr, i, j);
                      i++;
                      j--;
                    }
                }
              }
              //Do same operation as above recursively to sort two sub arrays
              if (low < j){
                quickSort(arr, low, j, dir);
              }
              if (high > i){
                quickSort(arr, i, high, dir);
              }
          }
   
        public static void swap (Integer array[], int x, int y)
        {
          int temp = array[x];
          array[x] = array[y];
          array[y] = temp;
        }
        
        public static void insertionSort(Integer[] arr, String dir) { 
            for (int j = 1; j < arr.length; j++) { 
                int key = arr[j]; 
                int i = j-1;
                if (dir.equals("Ascending")) {
                while ( (i > -1) && ( arr[i] > key ) ) { 
                    arr[i+1] = arr[i]; 
                    i--; 
                }}
                else {
                while ( (i > -1) && ( arr[i] < key ) ) { 
                    arr[i+1] = arr[i]; 
                    i--; 
                }    
                }
                arr[i+1] = key;
            }
        }
        
        
        public static void selsort(Integer[] arr, String dir)
        {
            int n = arr.length; //length of the array
            for (int i = 0; i < n - 1; i++) {
                int MIN = i; //set the first position as minimum
                //System.out.println("Sorting based on Number " + (i + 1));
    //Find the smallest element by comparing with the element in MIN position
                for (int j = i + 1; j < n; j++) {
                    //System.out.println("Comparing " + arr[MIN] + " and " + arr[j]);
                    if (dir.equals("Ascending")) {
                    if (arr[j] < arr[MIN]) {
                        //System.out.println(arr[MIN] + " is greater than " + arr[j]);
                        MIN = j;
                        }
                    }
                    else {
                    if (arr[j] > arr[MIN]) {
                        //System.out.println(arr[MIN] + " is greater than " + arr[j]);
                        MIN = j;
                        }
                    }
                }
    //Swap the smallest element with element in MIN position
                int temp = arr[i];
                arr[i] = arr[MIN];
                arr[MIN] = temp;
            }
        }
        
        
        
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }   
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SortingButtons = new javax.swing.ButtonGroup();
        SortOrderButtons = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        lblSortingRoutinesInfo = new javax.swing.JLabel();
        lblSortingAlgorithm = new javax.swing.JLabel();
        btnSelection = new javax.swing.JRadioButton();
        btnBubble = new javax.swing.JRadioButton();
        btnInsertion = new javax.swing.JRadioButton();
        btnQuick = new javax.swing.JRadioButton();
        lblSortOrder = new javax.swing.JLabel();
        btnAscending = new javax.swing.JRadioButton();
        btnDescending = new javax.swing.JRadioButton();
        lblEnterAmountOfNums = new javax.swing.JLabel();
        txtUserAmountofNums = new javax.swing.JTextField();
        btnSortNums = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutputOriginalNums = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOutputSortedNums = new javax.swing.JTextArea();
        lblOriginalNums = new javax.swing.JLabel();
        lblSortedNums = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblTitle.setText("Sorting Routines");

        lblSortingRoutinesInfo.setText("Enter the following information:");

        lblSortingAlgorithm.setText("Sorting Algorithm");

        SortingButtons.add(btnSelection);
        btnSelection.setSelected(true);
        btnSelection.setText("Selection");

        SortingButtons.add(btnBubble);
        btnBubble.setText("Bubble");

        SortingButtons.add(btnInsertion);
        btnInsertion.setText("Insertion");

        SortingButtons.add(btnQuick);
        btnQuick.setText("Quick");

        lblSortOrder.setText("Sort Order");

        SortOrderButtons.add(btnAscending);
        btnAscending.setSelected(true);
        btnAscending.setText("Ascending");

        SortOrderButtons.add(btnDescending);
        btnDescending.setText("Descending");

        lblEnterAmountOfNums.setText("Amount of Numbers to Sort:");

        btnSortNums.setText("Sort Numbers");
        btnSortNums.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortNumsActionPerformed(evt);
            }
        });

        txtOutputOriginalNums.setColumns(20);
        txtOutputOriginalNums.setRows(5);
        jScrollPane1.setViewportView(txtOutputOriginalNums);

        txtOutputSortedNums.setColumns(20);
        txtOutputSortedNums.setRows(5);
        jScrollPane2.setViewportView(txtOutputSortedNums);

        lblOriginalNums.setText("Original Numbers");

        lblSortedNums.setText("Sorted Numbers");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblEnterAmountOfNums)
                                .addGap(18, 18, 18)
                                .addComponent(txtUserAmountofNums, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSortingRoutinesInfo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSortingAlgorithm)
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInsertion)
                                    .addComponent(btnQuick)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnSelection)
                                                .addGap(47, 47, 47)
                                                .addComponent(lblSortOrder))
                                            .addComponent(btnBubble))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnDescending)
                                            .addComponent(btnAscending)
                                            .addComponent(btnSortNums)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOriginalNums)
                                .addGap(196, 196, 196)
                                .addComponent(lblSortedNums)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblSortingRoutinesInfo)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSortingAlgorithm)
                    .addComponent(btnSelection)
                    .addComponent(lblSortOrder)
                    .addComponent(btnAscending))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBubble)
                    .addComponent(btnDescending))
                .addGap(27, 27, 27)
                .addComponent(btnInsertion)
                .addGap(26, 26, 26)
                .addComponent(btnQuick)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterAmountOfNums)
                    .addComponent(txtUserAmountofNums, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSortNums))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOriginalNums)
                    .addComponent(lblSortedNums))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortNumsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortNumsActionPerformed

        List<Integer> listToSortList = new ArrayList<>();
        Integer[] listToSortArr = new Integer[Integer.parseInt(txtUserAmountofNums.getText())];
        Arrays.fill(listToSortArr, 1001); // Fill with number out of range to avoid false search match
        int i=0, ListIndexCount = 0;
        Random rand = new Random(); 
        String sortMethod = "";
        String sortDirection = "";
        sortMethod = getSelectedButtonText(SortingButtons);
        sortDirection = getSelectedButtonText(SortOrderButtons);
        
        // Creates unique list on random numbers
        while (ListIndexCount < Integer.parseInt(txtUserAmountofNums.getText())) {
            
            //for(i=0;i<listToSortArr.length;i++){
                int pickNumber = rand.nextInt(-1000, 1000);
                if (
                        //(listToSortArr[i] == null) && 
                        (binarySearch(listToSortArr, pickNumber) == -1)){ 
                    listToSortArr[ListIndexCount]=pickNumber;
                    System.out.println(pickNumber);
                    ListIndexCount++;
                }
        }
              
        System.out.println(sortMethod);
        System.out.println(sortDirection);
        txtOutputOriginalNums.setText(Arrays.toString(listToSortArr));
        // Selection, Bubble, Insertion or Quick with Ascending or Descending 
        switch(sortMethod) {
        case "Selection" -> {
             selsort(listToSortArr, sortDirection);//calling the selection sort method
             break;
            }
        case "Bubble" -> {
            bubblesort(listToSortArr, sortDirection);
            break;
        }
        case "Insertion" -> {
            insertionSort(listToSortArr, sortDirection);
            break;
        }
        case "Quick" -> {
            quickSort(listToSortArr, 0, listToSortArr.length-1, sortDirection);
            break;
        }
        default -> {
            selsort(listToSortArr, sortDirection);//calling the selection ascending as default method
            }
        }
        txtOutputSortedNums.setText(Arrays.toString(listToSortArr));
        System.out.println("Elements in the array before Sorting: "+ Arrays.toString(listToSortArr));
        System.out.println("Elements in the array after Sorting: "+Arrays.toString(listToSortArr));
    

        
        
        
        
        


        // TODO add your handling code here:
    }//GEN-LAST:event_btnSortNumsActionPerformed

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
            java.util.logging.Logger.getLogger(SortingRoutinesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingRoutinesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingRoutinesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingRoutinesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortingRoutinesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup SortOrderButtons;
    private javax.swing.ButtonGroup SortingButtons;
    private javax.swing.JRadioButton btnAscending;
    private javax.swing.JRadioButton btnBubble;
    private javax.swing.JRadioButton btnDescending;
    private javax.swing.JRadioButton btnInsertion;
    private javax.swing.JRadioButton btnQuick;
    private javax.swing.JRadioButton btnSelection;
    private javax.swing.JButton btnSortNums;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEnterAmountOfNums;
    private javax.swing.JLabel lblOriginalNums;
    private javax.swing.JLabel lblSortOrder;
    private javax.swing.JLabel lblSortedNums;
    private javax.swing.JLabel lblSortingAlgorithm;
    private javax.swing.JLabel lblSortingRoutinesInfo;
    private javax.swing.JLabel lblTitle;
    javax.swing.JTextArea txtOutputOriginalNums;
    private javax.swing.JTextArea txtOutputSortedNums;
    private javax.swing.JTextField txtUserAmountofNums;
    // End of variables declaration//GEN-END:variables
}
