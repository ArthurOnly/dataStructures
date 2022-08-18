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
        return this.actualSize == this.capacity-1;
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

        this.array[++this.actualSize] = key;
        if (this.actualSize == 1)
            return;

        // Adjust heap order
        int rootIndex = this.getRoot(this.actualSize);
        int actualIndex = this.actualSize;

        while (this.comparator.compare(this.array[actualIndex], this.array[rootIndex]) == 1){
            Object pivot = this.array[rootIndex];
            this.array[rootIndex] = this.array[actualIndex];
            this.array[actualIndex] = pivot;

            actualIndex = rootIndex;
            rootIndex = this.getRoot(actualIndex);

            if (actualIndex == 1)
                break;
        }
    }

    public void removeMin()
    {
        this.array[0] = this.array[this.actualSize--];
        this.array[actualSize+1] = null;

        int i = 0;
        while(!isLeaf(i)){
            int iLeft = getLeft(i);
            int iRight = getRight(i);
            Object swap = this.comparator.greater(this.array[iLeft], this.array[iRight]);
            int iSwap = swap == this.array[iLeft] ? iLeft : iRight;

            this.array[iSwap] = this.array[i];
            this.array[i] = swap;

            i = iSwap;
            System.out.println(i);
        }
    }

    private boolean isLeaf(int i)
    {
        Object leftChild = this.array[getLeft(i)];
        Object rightChild = this.array[getRight(i)];
        return leftChild == null && rightChild == null;
    }

    private int getRoot(int i)
    {
        //System.out.print(i);
        //System.out.print("/2=");
        //System.out.println(i/2);
        return i / 2;
    }

    private int getLeft(int i)
    {
        return 2 * i;
    }
   
    private int getRight(int i)
    {
        return 2 * i + 1;
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

        for (int i = 1; i < this.actualSize+1; i++){
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
