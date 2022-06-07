package dataStructures;

import dataStructures.Exceptions.EmptyQueueException;
import dataStructures.Exceptions.FullQueueException;
import dataStructures.Interfaces.IQueue;

public class Queue implements IQueue {

	private Object[] queue;
	private int initial;
	private int last;
        private int max_size;
	
	public Queue() {
            this.queue = new Object[2];
            this.initial = 0;
            this.last = 0;
            this.max_size = 2;
	}
	
	@Override
	public void enqueue(Object o) throws FullQueueException{
            if (this.size() == this.max_size-1) this.raiseSize();
            this.queue[this.last] = o;
            this.last = (this.last+1) % this.queue.length;
	}

	@Override
	public Object dequeue() throws EmptyQueueException {
            if (this.isEmpty()) throw new EmptyQueueException("Fila vazia");
            Object o = this.queue[this.initial];
            this.initial = (this.initial + 1) % this.queue.length;
            return o;
	}

	@Override
	public Object first() throws EmptyQueueException{
            if (this.isEmpty()) throw new EmptyQueueException("Fila vazia");
            return this.queue[this.initial];
	}

	@Override
	public int size() {
            return this.initial <= this.last ? this.last - this.initial : this.last + this.max_size - this.initial;
	}

	@Override
	public boolean isEmpty() {
            return this.initial == this.last;
	}
        
        private void raiseSize() {
            Object[] ob = new Object[this.max_size*2];
            for (int i = 0; i < this.size()+1; i++)
                ob[i] = this.queue[(initial + i) % this.max_size];
            
      
            this.initial = 0;
            this.last = this.max_size - 1;
            this.max_size *= 2;
            this.queue = ob;
        }
	
}
