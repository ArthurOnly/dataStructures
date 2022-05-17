package dataStructures;

import dataStructures.Exceptions.EmptyQueueException;
import dataStructures.Exceptions.FullQueueException;
import dataStructures.Interfaces.IQueue;

public class Queue implements IQueue {

	private Object[] queue;
	private int initial;
	private int last;
	
	public Queue(int initial_size) {
		this.queue = new Object[initial_size];
		this.initial = 0;
		this.last = 0;
	}
	
	@Override
	public void enqueue(Object o) throws FullQueueException{
		if (this.size() == this.queue.length - 1) throw new FullQueueException("Fila cheia");
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
		return this.queue.length - this.initial + this.last;
	}

	@Override
	public boolean isEmpty() {
		return this.initial == this.last;
	}
	
}
