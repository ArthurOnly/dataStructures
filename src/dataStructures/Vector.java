package dataStructures;

import dataStructures.Exceptions.VectorInvalidIndexException;

public class Vector {
    
    Object[] arr;
    int next;
    int maxSize;
    
    public Vector() {
        this.arr = new Object[2];
        this.next = 0;
        this.maxSize = 2;
    }
    
    public void insert(Object obj) {
        if (this.isFull()) this.raiseSize();
        this.arr[this.next++] = obj;
    }

    
    public void insertAt(int index, Object obj) throws VectorInvalidIndexException {
        if (!this.isIndexValid(index)) 
            throw new VectorInvalidIndexException("Indice inválido."); 
        
        if (this.isFull()) this.raiseSize();
        
        for (int i = this.next; i > index; i--)
            this.arr[i] = this.arr[i-1];
        this.arr[index] = obj;
        this.next++;
    }
    
    public Object elementAt(int index) throws VectorInvalidIndexException {
        if (!this.isIndexValid(index)) 
            throw new VectorInvalidIndexException("Indice inválido.");
        
        return this.arr[index];
    }
    
    public void removeAt(int index) throws VectorInvalidIndexException {
        if (!this.isIndexValid(index)) 
            throw new VectorInvalidIndexException("Indice inválido.");
        
        for (int i = index+1; i < this.next; i++)
            this.arr[i-1] = this.arr[i];
        
        this.next--;
    }
    
    public void replaceAt(int index, Object obj) throws VectorInvalidIndexException {
        if (!this.isIndexValid(index)) 
            throw new VectorInvalidIndexException("Indice inválido.");
        
        this.arr[index] = obj;
    }
    
    private boolean isIndexValid(int index) {
        return index > 0 && index < this.next;
    }
    
    private boolean isFull() {
        return this.next == this.maxSize;
    }
    
    private void raiseSize(){
        this.maxSize = this.maxSize * 2;
	Object[] newArray = new Object[this.maxSize];
	for (int i = 0; i < this.next; i++)
            newArray[i] = this.arr[i];
	this.arr = newArray;
    }
    
    public int size() {
        return this.next;
    }
    
    public boolean isEmpty() {
        return this.next == 0;
    }
    
    public void print() {
        for (int i = 0; i < this.next; i++)
            System.out.print(this.arr[i]+" ");
        System.out.println();
    }
}
