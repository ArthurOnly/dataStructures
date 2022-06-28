/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures;

import java.util.LinkedList;

/**
 *
 * @author 20211014040004
 */
public class ListLinkedList {
    LinkedList<Object> lk;
    int next;
   
    public ListLinkedList()
    {
        this.lk = new LinkedList<>();
        this.next = 0;
    }
 
    public int size()
    {
        return this.lk.size();
    }
 
    public boolean isEmpty()
    {
        return this.lk.isEmpty();
    }
 
    public boolean isFirst(Object o)
    {
        return this.lk.getFirst().equals(o);
    }
 
    public boolean isLast(Object o)
    {
        return this.lk.getLast().equals(o);
    }
 
    public Object first()
    {
        return this.lk.getFirst();
    }
 
    public Object last()
    {
        return this.lk.getLast();
    }
 
    public Object before(Object o)
    {
        int i = this.lk.indexOf(o);
        if (i == 0)
            return null;
        return this.lk.get(i-1);
    }
 
    public Object after(Object o)
    {
        int i = this.lk.indexOf(o);
        if (i == this.lk.size()-1)
            return null;
        return this.lk.get(i+1);
    }
 
    public void replaceElement(Object o, Object n)
    {
        int i = this.lk.indexOf(o);
        this.lk.set(i, n);
    }
 
    public void swapElements(Object o1, Object o2)
    {
        int i1 = this.lk.indexOf(o1);
        int i2 = this.lk.indexOf(o2);
        this.lk.set(i1, o2);
        this.lk.set(i2, o1);
    }
 
    public void insertBefore(Object o, Object n)
    {
        int i = this.lk.indexOf(o);
        this.lk.add(i, n);
    }
 
    public void insertAfter(Object o, Object n)
    {
        int i = this.lk.indexOf(o);
        this.lk.add(i+1, n);
    }
 
    public void insertFirst(Object n)
    {
        this.lk.addFirst(n);
    }
 
    public void insertLast(Object n)
    {
        this.lk.addLast(n);
    }
 
    public void remove(Object o)
    {
        this.lk.remove(o);
    }
 
    public void print()
    {
        for (Object o : this.lk)
            System.out.print(o + " ");
        System.out.println();
    }

}
