package main.java.com.algorithms.sorting.mergesort;

import static main.java.com.algorithms.sorting.utils.Utils.isSorted;

public class BottomUpMergeSort extends MergeSort{
    public static<T extends Comparable<T>> void sort(T[] a){
        int N = a.length;
        @SuppressWarnings("unchecked")
        T[] aux = (T[]) new Comparable[N];
        for(int sz = 1; sz < N; sz += sz){
            for(int lo = 0; lo < N - sz; lo += sz + sz){
                MergeSort.merge(a, aux, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }

        assert isSorted(a);
    }
}
