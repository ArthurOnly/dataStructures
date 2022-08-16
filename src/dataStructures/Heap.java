package dataStructures;
//max heap
public class Heap {
    private Object[] array;
    private int actualSize;
    private int capacity;
    private TreeComparatorNumber comparator;

    public Heap()
    {
        this.array = new Object[2];
        this.actualSize = 0;
        this.capacity = 2;
        this.comparator = new TreeComparatorNumber();
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
        if (this.isFull())
            this.raiseSize();

        this.array[this.actualSize++] = key;

        // Adjust heap order
        int rootIndex = this.getRoot(this.actualSize-1);
        int actualIndex = this.actualSize - 1;

        while (this.comparator.compare(this.array[actualIndex], this.array[rootIndex]) == 1){
            if (actualIndex == 0) return;

            Object pivot = this.array[rootIndex];
            this.array[rootIndex] = key;
            this.array[actualIndex] = pivot;
            actualIndex = rootIndex;
            rootIndex = this.getRoot(actualIndex);
        }
    }

    public void removeMin()
    {
        this.array[this.actualSize--] = null;
    }

    private int getRoot(int i)
    {
        return (i-1) / 2;
    }

    public double height()
    {
        int result = 0;
        int start = this.actualSize;
        while (start > 1){
            result++;
            start/=2;
        }
        return result+1;
    }

    public void print()
    {
        int current = 0;
        int breakI = 1;
        int line = 0;

        for(int i = 0; i < this.height()-line-1 ;i++)
            System.out.print("-");

        for (int i = 0; i < this.actualSize; i++){
            System.out.print(this.array[i]+"-");
            current++;
            if (current == breakI) {
                line++;
                current=0;
                breakI*=2;
                System.out.println();
                for(int z = 0; z < this.height()-line-1 ;z++)
                    System.out.print("-");
            }
        }
        System.out.println();
    }

}
