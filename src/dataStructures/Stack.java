package dataStructures;

import java.util.ArrayList;
import dataStructures.Exceptions.EmptyStackException;;

public class Stack {
	
	private ArrayList<Integer> array;
	
	Stack(){
		this.array = new ArrayList<Integer>();
	}
	
	public int size() {
		return this.array.size();
	}
	
	public boolean isEmpty() {
		return this.array.isEmpty();
	}
	
	public void push(int e) {
		this.array.add(e);
	}
	
	public int pop() throws EmptyStackException {
		if (this.array.isEmpty()) throw new EmptyStackException("Empty stack.");
		int e = this.array.get(this.array.size()-1);
		this.array.remove(this.array.size()-1);
		return e;
	}
	
	public int top() throws EmptyStackException {
		if (this.array.isEmpty()) throw new EmptyStackException("Empty stack.");
		return this.array.get(this.array.size()-1);
	}
}
