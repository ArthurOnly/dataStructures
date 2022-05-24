package dataStructures;

import dataStructures.Exceptions.EmptyQueueException;
import dataStructures.linked_list.SingleLinkedList;

public class QueueLinkedList {
	
	SingleLinkedList lk;
	
	public QueueLinkedList() {
		this.lk = new SingleLinkedList();
	}
	
	public void enqueue(Object o) {
		lk.add(o);
	}
	
	public Object dequeue() throws EmptyQueueException {
		if (this.isEmpty()) throw new EmptyQueueException("Fila vazia");
		Object o = this.lk.get(0);
		this.lk.removeFirst();
		return o;
	}

	public Object first() throws EmptyQueueException{
		if (this.isEmpty()) throw new EmptyQueueException("Fila vazia");
		return this.lk.get(0);
	}

	public int size() {
		return this.lk.size();
	}

	public boolean isEmpty() {
		return this.lk.size() == 0;
	}
}
