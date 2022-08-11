package dataStructures;

public class Heap {
    private Object[] array;
    private int actualSize;
    private int capacity;

    public Heap()
    {
        this.array = new Object[2];
        this.actualSize = 0;
        this.capacity = 2;
    }

    public boolean isFull()
    {
        return this.actualSize == this.capacity;
    }

    private void raiseSize()
    {
        Object[] newArray = new Object[this.capacity*2];
        for (int i = 0; i < this.capacity; i++)
            newArray[i] = this.array[i];
      
        this.capacity *= 2;
        this.array = newArray;
    }

    public void insert(Object key)
    {
        if (this.isFull)
            this.raiseSize();

        this.array[++this.actualSize] = key;

        heapSort();
    }

    public void removeMin()
    {
        this.array[this.actualSize--] = null;
    }

    private void heapSort()
    {
        return;
    }

}
