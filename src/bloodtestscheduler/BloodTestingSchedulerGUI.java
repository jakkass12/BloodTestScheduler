/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Seamus90
 */
public class BloodTestingSchedulerGUI extends javax.swing.JFrame {
    // attributes
    PatientRecords patientRecords;  // stores all patient records
    PatientPriorityQueue patientPriorityQueue;  // stores priority in which patients processed
    MissedApptQueue missedApptQueue;  // stores last 5 patients to miss appointment
    /**
     * Creates new form BloodTestingSchedulerGUI
     */
    public BloodTestingSchedulerGUI() {
        initComponents();
        
        // initialase records and pq and queue
        this.patientRecords = new PatientRecords();
        this.patientPriorityQueue = new PatientPriorityQueue();
        this.missedApptQueue = new MissedApptQueue();
        
        // clear patient priority cb and fill it
        patientPriorityCB.removeAllItems();
        populatPatientPriorityCB();
        
        // clear and populate hospital ward status combo box
        hospitalStatusCB.removeAllItems();
        populateFromHospitalWardCB();
    }
    
    // method to populate patient priority combo box
    public void populatPatientPriorityCB() {
        // clear cb
        patientPriorityCB.removeAllItems(); 
        
        // fill combo box with priorty types
        patientPriorityCB.addItem("Urgent");
        patientPriorityCB.addItem("Medium");
        patientPriorityCB.addItem("Low");
    }
    
    // method to populate is from hospital ward combo box
    public void populateFromHospitalWardCB() {
        hospitalStatusCB.removeAllItems();
        hospitalStatusCB.addItem("True");
        hospitalStatusCB.addItem("False");
    }
    
    // method to display current patient with top priority
    public void displayTopPriotiyPatient() {
        // clear text area
        patientProcessingTA.setText("");
        
        // stores patient details
        StringBuilder priorityPatientDetails = new StringBuilder();
        
        // check to see if the pq is empty or not
        if (patientPriorityQueue.isEmpty() == false) {
            // get patient element at top of the pq
            PQElement topPatientElement = (PQElement) patientPriorityQueue.peek();
        
            // get the patient object
            Patient topPrioityPatient = topPatientElement.getElement();
        

        
            // add details to stringbuilder
            priorityPatientDetails.append("Name: " + topPrioityPatient.getPatientName() + "\n");
            priorityPatientDetails.append("Priority: " + topPrioityPatient.getPatientPriority() + "\n");
            priorityPatientDetails.append("Age: " + topPrioityPatient.getPatientAge() + " ///");
            priorityPatientDetails.append("From Hospital: " + topPrioityPatient.getIsFromHospitalWard() + "\n");
            priorityPatientDetails.append("GP Name: " + topPrioityPatient.getGpName() + "\n");
            priorityPatientDetails.append("GP ID: " + topPrioityPatient.getGpId() + "\n");
        } else {
            priorityPatientDetails.append("No patients left to process");  
        }
        
        // display details in text area
        patientProcessingTA.append(priorityPatientDetails.toString());
    }
    
