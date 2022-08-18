package dataStructures;

public class PriorityQueue {
    private IHeap heap;

    public PriorityQueue(IHeap heap) {
        this.heap = heap;
    }

    public void insert(Object key, Object value) {
        KeyValue kv = new KeyValue(key, value);
        this.heap.insert(kv);
    }

    public KeyValue removeMin() {
        return (KeyValue) this.heap.removeMin();
    }

    public KeyValue min() {
        return (KeyValue) this.heap.min();
    }

    public boolean isEmpty() {
        return this.heap.isEmpty();
    }

    public int size() {
        return this.heap.size();
    }

    public void print() {
        this.heap.print();
    }
}
