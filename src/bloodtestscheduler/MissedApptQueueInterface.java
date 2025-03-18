/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Seamus90
 * Interface that maps out the blueprints of the queue for missed appointments will use
 */
public interface MissedApptQueueInterface {
    // checks if queue is empty
    public boolean isEmpty();
    // calculate and returns the size of queue
    public int size();
    // adds a patient to the bottom of queue
    public void enqueue(Patient newPatient);
    // used to return patient at front of queue
    public Object dequeue();
    
}
