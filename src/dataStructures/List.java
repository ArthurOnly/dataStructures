/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures;

/**
 *
 * @author 20211014040004
 */
public class List {
    Object[] array;
    int size;
    int next;
   
    public List()
    {
        this.array = new Object[2];
        this.size = 2;
        this.next = 0;
    }
 
    public int size()
    {
        return this.next;
    }
 
    public boolean isEmpty()
    {
        return this.next == 0;
    }
 
    private void resize()
    {
        Object[] newArray = new Object[this.size * 2];
        for (int i = 0; i < this.size; i++)
        {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
        this.size *= 2;
    }
 
    public boolean isFirst(Object o)
    {
        return this.array[0] == o;
    }
 
    public boolean isLast(Object o)
    {
        return this.array[this.next-1] == o;
    }
 
    public Object first()
    {
        return this.array[0];
    }
 
    public Object last()
    {
        return this.array[this.next-1];
    }
 
    public Object before(Object o)
    {
        int i = 0;
        for (int z = 0; z < this.next; z++)
        {
            if (this.array[z] == o)
            {
                i = z;
                break;
            }
        }
        if (i == 0)
            return null;
        return this.array[i-1];
    }
 
    public Object after(Object o)
    {
        int i = 0;
        for (int z = 0; z < this.next; z++)
        {
            if (this.array[z] == o)
            {
                i = z;
                break;
            }
        }
        if (i == this.next-1)
            return null;
        return this.array[i+1];
    }
 
    public void replaceElement(Object o, Object n)
    {
        int i = -1;
        for (int z = 0; z < this.next; z++)
        {
            if (this.array[z] == o)
            {
                i = z;
                break;
            }
        }
        if (i == -1)
            return;
        this.array[i] = n;
    }
 
    public void swapElements(Object o1, Object o2)
    {
        int i1 = -1;
        int i2 = -1;
        for (int z = 0; z < this.next; z++)
        {
            if (this.array[z] == o1)
            {
                i1 = z;
                break;
            }
        }
        for (int z = 0; z < this.next; z++)
        {
            if (this.array[z] == o2)
            {
                i2 = z;
                break;
            }
        }
        if (i1 == -1 || i2 == -1)
            return;
        Object tmp = this.array[i1];
        this.array[i1] = this.array[i2];
        this.array[i2] = tmp;
    }
 
    public void insertBefore(Object o, Object n)
    {
        int i = -1;
        for (int z = 0; z < this.next; z++)
        {
            if (this.array[z] == o)
            {
                i = z;
                break;
            }
        }
        if (i == -1)
            return;
 
        if (this.next == this.size)
            this.resize();
 
        for (int z = this.next; z > i; z--)
        {
            this.array[z] = this.array[z-1];
        }
        this.array[i] = n;
        this.next++;
    }
 
    public void insertAfter(Object o, Object n)
    {
        int i = -1;
        for (int z = 0; z < this.next; z++)
        {
            if (this.array[z] == o)
            {
                i = z;
                break;
            }
        }
        if (i == -1)
            return;
       
        if (this.next == this.size)
            this.resize();
 
        for (int z = this.next-1; z > i; z--)
        {
            this.array[z+1] = this.array[z];
        }
        this.array[i+1] = n;
        this.next++;
    }
 
    public void insertFirst(Object n)
    {
        if (this.next == this.size)
            this.resize();
        for (int z = this.next; z > 0; z--)
        {
            this.array[z] = this.array[z-1];
        }
        this.array[0] = n;
        this.next++;
    }
 
    public void insertLast(Object n)
    {
        if (this.next == this.size)
            this.resize();
        this.array[this.next] = n;
        this.next++;
    }
 
    public void remove(Object o)
    {
        int i = -1;
        for (int z = 0; z < this.next; z++)
        {
            if (this.array[z] == o)
            {
                i = z;
                break;
            }
        }
        if (i == -1)
            return;
        for (int z = i; z < this.next-1; z++)
        {
            this.array[z] = this.array[z+1];
        }
        this.next--;
    }
 
    public void print()
    {
        for (int z = 0; z < this.next; z++)
        {
            System.out.print(this.array[z] + " ");
        }
        System.out.println();
    }
}
