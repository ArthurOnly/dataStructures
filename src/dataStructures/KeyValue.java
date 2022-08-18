package dataStructures;

public class KeyValue {
    public Object key;
    public Object value;

    public KeyValue(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String toString() {
        return this.key + " " + this.value;
    }
}
