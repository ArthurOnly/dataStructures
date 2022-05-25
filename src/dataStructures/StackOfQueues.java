package dataStructures;

import dataStructures.Exceptions.EmptyStackException;

public class StackOfQueues {
    	private Queue q1;
        private Queue q2;
	
	public StackOfQueues(){
            this.q1 = new Queue(10);
            this.q2 = new Queue(10);
	}
	
	public int size() {
            return this.q1.size();
	}
	
	public boolean isEmpty() {
            return this.q1.isEmpty();
	}
	
	public void push(Object e) {
            this.q2.enqueue(e);
            
            while (!this.q1.isEmpty())
                this.q2.enqueue(this.q1.dequeue());
            
            Queue qs = this.q1;
            this.q1 = this.q2;
            this.q2 = qs;
	}
	
	public Object pop() throws EmptyStackException {
            if (this.isEmpty()) throw new EmptyStackException("Empty stack.");
            return this.q1.dequeue();
	}
	
	public Object top() throws EmptyStackException {
            if (this.isEmpty()) throw new EmptyStackException("Empty stack.");
            return this.q1.first();
	}
}
