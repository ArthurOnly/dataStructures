package dataStructures;

public class HashTable {
    int size;
    int capacity;
    TableItem[] array;

    public HashTable(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.array = new TableItem[capacity];
    }

    public int hash(Object key) {
        return key.hashCode() % this.capacity;
    }

    public void insert(Object key, Object value) {
        Object exists = this.search(key);
        if (exists != null) 
            throw new RuntimeException("Key already exists.");

        if (loadFactor() == 1)
            this.raiseSize();

        int index = this.hash(key);

        // Linear probing
        while (this.array[index] != null) {
            index++;
            if (index == this.capacity) {
                index = 0;
            }
        }

        this.array[index] = new TableItem(key, value);
        this.size++;
    }

    private int loadFactor()
    {
        return this.size / this.capacity;
    }

    public void remove(Object key)
    {
        int index = this.hash(key);
        int passCount = 0;
        
        // Linear probing
        while (this.array[index] != null) {
            if (this.array[index].getKey().equals(key)){ 
                this.array[index] = null;
                this.size--;
                return;
            }
            
            if (passCount == this.capacity) break;
            if (index == this.capacity-1) index = 0;
            else index++;

            passCount++;
        }

        throw new RuntimeException("Key doesnt exists.");
    }

    public int size()
    {
        return this.size;
    }

    public Object search(Object key) {
        int index = this.hash(key);
        int passCount = 0;
        
        // Linear probing
        while (this.array[index] != null) {
            if (this.array[index].getKey().equals(key)) 
                return this.array[index].getValue();
            
            if (passCount == this.capacity) break;
            if (index == this.capacity-1) index = 0;
            else index++;

            passCount++;
        }

        return null;
    }

    public void print()
    {
        for (int i = 0; i < this.capacity; i++)
        {
            System.out.print(this.array[i]+" ");
        }
        System.out.println();
    }

    private void raiseSize()
    {
        this.capacity = this.capacity*2;
        TableItem[] newArray = new TableItem[this.capacity];

        for (int i = 0; i < this.capacity/2; i++){
            TableItem ti = this.array[i];
            if (ti == null) continue;
            int index = this.hash(ti.key);
            
            while (newArray[index] != null) {
                index++;
                if (index == this.capacity) {
                    index = 0;
                }
            }

            newArray[i] = ti;
        }

        this.array = newArray;
    }
    
    private class TableItem {
        private Object key;
        private Object value;

        private TableItem(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Object getKey() {
            return this.key;
        }

        public Object getValue() {
            return this.value;
        }

        public String toString() {
            return this.key + ":" + this.value;
        }
    }
}