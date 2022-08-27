package dataStructures;

import java.util.Comparator;

public class SkipList {
    private int FIRST_IS_GREATER = 1;
    private int SECOND_IS_GREATER = -1;
    private int ARE_EQUAL = 0;

    private QuadNode head;
    private Comparator comparator;
    private int size;
    
    public SkipList(Comparator comparator)
    {
        this.comparator = comparator;
        KeyValue min = new KeyValue(Integer.MIN_VALUE, null);
        KeyValue max = new KeyValue(Integer.MAX_VALUE, null);
        this.head = new QuadNode(min);
        head.right = new QuadNode(max);
        this.head.right.left = this.head;
    }

    public int height()
    {
        int height = 0;
        QuadNode current = head;

        while (current.down != null)
        {
            height++;
            current = current.down;
        }

        return height;
    }

    private void addNewRow()
    {
        QuadNode current = head;
        QuadNode newRow = new QuadNode(new KeyValue(Integer.MIN_VALUE, null));
        newRow.right = new QuadNode(new KeyValue(Integer.MAX_VALUE, null));
        newRow.right.left = newRow;

        newRow.down = current;
        current.up = newRow;
        head = newRow;
    }

    public int randomizeHeight()
    {
        int height = 0;

        for (int i = 0; i < this.height()+1; i++)
        {
            if (Math.random() < 0.5)
                height++;
        }
        return height;
    }

    public void print()
    {
        int floor = this.height();
        QuadNode current = head;
        while (current != null){
            QuadNode initial = current;
            System.out.println(floor+"----------------------------------------------------------------");
            while (current != null)
            {
                System.out.print(current+"____");
                current = current.right;
            }
            System.out.println();
            System.out.println("----------------------------------------------------------------------");
            current = initial.down;
            floor--;
        }
    }

    public void insert(Object key, Object value)
    {
        KeyValue toInsert = new KeyValue(key, value);
        int randomizeInsertHeight = randomizeHeight();
        System.out.println(key + " será adicionado em uma altura de " + randomizeInsertHeight + " níveis");

        if (randomizeInsertHeight > this.height())
            addNewRow();

        QuadNode current = head;
        QuadNode reference = null;
        int floor = this.height();
        while (current != null)
        {
            if (comparator.compare(toInsert, current.right.item) == FIRST_IS_GREATER){
                current = current.right;
            }
            else if (comparator.compare(toInsert, current.right.item) == SECOND_IS_GREATER){
                if (current.down != null){
                    if (floor <= randomizeInsertHeight) {
                        QuadNode newNode = new QuadNode(toInsert);
                        newNode.right = current.right;
                        newNode.right.left = newNode;
                        newNode.left = current;
                        current.right = newNode;

                        if (reference != null) {
                            newNode.up = reference;
                            reference.down = newNode;
                        }
                        reference = newNode;
                    }
                    current = current.down;
                    floor--;
                }
                else {
                    QuadNode newNode = new QuadNode(toInsert);
                    newNode.right = current.right;
                    newNode.right.left = newNode;
                    newNode.left = current;
                    current.right = newNode;
                    if (reference != null) {
                        newNode.up = reference;
                        reference.down = newNode;
                    }
                    break;
                }
            }
        }
        this.size++;
    }

    public void remove(Object key)
    {
        KeyValue toRemove = new KeyValue(key, null);
        QuadNode current = head;

        while (true) {
            if (comparator.compare(toRemove, current.right.item) == FIRST_IS_GREATER) {
                current = current.right;
            } else if (comparator.compare(toRemove, current.right.item) == SECOND_IS_GREATER) {
                if (current.down != null) {
                    current = current.down;
                } else {
                    break;
                }
            } else {
                current = current.right;
                while (current != null) {
                    current.left.right = current.right;
                    current.right.left = current.left;
                    current = current.down;
                }
                this.reajustLevel();
                this.size--;
                break;
            }
        }
    }

    public Object search(Object key)
    {
        KeyValue toSearch = new KeyValue(key, null);
        QuadNode current = head;
        while (true) {
            if (comparator.compare(toSearch, current.right.item) == FIRST_IS_GREATER) {
                current = current.right;
            } else if (comparator.compare(toSearch, current.right.item) == SECOND_IS_GREATER) {
                if (current.down != null) {
                    current = current.down;
                } else {
                    break;
                }
            } else {
                return current.right.item;
            }
        }
        return null;
    }

    private void reajustLevel()
    {
        if (this.head.down != null && this.comparator.compare(this.head.down.right.item, new KeyValue(Integer.MAX_VALUE, null)) == ARE_EQUAL) {
            this.head = this.head.down;
            reajustLevel();
        }
    }

    class QuadNode {
        Object item;
        QuadNode right;
        QuadNode down;
        QuadNode up;
        QuadNode left;

        public QuadNode(Object item) 
        {
            this.item = item;
            this.right = null;
            this.down = null;
            this.up = null;
            this.left = null;
        }

        public String toString()
        {
            return item.toString();  
        }  
    }
}
