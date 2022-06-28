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
public class Sequence {
    private LinkedList<Object> lk;
 
    public Sequence()
    {
        this.lk = new LinkedList<Object>();
    }
 
    public int size()
    {
        return this.lk.size();
    }
 
    public boolean isEmpty()
    {
        return this.lk.isEmpty();
    }
 
    public Object elemAtRank(int rank)
    {
        return this.lk.get(rank);
    }
 
    public void replaceAtRank(int rank, Object element)
    {
        this.lk.set(rank, element);
    }
 
    public void insertAtRank(int rank, Object element)
    {
        this.lk.add(rank, element);
    }
 
    public void removeAtRank(int rank)
    {
        this.lk.remove(rank);
    }
 
    public Object first()
    {
        return this.lk.getFirst();
    }
 
    public Object last()
    {
        return this.lk.getLast();
    }
 
    public Object before(Object element)
    {
        return this.lk.get(this.lk.indexOf(element) - 1);
    }
 
    public Object after(Object element)
    {
        return this.lk.get(this.lk.indexOf(element) + 1);
    }
 
    public void replaceElement(Object oldElement, Object newElement)
    {
        this.lk.set(this.lk.indexOf(oldElement), newElement);
    }
 
    public void swapElements(Object element1, Object element2)
    {
        this.lk.set(this.lk.indexOf(element1), element2);
        this.lk.set(this.lk.indexOf(element2), element1);
    }
 
    public void insertBefore(Object beforeElement, Object element)
    {
        this.lk.add(this.lk.indexOf(beforeElement), element);
    }
 
    public void insertAfter(Object afterElement, Object element)
    {
        this.lk.add(this.lk.indexOf(afterElement) + 1, element);
    }
 
    public void insertFirst(Object element)
    {
        this.lk.addFirst(element);
    }
 
    public void insertLast(Object element)
    {
        this.lk.addLast(element);
    }
 
    public void remove(Object element)
    {
        this.lk.remove(element);
    }
 
    public Object atRank(Object element)
    {
        return this.lk.indexOf(element);
    }
 
    public int rankOf(Object element)
    {
        return this.lk.indexOf(element);
    }
 
    public void print()
    {
        for (int i = 0; i < this.lk.size(); i++)
        {
            System.out.print(this.lk.get(i) + " ");
        }
        System.out.println();
    }
}
