package main.java.com.algorithms.sorting.shufflesort;

import java.util.Random;

import static main.java.com.algorithms.sorting.utils.Utils.swap;

public class ShuffleSort {
    public static <T> void shuffle(T[] a) {
        int N = a.length;
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            int r = random.nextInt(0, i + 1);
            swap(a, i, r);
        }
    }
}
