/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Seamus90
 * The PQInterface lays out the blueprint of the methods that the priorityQueue class will use
 */
public interface PQInterface {
    // ads element to pq with a key
    public void enqueue(int key, Object element);
    // calculate and returns pq size
    public int size();
    // checks if the pq is empty
    public boolean isEmpty();
    // returns element at top of pq without removing it
    public Object peek();
    // removes and retunts elemen at top of pq
    public Object dequeue();
}
