package main.java.com.algorithms.sorting.utils;

import java.util.Comparator;

public class Utils {
    public static <T extends Comparable<T>> boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    public static<T> boolean less(Comparator<? super T> comparator, T v, T w){
        return comparator.compare(v, w) < 0;
    }

    public static <T> void swap(T[] a, int i, int j) {
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

    public static <T extends Comparable<T>> boolean isSorted(T[] a, int low, int high) {
        for (int i = low + 1; i < high; i++) {
            if (less(a[i], a[i - 1]))
                return false;
        }
        return true;
    }

    public static <T> boolean isSorted(Comparator<? super T> comparator, T[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(comparator, a[i], a[i - 1]))
                return false;
        }
        return true;
    }

    public static <T> boolean isSorted(Comparator<? super T> comparator, T[] a, int low, int high) {
        for (int i = low + 1; i < high; i++) {
            if (less(comparator, a[i], a[i - 1]))
                return false;
        }
        return true;
    }


}
