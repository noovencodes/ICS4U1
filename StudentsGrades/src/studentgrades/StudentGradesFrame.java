/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentgrades;

import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Van
 */
public class StudentGradesFrame extends javax.swing.JFrame {

    // array to store all student data (the commented-out strings are test students); essentially the database
    String[] StudentsInfoList = new String[]{
        //"Vanessa, Coelho, 8.6, 6.7, 10.0, 9.6",
        //"John, Connor, 4.6, 6.7, 7.8, 8.6",
        //"Lisa, Kiol, 3.6, 8.7, 5.0, 7.6"
    };
    
    //String[] StudentInfo = new String[]{};

    public StudentGradesFrame() {
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

        lblTitle = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblTest1 = new javax.swing.JLabel();
        lblTest2 = new javax.swing.JLabel();
        lblTest3 = new javax.swing.JLabel();
        lblTest4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnStudentAverage = new javax.swing.JButton();
        btnCourseAverage = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtEnterFirstName = new javax.swing.JTextField();
        txtEnterLastName = new javax.swing.JTextField();
        txtEnterTest1 = new javax.swing.JTextField();
        txtEnterTest2 = new javax.swing.JTextField();
        txtEnterTest3 = new javax.swing.JTextField();
        txtEnterTest4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutputStudentInfo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOutputAverage = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 50, 250));
        lblTitle.setText("Student Grades");

        lblFirstName.setText("First Name:");

        lblLastName.setText("Last Name:");

        lblTest1.setText("Test 1:");

        lblTest2.setText("Test 2:");

        lblTest3.setText("Test 3:");

        lblTest4.setText("Test 4:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnList.setText("List");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        btnStudentAverage.setText("Student Average");
        btnStudentAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentAverageActionPerformed(evt);
            }
        });

        btnCourseAverage.setText("Course Averages");
        btnCourseAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseAverageActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtOutputStudentInfo.setColumns(20);
        txtOutputStudentInfo.setRows(5);
        jScrollPane1.setViewportView(txtOutputStudentInfo);

        txtOutputAverage.setColumns(20);
        txtOutputAverage.setRows(5);
        jScrollPane2.setViewportView(txtOutputAverage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFirstName)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTest1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTest2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTest3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTest4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtEnterFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addComponent(lblLastName)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCourseAverage)
                                    .addComponent(btnStudentAverage)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEnterLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEnterTest1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(txtEnterTest2)
                            .addComponent(txtEnterTest3)
                            .addComponent(txtEnterTest4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnList)
                                    .addComponent(btnAdd))
                                .addGap(296, 296, 296))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnExit)
                                .addGap(220, 220, 220))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(lblTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(lblLastName)
                            .addComponent(txtEnterFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEnterLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(lblTest1)
                        .addGap(3, 3, 3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd)
                        .addComponent(btnStudentAverage)
                        .addComponent(txtEnterTest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTest2)
                            .addComponent(txtEnterTest2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEnterTest3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTest3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnList)
                            .addComponent(btnCourseAverage))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTest4)
                    .addComponent(btnExit)
                    .addComponent(txtEnterTest4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        // Add fields to a list and add that list to the student db (database)/array
        String NewStudent;
        // checks to see if the name text fields are valid names (strings) and if the test text fields are valid scores (ints/doubles). also checks to see if the student already exists in the list
        if (ValidateEntry() || CheckIfStudentExists()){
            txtOutputAverage.setText("");
            return;
        }
        
        // adds a new inputed student into the student database/existing list and outputs the list automatically
        ArrayList<String> tempStudentsInfoList = new ArrayList<String>(Arrays.asList(StudentsInfoList));  
        NewStudent = txtEnterFirstName.getText() + ", " + txtEnterLastName.getText() + ", " + txtEnterTest1.getText() + ", " + txtEnterTest2.getText() + ", " + txtEnterTest3.getText() + ", " + txtEnterTest4.getText();
        tempStudentsInfoList.add(NewStudent);
        StudentsInfoList = tempStudentsInfoList.toArray(StudentsInfoList);  
        ClearFields();
        DisplayStudentList(StudentsInfoList);
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        // exits program        
        System.exit(0);
        
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed

        // clears all fields and outputs the existing list of students
        ClearFields();
        DisplayStudentList(StudentsInfoList);
        
    }//GEN-LAST:event_btnListActionPerformed

    private void btnCourseAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseAverageActionPerformed

        // variables to store and initialize all averages
        double FirstTestAvg, SecondTestAvg, ThirdTestAvg, FourthTestAvg = ThirdTestAvg = SecondTestAvg = FirstTestAvg = 0;
        double AllCourseAvg = 0;
        
        // loops through the db, adds together each item that is listed as the 2nd-5th item in their respective lists (since lists start at 0), and stores them in the created variables
        for (String students : StudentsInfoList) {
            String[] student = students.split(",");
            FirstTestAvg = FirstTestAvg + Double.parseDouble(student[2]);
            SecondTestAvg = SecondTestAvg + Double.parseDouble(student[3]);
            ThirdTestAvg = ThirdTestAvg + Double.parseDouble(student[4]);
            FourthTestAvg += Double.parseDouble(student[5]);
        }
        
        // calculates the average of each test score by dividing it by the added test scores by the amount of strings within the db
        FirstTestAvg = FirstTestAvg / StudentsInfoList.length;
        SecondTestAvg = SecondTestAvg / StudentsInfoList.length;
        ThirdTestAvg = ThirdTestAvg / StudentsInfoList.length;
        FourthTestAvg = FourthTestAvg / StudentsInfoList.length;
        
        // adds all of the test scores together and divides it by 4 (number of courses/test)
        AllCourseAvg = FirstTestAvg + SecondTestAvg + ThirdTestAvg + FourthTestAvg;
        AllCourseAvg = AllCourseAvg / 4;
        
        // outputs course averages and rounds each one to the tenth decimal
        DecimalFormat df = new DecimalFormat("###.##");
        txtOutputAverage.setText(String.valueOf("The average of course 1 is " + df.format(FirstTestAvg)) + ", course 2 is " + String.valueOf(df.format(SecondTestAvg)) + ", course 3 is " + String.valueOf(df.format(ThirdTestAvg)) + ", course 4 is " + String.valueOf(df.format(FourthTestAvg)) + ", and the overall average is " + String.valueOf(df.format(AllCourseAvg)));

        ClearFields();
        DisplayStudentList(StudentsInfoList);
        
    }//GEN-LAST:event_btnCourseAverageActionPerformed

    private void btnStudentAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentAverageActionPerformed
     
        // intialized variables to store data
        double StudentAvg = 0;
        String StudentTxt = "";
        
        // loops through db and seperates all items within each individual string
        for (String students : StudentsInfoList) {
            String[] student = students.split(",");
            // checks to see if student name entered exists within the db, finds it within the db, and then calculates the average by adding all 4 courses together and diving by 4
             if (student[0].toLowerCase().trim().equals(txtEnterFirstName.getText().toLowerCase().trim()) && student[1].toLowerCase().trim().equals(txtEnterLastName.getText().toLowerCase().trim())) {
                   StudentAvg = Double.parseDouble(student[2]) + Double.parseDouble(student[3]) + Double.parseDouble(student[4]) + Double.parseDouble(student[5]);
                   StudentAvg = StudentAvg / 4;
                   
                   DecimalFormat df = new DecimalFormat("###.##");
                   // outputs student average and rounds it to the tenth decimal
                   txtOutputAverage.setText(String.valueOf(student[0] + " " + student[1] + "'s overall average is " + df.format(StudentAvg))); 
                   
                   // outputs the inputed student's information ONLY
                    for (int i = 0; i < student.length; i++) {
                        StudentTxt = StudentTxt + student[i] + " ";
                    } 
                    txtOutputStudentInfo.setText(StudentTxt);
                    break;
                }
                
                // if the inputed student name does not exist within the db, an error message is outputed
                else {
                   txtOutputAverage.setText("");
                   txtOutputStudentInfo.setText("This student doesn't exist. Try again!"); 
                }
        }  
    }//GEN-LAST:event_btnStudentAverageActionPerformed

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
            java.util.logging.Logger.getLogger(StudentGradesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGradesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGradesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGradesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGradesFrame().setVisible(true);
            }
        });
    }

    // function to clear all fields
    public void ClearFields() {
        txtEnterFirstName.setText("");
        txtEnterLastName.setText("");
        txtEnterTest1.setText("");
        txtEnterTest2.setText("");
        txtEnterTest3.setText("");
        txtEnterTest4.setText("");
        txtOutputStudentInfo.setText("");
    }

    // function to print out the entire student db
    public void DisplayStudentList(String[] StudentList) {
        String StudentTxt = "";
        for (String students : StudentsInfoList) {
            String[] student = students.split(",");
            //List<String> studentLine = new ArrayList<String>(student.length)
            for (int i = 0; i < student.length; i++) {
                System.out.print(student[i]);
                StudentTxt = StudentTxt + student[i] + " ";
            }
            StudentTxt = StudentTxt + "\n";

        }
        txtOutputStudentInfo.setText(StudentTxt);
    }
    
    // function to check if each entry is valid (e.g if the name text field is a valid string)
    public boolean ValidateEntry() {
    
        
        if (countDigits(txtEnterFirstName.getText()) > 0 || countDigits(txtEnterLastName.getText()) > 0){
            txtOutputStudentInfo.setText("A student's name cannot contain numbers. Try again!");
            return true;
        }
        
        if (countLetters(txtEnterTest1.getText()) > 0 || countLetters(txtEnterTest2.getText()) > 0 || countLetters(txtEnterTest3.getText()) > 0 || countLetters(txtEnterTest4.getText()) > 0){
            txtOutputStudentInfo.setText("Test scores cannot contain letters. Try again!");
            return true;
        }
        
        if (txtEnterFirstName.getText().equals("") || txtEnterLastName.getText().equals("")) {
            txtOutputStudentInfo.setText("A student's name cannot be blank. Try again!");
            return true;
        } 
        
        if (CheckStudentCap()) {
            txtOutputStudentInfo.setText("You cannot add more than 15 students. Try again!");
            return true;
        }

        return false;        
    }
    
    // to check if the student exist within the db
    public boolean CheckIfStudentExists() {
        
        for (String students : StudentsInfoList) {
            String[] student = students.split(",");
            //List<String> studentLine = new ArrayList<String>(student.length)
            for (int i = 0; i < student.length; i++) {
                System.out.println(student[0] + student[1]);
                if (student[0].toLowerCase().trim().equals(txtEnterFirstName.getText().toLowerCase().trim()) && student[1].toLowerCase().trim().equals(txtEnterLastName.getText().toLowerCase().trim())) {
                    
                    txtOutputStudentInfo.setText("This student already exists. Try again!");
                   
                    return true; 
                }
            }
        }
        return false;  
    }
    
    // to count how many digits are in an inputed text (used to check if strings contain numbers)
    public int countDigits(String stringToSearch) {
    Pattern digitRegex = Pattern.compile("\\d");
    Matcher countMatcher = digitRegex.matcher(stringToSearch);

    int count = 0;
    while (countMatcher.find()) {
        count++;
    }

    return count;
    }

     // to count how many letters are in an inputed text (used to check if ints/doubles contain letters)
    public int countLetters(String stringToSearch) {
    Pattern letterRegex = Pattern.compile("[a-zA-Z]+");
    Matcher countMatcher = letterRegex.matcher(stringToSearch);

    int count = 0;
    while (countMatcher.find()) {
        count++;
    }

    return count;
    }
    
    // used to create a cap of students that can exist within the db
    public boolean CheckStudentCap(){
        
        int StudentCap = 15;
        int StudentCount = 0;
                
        for (String students : StudentsInfoList) {
            StudentCount++;
            
        }
        if (StudentCount >= StudentCap){
            return true;
        }
        
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCourseAverage;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnStudentAverage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblTest1;
    private javax.swing.JLabel lblTest2;
    private javax.swing.JLabel lblTest3;
    private javax.swing.JLabel lblTest4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtEnterFirstName;
    private javax.swing.JTextField txtEnterLastName;
    private javax.swing.JTextField txtEnterTest1;
    private javax.swing.JTextField txtEnterTest2;
    private javax.swing.JTextField txtEnterTest3;
    private javax.swing.JTextField txtEnterTest4;
    private javax.swing.JTextArea txtOutputAverage;
    private javax.swing.JTextArea txtOutputStudentInfo;
    // End of variables declaration//GEN-END:variables
}