/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;
import java.util.ArrayList;


/**
 *
 * @author Seamus90
 * class stores a priority queue of all the patients to be processed
 * will insert the key/patient element in correct position in queue based on priority
 * will remove top patient in queue when instructed
 */
public class PatientPriorityQueue implements PQInterface {
    // attributes
    private ArrayList<PQElement> patientPQ;  // used to hold the pq of patients in order
    
    // constuctor
    public PatientPriorityQueue() {
        this.patientPQ = new ArrayList<PQElement>();  // itialist he pq list
    }
    
    // checks to see if pq is empty
    @Override
    public boolean isEmpty() { 
        return patientPQ.isEmpty(); 
    }
    
    // calculates and returns the number of elements in the queue
    @Override
    public int size(){
        return patientPQ.size();
    }
    
    
    // used to find patients correct position in the queue
    // first checks priority, then if priroity is same check age, if age same check hospital status
    private int findInsertPosition(PQElement newPatientElement) {
        boolean found = false;  // used to break while loop when position in queue found
        int position = 0;  // initialise to zero to start from beginning
        
        // loop through each patient in the pq
        while (position < patientPQ.size() && found == false) {
            PQElement patientElement = patientPQ.get(position);
            
            // compare priority, if priority is less increment position and compare with next element
            if (patientElement.getKey() < newPatientElement.getKey()) {
                position+=1;
            // if priorities are equel we compare age, 
            } else if (patientElement.getKey() == newPatientElement.getKey()) {
                // get both patients ages
                int currentPatientAge = patientElement.getElement().getPatientAge();
                int newPatientAge = newPatientElement.getElement().getPatientAge();
                // if curren patient is older, they have prirority so increase position
                if (currentPatientAge > newPatientAge) {
                    position+=1;
                // if both ages are the same we check if they came from the hospital
                } else if (currentPatientAge == newPatientAge) {
                    // get both patients hospital status
                    boolean currentPatientIsFromHospital = patientElement.getElement().getIsFromHospitalWard();
                    boolean newPatientIsFromHospital = newPatientElement.getElement().getIsFromHospitalWard();
                    // if current patient came from hospital and new patient didnt increment position
                    if (currentPatientIsFromHospital == true && newPatientIsFromHospital == false) {
                        position +=1;
                    // if both patients are from hospital increment poistion by 1 since it came in later
                    } else if (currentPatientIsFromHospital == true && newPatientIsFromHospital == true) {
                        position +=1;
                    // new patient came from hospital and current didnt
                    } else {
                        found = true;
                    }
                // new patient is older that current patient
                } else {
                    found = true;
                }
            // new patient has a higher priority than the current
            } else {
                found = true;
            }
        }
        return position;
    }
    
    // creates a pqelement and inserts it in the correct position in the priority queue
    @Override
    public void enqueue(int prioritykey, Object item) {
        PQElement patientElement = new PQElement(prioritykey, (Patient)item);
        int index = findInsertPosition(patientElement);  // calls findInsertPosition method to find where to insert 
        
        // if index equals current size add to end, otherwise add to the the calculated position
        if (index == size())
            patientPQ.add(patientElement);
        else
            patientPQ.add(index, patientElement); 
    }
    
    
    // removes the patient at the top of the pq ie one with main priority
    @Override
    public Object dequeue() {
        return patientPQ.remove(0);
    }
    
    // displays the patient at top of queue without removing them
    @Override
    public Object peek() {
        return patientPQ.get(0);
    }
    
    // prints contents of the pq
    @Override
    public String printPQueue()
    {
        String printStr = new String();
        PQElement elem;
        for (int i = 0; i<patientPQ.size();i++)
        {
            elem = patientPQ.get(i);
            printStr = printStr.concat (elem.getElement().toString()+" "+"Priority ="+elem.getKey()+"\n");
        }
        return printStr;
    }
}
