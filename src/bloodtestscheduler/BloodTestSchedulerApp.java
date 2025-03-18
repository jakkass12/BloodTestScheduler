/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Seamus90
 */
public class BloodTestSchedulerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PatientPriorityQueue queue = new PatientPriorityQueue();


        Patient p1 = new Patient("Alice", "urgent", 40, "true", "GP A", "001");
        Patient p2 = new Patient("Bob", "urgent", 45, "false", "GP B", "002");
        Patient p3 = new Patient("Charlie", "medium", 40, "true", "GP C", "003");
        Patient p4 = new Patient("Diana", "urgent", 50, "true", "GP D", "004");
        Patient p5 = new Patient("Eve", "low", 70, "false", "GP E", "005");

        queue.enqueue(1, p1);  
        queue.enqueue(1, p2);  
        queue.enqueue(2, p3); 
        queue.enqueue(1, p4);  
        queue.enqueue(3, p5); 


        System.out.println("starting queue order:");
        System.out.println(queue.printPQueue());


        System.out.println("ending order after dequeue:");
        System.out.println(queue.printPQueue());
    }
    
}
