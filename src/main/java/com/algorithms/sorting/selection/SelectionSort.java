package main.java.com.algorithms.sorting.selection;

import static main.java.com.algorithms.sorting.utils.Utils.*;

public class SelectionSort {

    public static <T extends Comparable<T>> void sort(T[] a) {
        int N = a.length;
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++)
                if (less(a[j], a[min]))
                    min = j;

            swap(a, i, min);
        }
    }
}
