package dataStructures;

import dataStructures.Exceptions.EmptyStackException;;

public class StackRedBlack {
	
	private int[] array;
	int space;
	int nextIndexRed;
	int nextIndexBlack;
	
	public StackRedBlack(){
		this.array = new int[2];
		this.space = 2;
		this.nextIndexRed = 0;
		this.nextIndexBlack = 1;
	}
	
	public int sizeRed() {
		return this.nextIndexRed;
	}
	
	public int sizeBlack() {
		return this.space - 1 - this.nextIndexBlack;
	}
	
	public boolean isEmptyRed() {
		return this.nextIndexRed == 0;
	}
	
	public boolean isEmptyBlack() {
		return this.nextIndexBlack == this.space-1;
	}
	
	private boolean isFull() {
		return this.nextIndexRed + this.space - this.nextIndexBlack == this.space+1;
	}
	
	public void pushRed(int e) {
		if (this.isFull())
			this.raiseSize();
		this.array[this.nextIndexRed++] = e;
	}
	
	public void pushBlack(int e) {
		if (this.isFull())
			this.raiseSize();
		this.array[this.nextIndexBlack--] = e;
	}
	
	public int popRed() throws EmptyStackException {
		if (this.isEmptyRed()) throw new EmptyStackException("Empty stack.");
		return this.array[--nextIndexRed];
	}
	
	public int popBlack() throws EmptyStackException {
		if (this.isEmptyBlack()) throw new EmptyStackException("Empty stack.");
		return this.array[++nextIndexBlack];
	}
	
	public int topRed() throws EmptyStackException {
		if (this.isEmptyRed()) throw new EmptyStackException("Empty stack.");
		return this.array[nextIndexRed-1];
	}
	
	public int topBlack() throws EmptyStackException {
		if (this.isEmptyBlack()) throw new EmptyStackException("Empty stack.");
		return this.array[nextIndexBlack+1];
	}
	
	
	private void raiseSize() {
		int[] newArray = new int[this.space*2];
		
		//red elements
		for (int i = 0; i < this.nextIndexRed; i++)
			newArray[i] = this.array[i];
		
		//black elements
		for (int i = this.nextIndexBlack+1; i < this.space; i++)
			newArray[i+this.space] = this.array[i];
		
		this.space = this.space * 2;
		this.nextIndexBlack += this.space/2;
		this.array = newArray;
	}
	
	public void printRed() {
		for (int i = 0; i < this.nextIndexRed; i++)
			System.out.print(this.array[i]+" ");
	}
	
	public void printBlack() {
		for (int i = this.nextIndexBlack+1; i < this.space; i++)
			System.out.print(this.array[i]+" ");
	}
}
