package module7.homework;

//Generate Integer and String ArrayList and LinkedList with 1000 and 10000 elements. Measure time of execution of the following methods and print it to console:
//        - add
//        - set
//        - get
//        - remove

import java.util.ArrayList;
import java.util.LinkedList;

import static usefulUtils.StringRandom.generateString;


public class TimeMeasurement {


    public static void main(String[] args) {
        // initialization
        long start, stop;
        int[] values = {1000, 10000};
        int k = 0;
        ArrayList<Integer> arrListInt;
        LinkedList<Integer> linkListInt;
        ArrayList<String> arrListStr;
        LinkedList<String> linkListStr;

        System.out.println("\tApplication methods to ArrayLists with Integers");
        while (k < values.length) {
            arrListInt = new ArrayList<>();

            // add
            start = System.currentTimeMillis();
            for (int i = 0; i < values[k]; i++) {
                arrListInt.add((int) (Math.random() * values[k]));
            }
            stop = System.currentTimeMillis();
            System.out.println("We need " + (stop - start) + " ms for \"add\" " + values[k] + " elements to ArrayList.");

            // set
            start = System.currentTimeMillis();
            for (int i = 0; i < values[k]; i++) {
                arrListInt.set((int) (Math.random() * values[k]), (int) (Math.random() * values[k]) + 50);
            }
            stop = System.currentTimeMillis();
            System.out.println("We need " + (stop - start) + " ms for \"set\" " + values[k] + " elements in ArrayList.");

            // get
            start = System.currentTimeMillis();
            for (int i = 0; i < values[k]; i++) {
                arrListInt.get((int) (Math.random() * values[k]));
            }
            stop = System.currentTimeMillis();
            System.out.println("We need " + (stop - start) + " ms for \"get\" " + values[k] + " elements from ArrayList.");

            // remove
            start = System.currentTimeMillis();
            for (int i = values[k] - 1; i > -1; i--) {
                arrListInt.remove(i);
            }
            stop = System.currentTimeMillis();
            System.out.println("We need " + (stop - start) + " ms for \"remove\" " + values[k] + " elements from ArrayList.");

            System.out.println();
            k++;
        }

        System.out.println("\tApplication methods to LinkedLists with Integers");
        k = 0;
        while (k < values.length) {
            linkListInt = new LinkedList<>();

            // add
            start = System.currentTimeMillis();
            for (int i = 0; i < values[k]; i++) {
                linkListInt.add((int) (Math.random() * values[k]));
            }
            stop = System.currentTimeMillis();
            System.out.println("We need " + (stop - start) + " ms for \"add\" " + values[k] + " elements to LinkedList.");

            // set
            start = System.currentTimeMillis();
            for (int i = 0; i < values[k]; i++) {
                linkListInt.set((int) (Math.random() * values[k]), (int) (Math.random() * values[k]) + 50);
            }
            stop = System.currentTimeMillis();
            System.out.println("We need " + (stop - start) + " ms for \"set\" " + values[k] + " elements in LinkedList.");

            // get
            start = System.currentTimeMillis();
            for (int i = 0; i < values[k]; i++) {
                linkListInt.get((int) (Math.random() * values[k]));
            }
            stop = System.currentTimeMillis();
            System.out.println("We need " + (stop - start) + " ms for \"get\" " + values[k] + " elements from LinkedList.");

            // remove
            start = System.currentTimeMillis();
            int listSize = values[k];
            for (int i = listSize - 1; i > -1; i--) {
                linkListInt.remove(i);
            }
            stop = System.currentTimeMillis();
            System.out.println("We need " + (stop - start) + " ms for \"remove\" " + listSize + " elements from LinkedList.");

            System.out.println();
            k++;
        }

        System.out.println("\tApplication methods to ArrayLists with Strings");
        k = 0;
        while (k < values.length) {
            arrListStr = new ArrayList<>();

            // add
            start = System.currentTimeMillis();
            for (int i = 0; i < values[k]; i++) {
                arrListStr.add(generateString((int) (Math.random() * 10 + 1)));
            }
            stop = System.currentTimeMillis();
            System.out.println("We need " + (stop - start) + " ms for generate and \"add\" " + values[k] + " Strings to ArrayList.");

            // set
            start = System.currentTimeMillis();
            for (int i = 0; i < values[k]; i++) {
                arrListStr.set((int) (Math.random() * values[k]), generateString((int) (Math.random() * 10 + 1)));
            }
            stop = System.currentTimeMillis();
            System.out.println("We need " + (stop - start) + " ms for generate and \"set\" " + values[k] + " Strings in ArrayList.");

            // get
            start = System.currentTimeMillis();
            for (int i = 0; i < values[k]; i++) {
                arrListStr.get((int) (Math.random() * values[k]));
            }
            stop = System.currentTimeMillis();
            System.out.println("We need " + (stop - start) + " ms for \"get\" " + values[k] + " Strings from ArrayList.");

            // remove
            start = System.currentTimeMillis();
            for (int i = values[k] - 1; i > -1; i--) {
                arrListStr.remove(i);
            }
            stop = System.currentTimeMillis();
            System.out.println("We need " + (stop - start) + " ms for \"remove\" " + values[k] + " Strings from ArrayList.");

            System.out.println();
            k++;
        }

        System.out.println("\tApplication methods to LinkedLists with Strings");
        k = 0;
        while (k < values.length) {
            linkListStr = new LinkedList<>();

            // add
            start = System.currentTimeMillis();
            for (int i = 0; i < values[k]; i++) {
                linkListStr.add(generateString((int) (Math.random() * 10 + 1)));
            }
            stop = System.currentTimeMillis();
            System.out.println("We need " + (stop - start) + " ms for generate and \"add\" " + values[k] + " Strings to LinkedList.");

            // set
            start = System.currentTimeMillis();
            for (int i = 0; i < values[k]; i++) {
                linkListStr.set((int) (Math.random() * values[k]), generateString((int) (Math.random() * 10 + 1)));
            }
            stop = System.currentTimeMillis();
            System.out.println("We need " + (stop - start) + " ms for generate and \"set\" " + values[k] + " Strings in LinkedList.");

            // get
            start = System.currentTimeMillis();
            for (int i = 0; i < values[k]; i++) {
                linkListStr.get((int) (Math.random() * values[k]));
            }
            stop = System.currentTimeMillis();
            System.out.println("We need " + (stop - start) + " ms for \"get\" " + values[k] + " Strings from LinkedList.");

            // remove
            start = System.currentTimeMillis();
            for (int i = values[k] - 1; i > -1; i--) {
                linkListStr.remove(i);
            }
            stop = System.currentTimeMillis();
            System.out.println("We need " + (stop - start) + " ms for \"remove\" " + values[k] + " Strings from LinkedList.");

            System.out.println();
            k++;
        }
    }
}