    // method to display last missed appointments
    public void displayMissedAppointments() {
        // clear text area
        missedPatientsTA.setText("");
        // call method to store last 5 patients in a stringbuilder
        missedPatientsTA.append(missedApptQueue.getQueContents());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientPriorityLabel = new javax.swing.JPanel();
        mainHeading = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        patientNameLabel = new javax.swing.JLabel();
        patientNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        patientPriorityCB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        patientAgeField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hospitalStatusCB = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        gpNameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        gpIdField = new javax.swing.JTextField();
        registerPatientBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientProcessingTA = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        processPatientBtn = new javax.swing.JButton();
        markMissedBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        missedPatientsTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainHeading.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mainHeading.setText("Blood Test Scheduler");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Patient Registration");

        patientNameLabel.setText("Patient Name");

        jLabel3.setText("Patient Priority");

        patientPriorityCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Patient Age");

        jLabel2.setText("Fom Hospital Ward");

        hospitalStatusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("GP Name");

        jLabel6.setText("gp ID");

        javax.swing.GroupLayout patientPriorityLabelLayout = new javax.swing.GroupLayout(patientPriorityLabel);
        patientPriorityLabel.setLayout(patientPriorityLabelLayout);
        patientPriorityLabelLayout.setHorizontalGroup(
            patientPriorityLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientPriorityLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientPriorityLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientPriorityLabelLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(patientPriorityLabelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(patientPriorityLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(patientNameLabel)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(patientNameField)
                            .addComponent(patientPriorityCB, 0, 150, Short.MAX_VALUE)
                            .addComponent(patientAgeField))
                        .addGap(93, 93, 93)
                        .addGroup(patientPriorityLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(hospitalStatusCB, 0, 150, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(gpNameField)
                            .addComponent(jLabel6)
                            .addComponent(gpIdField))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(patientPriorityLabelLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(mainHeading)
                .addContainerGap(337, Short.MAX_VALUE))
        );
        patientPriorityLabelLayout.setVerticalGroup(
            patientPriorityLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientPriorityLabelLayout.createSequentialGroup()
                .addComponent(mainHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(patientPriorityLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientNameLabel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientPriorityLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalStatusCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientPriorityLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientPriorityLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientPriorityCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gpNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientPriorityLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(patientPriorityLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gpIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        registerPatientBtn.setText("Register Patient");
        registerPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPatientBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Patient Processing");

        patientProcessingTA.setColumns(20);
        patientProcessingTA.setRows(5);
        jScrollPane1.setViewportView(patientProcessingTA);

        jLabel8.setText("Patient Details");

        processPatientBtn.setText("Process Patient");
        processPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processPatientBtnActionPerformed(evt);
            }
        });

        markMissedBtn.setText("Mark as Missed");
        markMissedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markMissedBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("Last Five Missed Appointments");

        missedPatientsTA.setColumns(20);
        missedPatientsTA.setRows(5);
        jScrollPane2.setViewportView(missedPatientsTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(patientPriorityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(registerPatientBtn)))
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(processPatientBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(markMissedBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patientPriorityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerPatientBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(processPatientBtn)
                            .addComponent(markMissedBtn)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 193, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // adds patients to missed appointments queue
    private void markMissedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markMissedBtnActionPerformed
        // TODO add your handling code here:
        
        // get pq element to be dequeued
        PQElement processedPatientElement = (PQElement) patientPriorityQueue.dequeue();
        
        // convert to patient object
        Patient processedPatient = processedPatientElement.getElement();
        
        // get the patients id
        int pIndex = processedPatient.getPatientId();
        
        // now update that patients status
        patientRecords.updateTestStatus(pIndex, "Missed");
        
        // add patient to the queue
        missedApptQueue.enqueue(processedPatient);
        
        // display new priority
        displayTopPriotiyPatient();
        
        // display missed appointments
        displayMissedAppointments();
    }//GEN-LAST:event_markMissedBtnActionPerformed

    // when button clicked adds patients to registartion and displays priority
    private void registerPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPatientBtnActionPerformed
        // TODO add your handling code here:
        
        // get input fields and convert to approriate data types
        String pName = patientNameField.getText();
        String pPriority = (String) patientPriorityCB.getSelectedItem();
        int pAge = Integer.parseInt(patientAgeField.getText());
        String pHospitalStatus = (String) hospitalStatusCB.getSelectedItem();
        String gpName = gpNameField.getText();
        String gpId = gpIdField.getText();
        
        // create patient 
        Patient patient = new Patient(pName, pPriority, pAge, pHospitalStatus, gpName, gpId);
        
        // add to records
        patientRecords.addPatient(patient);
        
        // convert patient priority level to int
        int priorityKey = patient.priorityStringToInt();
        patientPriorityQueue.enqueue(priorityKey, patient);
        
        // reset fields
        patientNameField.setText("");
        patientAgeField.setText("");
        gpNameField.setText("");
        gpIdField.setText("");
        
        // display top prioty patient
        displayTopPriotiyPatient();
    }//GEN-LAST:event_registerPatientBtnActionPerformed

    // will add patient to records and to the pq for processing
    private void processPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processPatientBtnActionPerformed
        // TODO add your handling code here:
        
        // get pq element to be dequeued
        PQElement processedPatientElement = (PQElement) patientPriorityQueue.dequeue();
        
        // convert to patient object
        Patient processedPatient = processedPatientElement.getElement();
        
        // get the patients id
        int pIndex = processedPatient.getPatientId();
        
        // now update that patients status
        patientRecords.updateTestStatus(pIndex, "Processed");
        
        // display new priority
        displayTopPriotiyPatient();
       
    }//GEN-LAST:event_processPatientBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BloodTestingSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodTestingSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodTestingSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodTestingSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodTestingSchedulerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField gpIdField;
    private javax.swing.JTextField gpNameField;
    private javax.swing.JComboBox<String> hospitalStatusCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel mainHeading;
    private javax.swing.JButton markMissedBtn;
    private javax.swing.JTextArea missedPatientsTA;
    private javax.swing.JTextField patientAgeField;
    private javax.swing.JTextField patientNameField;
    private javax.swing.JLabel patientNameLabel;
    private javax.swing.JComboBox<String> patientPriorityCB;
    private javax.swing.JPanel patientPriorityLabel;
    private javax.swing.JTextArea patientProcessingTA;
    private javax.swing.JButton processPatientBtn;
    private javax.swing.JButton registerPatientBtn;
    // End of variables declaration//GEN-END:variables
}
