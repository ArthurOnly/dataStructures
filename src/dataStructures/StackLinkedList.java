package dataStructures;

import dataStructures.Exceptions.EmptyStackException;
import dataStructures.linked_list.SingleLinkedList;

public class StackLinkedList {
	private SingleLinkedList linkedList;
	int space;
	
	public StackLinkedList(){
		this.linkedList = new SingleLinkedList();
		this.space = 2;
	}
	
	public int size() {
		return this.linkedList.size();
	}
	
	public boolean isEmpty() {
		return this.linkedList.size() == 0;
	}
	
	public void push(int e) {
		this.linkedList.add(e);
	}
	
	public Object pop() throws EmptyStackException {
		if (this.isEmpty()) throw new EmptyStackException("Empty stack.");
		Object o = this.linkedList.top();
		this.linkedList.pop();
		return o;
	}
	
	public Object top() throws EmptyStackException {
		if (this.isEmpty()) throw new EmptyStackException("Empty stack.");
		return this.linkedList.top();
	}
	
}
