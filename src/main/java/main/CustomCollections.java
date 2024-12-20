package main;

import java.util.Comparator;
import java.util.List;

public class CustomCollections {
    public static <T extends Comparable<T>> int binarySearch(List<T> list, T key) {
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = list.get(mid);
            switch (midVal.compareTo(key)) {
                case -1:
                    low = mid + 1;
                    break;
                case 0:
                    return mid;
                case 1:
                    high = mid - 1;
                    break;
            }
        }
        return -1;
    }

    public static <T> int binarySearch(List<T> list, T key, Comparator<T> c) {
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = list.get(mid);
            int compare = c.compare(midVal, key);
            if (compare < 0) {
                low = mid + 1;
            } else if (compare > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
