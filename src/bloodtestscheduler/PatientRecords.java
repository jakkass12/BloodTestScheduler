/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;
import java.util.*;

/**
 *
 * @author Seamus90
 * this class will be used to store all the patient records
 */
public class PatientRecords {
    // attributes
    private ArrayList<Patient> patients;
    
    public PatientRecords() {
        this.patients = new ArrayList<>();
    }
    
    // adds patient to records
    public void addPatient(Patient patient) { 
        patients.add(patient);
    }
    
    // updates a patients test status
    public void updateTestStatus(int patientId, String updatedStatus) {
        patients.get(patientId).setTestStatus(updatedStatus); 
    }
    
    
    
}
