package dataStructures;

import dataStructures.Interfaces.IQueue;

public class QueueOfStacks implements IQueue {

	Stack st;
	Stack st2;
	
	public QueueOfStacks() {
		this.st = new Stack();
		this.st2 = new Stack();
	}
	
	@Override
	public void enqueue(Object o) {
            while (!this.st.isEmpty())
                this.st2.push(this.st.pop()); 
         
            st.push(o); 

            while (!this.st2.isEmpty())     
                this.st.push(this.st2.pop());  
	}

	@Override
	public Object dequeue() {
		return this.st.pop();
	}

	@Override
	public Object first() {
		return this.st.top();
	}

	@Override
	public int size() {
		return this.st.size();
	}

	@Override
	public boolean isEmpty() {
		return this.st.isEmpty();
	}

}
