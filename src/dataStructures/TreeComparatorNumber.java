package dataStructures;

import java.util.Comparator;

public class TreeComparatorNumber implements Comparator {
    @Override
    public int compare(Object arg0, Object arg1) {
        if ((int) arg0 > (int) arg1)
            return 1;
        else if ((int) arg0 == (int) arg1)
            return 0;
        else
            return -1;
    }

    public Object greater(Object arg0, Object arg1) {
        if (arg0 == null){
            return arg1;
        }
        if (arg1 == null){
            return arg0;
        }
        if ((int) arg0 > (int) arg1)
            return arg0;
        return arg1;
    }
}
