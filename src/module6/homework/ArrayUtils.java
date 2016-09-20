package module6.homework;

public final class ArrayUtils {
    public static int sum(int array[]) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int item : array) {
            if (item <= min) {
                min = item;
            }
        }
        return min;
    }

    public static int max(int array[]) {
        int max = array[0];
        for (int item : array) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public static int maxPositive(int array[]) {
        int maxPositive = 0;
        boolean flag = false;
        for (int item : array) {
            if (item > 0 && item > maxPositive) {
                maxPositive = item;
                flag = true;
            }
        }
        return flag ? maxPositive : -1;
    }

    public static int multiplication(int array[]) {
        int mult = 1;
        for (int item : array) {
            mult *= item;
        }
        return mult;
    }

    public static int modulus(int array[]) {
        if (array[0] == 0) return 0;
        int k = 1;
        while (k != array.length) {
            if (array[array.length - k] == 0) k++;
            else break;
        }
        return array[0] % array[array.length - k];
    }

    public static int secondLargest(int array[]) {
        boolean ind = true; // indicator of sorting
        int t;              // temp variable for min between two elements
        int secondMax = 0;

        // bubble sort
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
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i - 1] < array[i]) {
                secondMax = array[i - 1];
                break;
            }
        }
        return secondMax;
    }

    public static int[] reverse(int[] array) {
        int t = array[0];
        for (int b = 0, e = array.length - 1; b < array.length / 2; b++, e--) {
            array[b] = array[e];
            array[e] = t;
            t = array[b + 1];
        }
        return array;
    }

    public static int[] findEvenElements(int[] array) {
        int counter = 0;
        int k = 0;
        for (int item : array) {
            if (item % 2 == 0) counter++;
        }
        int[] result = new int[counter];
        for (int item : array) {
            if (item % 2 == 0) {
                result[k] = item;
                k++;
            }
        }
        return result;
    }

}
