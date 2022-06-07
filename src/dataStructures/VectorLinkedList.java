/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures;

import dataStructures.Exceptions.VectorInvalidIndexException;
import java.util.LinkedList;

/**
 *
 * @author 20211014040004
 */
public class VectorLinkedList {
    LinkedList<Object> lk;
    
    public VectorLinkedList() {
        this.lk = new LinkedList<Object>();
    }
    
    public void insert(Object obj) {
        this.lk.add(obj);
    }

    
    public void insertAt(int index, Object obj) throws VectorInvalidIndexException {
        if (!this.isIndexValid(index)) 
            throw new VectorInvalidIndexException("Indice inválido."); 
        
        this.lk.add(index, obj);
    }
    
    public Object elementAt(int index) throws VectorInvalidIndexException {
        if (!this.isIndexValid(index)) 
            throw new VectorInvalidIndexException("Indice inválido.");
        
        return this.lk.get(index);
    }
    
    public void removeAt(int index) throws VectorInvalidIndexException {
        if (!this.isIndexValid(index)) 
            throw new VectorInvalidIndexException("Indice inválido.");
        
        this.lk.remove(index);
    }
    
    public void replaceAt(int index, Object obj) throws VectorInvalidIndexException {
        if (!this.isIndexValid(index)) 
            throw new VectorInvalidIndexException("Indice inválido.");
        
        this.lk.set(index, obj);
    }
    
    private boolean isIndexValid(int index) {
        return index > 0 && index < this.lk.size();
    }
    
    public int size() {
        return this.lk.size();
    }
    
    public boolean isEmpty() {
        return this.lk.isEmpty();
    }
    
    public void print() {
        for (int i = 0; i < this.lk.size(); i++)
            System.out.print(this.lk.get(i)+" ");
        System.out.println();
    }
}
