package dataStructures;

import java.util.Comparator;

public class TreeComparatorKeyValue implements Comparator {
    @Override
    public int compare(Object arg0, Object arg1) {
        KeyValue kv1 = (KeyValue) arg0;
        KeyValue kv2 = (KeyValue) arg1;
        if (kv1.key.hashCode() > kv2.key.hashCode())
            return 1;
        else if (kv1.key.hashCode() ==  kv2.key.hashCode())
            return 0;
        else
            return -1;
    }
}
