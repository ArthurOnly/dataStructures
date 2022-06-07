package dataStructures;

import dataStructures.Interfaces.IQueue;
import java.util.Vector;

/**
 *
 * @author 20211014040004
 */
public class QueueVector implements IQueue {

    Vector<Object> vc;
    
    public QueueVector() {
        this.vc = new Vector<Object>();
    }
   
    @Override
    public void enqueue(Object o) {
        this.vc.add(o);
    }

    @Override
    public Object dequeue() {
        return this.vc.remove(0);
    }

    @Override
    public Object first() {
        return this.vc.firstElement();
    }

    @Override
    public int size() {
        return this.vc.size();
    }

    @Override
    public boolean isEmpty() {
        return this.vc.isEmpty();
    }
    
}
