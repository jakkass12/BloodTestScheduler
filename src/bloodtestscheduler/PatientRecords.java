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
    private int patientId;  // used to track patients in patientRecords
    
    // constructor
    public PatientRecords() {
        this.patients = new ArrayList<>();
    }
    
    
    // adds patient to records
    public void addPatient(Patient patient) { 
        patientId = patients.size();  // set id to size of list, since id will always match size
        patients.add(patient);
        // sets patient id
        patient.setPatientId(patientId);
    } 
    
    // updates a patients test status by their id
    public void updateTestStatus(int patientId, String updatedStatus) {
        patients.get(patientId).setTestStatus(updatedStatus); 
    }
    
    // method to return all patients as string
    public String getAllPatients() {
        StringBuilder patientsContentStr = new StringBuilder();  // stores patinets to string method
        for (Patient patient : patients) {
            patientsContentStr.append(patient.toString() + "\n");
        }
        return patientsContentStr.toString();
    }
    
    // method to return a string of all patients by test status type
    public String getPatientByTestStatus(String testStatus) {
        StringBuilder patientsString = new StringBuilder();  // used to store patients for output
        // b
        return buildPatientByTestStatusString(0, testStatus, patientsString);
        
    }
    
    // recursive method to build a string of all patients of certain test status
    public String buildPatientByTestStatusString(int index, String testStatus, StringBuilder patientsString) {
        // breaks recursion when it goes out of bounds
        if (index >= patients.size()){
            return patientsString.toString();
        }
        // get current patient at index
        Patient patient = patients.get(index);
        // check if current patient has matching test case and append if it does
        if (patient.getTestStatus().equalsIgnoreCase(testStatus)) {
            patientsString.append(patient.toString() + "\n");
        }
        
        // move to next patient and repeat
        return buildPatientByTestStatusString(index + 1, testStatus, patientsString);
    }
}

