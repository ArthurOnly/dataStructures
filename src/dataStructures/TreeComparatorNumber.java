package dataStructures;

import java.util.Comparator;

public class TreeComparatorNumber implements Comparator {
    @Override
    public int compare(Object arg0, Object arg1) {
        if ((int) arg0 > (int) arg1)
            return 1;
        else if (arg0 == arg1)
            return -1;
        else
            return 0;
    }
}
