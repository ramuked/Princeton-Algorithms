package main.java.com.algorithms.sorting.mergesort;

import static main.java.com.algorithms.sorting.utils.Utils.isSorted;
import static main.java.com.algorithms.sorting.utils.Utils.less;

public class MergeSort {
    public static <T extends Comparable<T>> void sort(T[] a) {
        int N = a.length;

        @SuppressWarnings("unchecked")
        T[] aux = (T[]) new Comparable[N];
        sort(a, aux, 0, N - 1);
    }

    private static <T extends Comparable<T>> void sort(T[] a, T[] aux, int low, int high) {
        if (low >= high) return;

        int mid = low + (high - low) / 2;
        sort(a, aux, low, mid);
        sort(a, aux, mid + 1, high);
        if (!less(a[mid + 1], a[mid])) return;
        merge(a, aux, low, mid, high);
    }

    protected static <T extends Comparable<T>> void merge(T[] a, T[] aux, int low, int mid, int high) {

        assert isSorted(a, low, mid);
        assert isSorted(a, mid + 1, high);
        for (int k = low; k <= high; k++) {
            aux[k] = a[k];
        }
        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > high) a[k] = aux[i++];
            else if (less(aux[i], aux[j])) a[k] = aux[i++];
            else a[k] = aux[j++];
        }

        assert isSorted(a, low, high);
    }


}
