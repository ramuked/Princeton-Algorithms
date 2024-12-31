package main.java.com.algorithms.sorting.insertion;
import java.util.Comparator;
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

        assert isSorted(a);
    }

    public static<T> void sort(T[] a, Comparator<? super T> comparator){
        int N = a.length;
        for (int i = 1; i < N; i++)
            for (int j = i; j > 0; j--)
                if (less(comparator, a[j], a[j - 1]))
                    swap(a, j, j - 1);
                else
                    break;

        assert isSorted(comparator, a);
    }
}
