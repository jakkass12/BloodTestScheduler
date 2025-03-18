/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Seamus90
 * class used to store Patient object and a key int
 * used to compare patient priority
 */
public class PQElement {
    private int key;  // the lower the key value the greater the priority
    private Patient element;
    
    // constructor
    public PQElement(int priority, Patient element) {
        this.key = priority;
        this.element = element;
    }
    
    // setters
    public void setKey(int priority) {
        this.key = priority;
    }
    
    public void setElement(Patient element) {
        this.element = element;
    }
    
    // getters
    public int getKey() {
        return key;
    }
    
    public Patient getElement() {
        return element;
    }
}
