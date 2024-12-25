package main.java.com.algorithms.sorting.selection;

import java.util.Arrays;

public class SelectionSortClient {

    public static void main(String[] args) {
        // Test case 1: Integer array
        Integer[] intArray = {64, 25, 12, 22, 11};
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        SelectionSort.sort(intArray);
        System.out.println("Sorted Integer Array: " + Arrays.toString(intArray));


        // Test case 2: String array
        String[] stringArray = {"Banana", "Apple", "Cherry", "Mango", "Blueberry"};
        System.out.println("\nOriginal String Array: " + Arrays.toString(stringArray));
        SelectionSort.sort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));

        // Test case 3: Double array
        Double[] doubleArray = {64.5, 25.2, 12.1, 22.9, 11.0};
        System.out.println("\nOriginal Double Array: " + Arrays.toString(doubleArray));
        SelectionSort.sort(doubleArray);
        System.out.println("Sorted Double Array: " + Arrays.toString(doubleArray));

        // Test case 4: Custom class implementing Comparable
        Person[] people = {
                new Person("John", 25),
                new Person("Alice", 30),
                new Person("Bob", 20)
        };
        System.out.println("\nOriginal Person Array: " + Arrays.toString(people));
        SelectionSort.sort(people);
        System.out.println("Sorted Person Array: " + Arrays.toString(people));
    }

    // A custom class implementing Comparable
    static class Person implements Comparable<Person> {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Person other) {
            return Integer.compare(this.age, other.age);
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }
}
