package dataStructures;

import dataStructures.Exceptions.EmptyStackException;;

public class Stack {
	
	private Object[] array;
	int space;
	int nextIndex;
	
	public Stack(){
		this.array = new Object[2];
		this.space = 2;
		this.nextIndex = 0;
	}
	
	public int size() {
		return this.nextIndex;
	}
	
	public boolean isEmpty() {
		return this.nextIndex == 0;
	}
	
	public void push(Object e) {
		if (this.nextIndex + 1 == this.space)
			this.raiseSize();
		this.array[this.nextIndex++] = e;
	}
	
	public Object pop() throws EmptyStackException {
		if (this.isEmpty()) throw new EmptyStackException("Empty stack.");
		return this.array[--nextIndex];
	}
	
	public Object top() throws EmptyStackException {
		if (this.isEmpty()) throw new EmptyStackException("Empty stack.");
		return this.array[nextIndex-1];
	}
	
	private void raiseSize() {
		this.space = this.space * 2;
		Object[] newArray = new Object[this.space];
		for (int i = 0; i < nextIndex; i++)
			newArray[i] = this.array[i];
		this.array = newArray;
	}
}
