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
    public void enqueue(int key, Object element);
    public int size();
    public boolean isEmpty();
    public Object peak();
    public Object dequeue();
    public String printPQueue();
}
