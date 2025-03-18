/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;
import java.util.*;

/**
 *
 * @author Seamus90
 */
public class MissedApptQueue implements MissedApptQueueInterface{ 
    // attributes
    private ArrayList<Patient> missedAppointments;  // stores patients who miss appointments
    private static final int MAX_QUEUE_SIZE = 5;  // maximum number of patients in queue
    
    // constructor
    public MissedApptQueue() {
        missedAppointments = new ArrayList<>();
    }
    
    // checks if queue is empty
    @Override 
    public boolean isEmpty() {
        return missedAppointments.isEmpty();
    }
    
    // returns size of queue
    @Override 
    public int size() {
        return missedAppointments.size();
    }
    
    @Override
    public void enqueue(Patient newPatient) {
        if (missedAppointments.size() >=MAX_QUEUE_SIZE ) {
            dequeue();
        }
        missedAppointments.add(newPatient);
    }
    
    @Override
    public Object dequeue() {
        return missedAppointments.remove(0);
    }
    
    public String getQueContents() {
        StringBuilder queContent = new StringBuilder();  // used to hold string
        return buildQueueContent(0, queContent);  // begins recursion at item in position 0
    }
    
    // recursive method to build stringbuilder of queue content
    public String buildQueueContent(int index, StringBuilder queContent) {
        // breaks recursion when index goes out of range
        if (index == missedAppointments.size()) {
            return queContent.toString();
        }
        // get current patient
        Patient currentPatient = missedAppointments.get(index);
        
        // append details of current patient to the string builder
        queContent.append("Patient\n");
        queContent.append("Name: " + currentPatient.getPatientName() + "\n");
        queContent.append("Priority: " + currentPatient.getPatientPriority() + "\n");
        queContent.append("Age: " + currentPatient.getPatientAge() + "\n");
        queContent.append("FromHospital: " + currentPatient.getIsFromHospitalWard() + "\n\n");
        
        // calls method again to do the same to next patient
        return buildQueueContent(index + 1, queContent); 
    } 
    
}
