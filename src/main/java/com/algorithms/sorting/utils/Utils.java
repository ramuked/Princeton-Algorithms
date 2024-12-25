package main.java.com.algorithms.sorting.utils;

public class Utils {
    public static <T extends Comparable<T>> boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    public static <T extends Comparable<T>> void swap(T[] a, int i, int j) {
        T swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static <T extends Comparable<T>> boolean isSorted(T[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1]))
                return false;
        }
        return true;
    }
}
