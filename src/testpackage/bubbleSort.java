package testpackage;

import java.util.Arrays;

public class bubbleSort {

    public static void bubble(int[] array) {
        long start = System.nanoTime();
        boolean ind = true; // indicator of sorting
        int t;              // temp variable for min between two elements

        while (ind) {
            ind = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                    ind = true;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(array));
        long end = System.nanoTime();
        long traceTime = end - start;
        System.out.println(traceTime + "ns.");
    }

    public static void bubblewot(int[] array) {
        long start = System.nanoTime();
        boolean ind = true; // indicator of sorting

        while (ind) {
            ind = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] = array[i] + array[i] + array[i + 1];
                    array[i + 1] = array[i] - array[i + 1];
                    array[i] = array[i] - array[i + 1];
                    array[i + 1] = array[i + 1] / 2;
                    ind = true;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(array));
        long end = System.nanoTime();
        long traceTime = end - start;
        System.out.println(traceTime + "ns.");
    }

    public static void main(String[] args) {
        int[] array1 = {5, 9, 0, 7, -2, 6, -3};

        bubble(array1);
        bubblewot(array1);
    }
}
