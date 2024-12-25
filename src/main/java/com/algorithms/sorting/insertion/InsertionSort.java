package main.java.com.algorithms.sorting.insertion;

import static main.java.com.algorithms.sorting.utils.Utils.*;

public class InsertionSort {
    public static <T extends Comparable<T>> void sort(T[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++)
            for (int j = i; j > 0; j--)
                if (less(a[j], a[j - 1]))
                    swap(a, j, j - 1);
                else
                    break;
    }
}
