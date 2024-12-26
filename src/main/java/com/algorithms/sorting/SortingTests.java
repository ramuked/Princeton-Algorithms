package main.java.com.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import main.java.com.algorithms.sorting.insertion.InsertionSort;
import main.java.com.algorithms.sorting.selection.SelectionSort;
import main.java.com.algorithms.sorting.shellsort.ShellSort;

import java.util.Arrays;
import java.util.Random;

class SortingTests {

    private static final int SIZE = 100_000;

    @Test
    public void testInsertionSortWithIntegers() {
        Integer[] array = generateRandomIntegers(SIZE);
        Integer[] expected = Arrays.copyOf(array, array.length);

        long startTime = System.currentTimeMillis(); // Start timing
        InsertionSort.sort(array);
        long endTime = System.currentTimeMillis(); // End timing

        System.out.println("Time taken for sorting Integers w/ Insertion Sort: " + (endTime - startTime) + " ms");

        Arrays.sort(expected);
        assertArrayEquals(array, expected, "The integer array is not sorted correctly.");
    }

    @Test
    public void testSelectionSortWithIntegers() {
        Integer[] array = generateRandomIntegers(SIZE);
        Integer[] expected = Arrays.copyOf(array, array.length);

        long startTime = System.currentTimeMillis(); // Start timing
        SelectionSort.sort(array);
        long endTime = System.currentTimeMillis(); // End timing
        System.out.println("Time taken for sorting Integers w/ Selection Sort: " + (endTime - startTime) + " ms");

        Arrays.sort(expected);
        assertArrayEquals(array, expected, "The integer array is not sorted correctly.");
    }

    @Test
    public void testShellSortWithIntegers() {
        Integer[] array = generateRandomIntegers(SIZE);
        Integer[] expected = Arrays.copyOf(array, array.length);

        long startTime = System.currentTimeMillis(); // Start timing
        ShellSort.sort(array);
        long endTime = System.currentTimeMillis(); // End timing
        System.out.println("Time taken for sorting Integers w/ Shell Sort: " + (endTime - startTime) + " ms");

        Arrays.sort(expected);
        assertArrayEquals(array, expected, "The integer array is not sorted correctly.");
    }


    private Integer[] generateRandomIntegers(int size) {
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    private String[] generateRandomStrings(int size) {
        Random random = new Random();
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = generateRandomString(random, 10);
        }
        return array;
    }

    private String generateRandomString(Random random, int length) {
        return random.ints('a', 'z' + 1).limit(length).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }

    private Double[] generateRandomDoubles(int size) {
        Random random = new Random();
        Double[] array = new Double[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }
}