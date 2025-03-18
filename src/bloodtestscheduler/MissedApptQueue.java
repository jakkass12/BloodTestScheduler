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
}
