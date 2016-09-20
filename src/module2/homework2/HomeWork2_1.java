package module2.homework2;

import module6.homework.ArrayUtils;

public class HomeWork2_1 {

    static int sum(int[] array) {
//        int sum = 0;
//        for (int element : array) {
//            sum += element;
//        }
//        return sum;
        return ArrayUtils.sum(array);
    }

    static int min(int[] array) {
//        int min = array[0];
//        for (int element : array) {
//            if (element <= min) {
//                min = element;
//            }
//        }
//        return min;
        return ArrayUtils.min(array);
    }

    static int max(int[] array) {
//        int max = array[0];
//        for (int element : array) {
//            if (element >= max) {
//                max = element;
//            }
//        }
//        return max;
        return ArrayUtils.max(array);
    }

    static int maxPositive(int[] array) {
//        int maxPositive = 0;
//        boolean flag = false;
//        for (int element : array) {
//            if (element > 0 && element >= maxPositive) {
//                maxPositive = element;
//                flag = true;
//            }
//        }
//        if (flag) {
//            return maxPositive;
//        } else {
//            return -1;
//        }
        return ArrayUtils.maxPositive(array);
    }

    static long multiplication(int[] array) {
//        long multiplication = 1;
//        for (int element : array) {
//            multiplication *= element;
//        }
//        return multiplication;
        return ArrayUtils.multiplication(array);
    }

    static int modulus(int[] array) {
//        return array[0] % array[array.length - 1];
        return ArrayUtils.modulus(array);
    }

    static int secondLargest(int[] array) {
//        boolean ind = true; // indicator of sorting
//        int t;              // temp variable for min between two elements
//        int secondMax = 0;
//
//        // bubble sort
//        while (ind) {
//            ind = false;
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i] > array[i + 1]) {
//                    t = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = t;
//                    ind = true;
//                }
//            }
//        }
//        for (int i = array.length - 1; i > 0; i--) {
//            if (array[i - 1] < array[i]) {
//                secondMax = array[i - 1];
//                break;
//            }
//        }
//        return secondMax;
        return ArrayUtils.secondLargest(array);
    }

    static double sum(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum;
    }

    static double min(double[] array) {
        double min = array[0];
        for (double element : array) {
            if (element <= min) {
                min = element;
            }
        }
        return min;
    }

    static double max(double[] array) {
        double max = array[0];
        for (double element : array) {
            if (element >= max) {
                max = element;
            }
        }
        return max;
    }

    static double maxPositive(double[] array) {
        double maxPositive = 0;
        boolean flag = false;
        for (double element : array) {
            if (element > 0 && element >= maxPositive) {
                maxPositive = element;
                flag = true;
            }
        }
        if (flag) {
            return maxPositive;
        } else {
            return -1;
        }
    }

    static double multiplication(double[] array) {
        double multiplication = 1;
        for (double element : array) {
            multiplication *= element;
        }
        return multiplication;
    }

    static double modulus(double[] array) {
        return array[0] % array[array.length - 1];
    }

    static double secondLargest(double[] array) {
        boolean ind = true; // indicator of sorting
        double t;              // temp variable for min between two elements
        double secondMax = 0;

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

    public static void main(String[] args) {
        int[] setOfNumbers = {120, 120, 120, 120, 120, 100, 120, 120, -15, -7};

        System.out.println("I-1. Sum of the array elements: " + sum(setOfNumbers) + ".");
        System.out.println("I-2. Minimal element of array: " + min(setOfNumbers) + ".");
        System.out.println("I-3. Maximal element of array: " + max(setOfNumbers) + ".");
        System.out.print("I-4. Maximal positive element of array: ");
        if (maxPositive(setOfNumbers) != -1) {
            System.out.println(maxPositive(setOfNumbers) + ".");
        } else {
            System.out.println("All elements in array are negative!");
        }
        System.out.println("I-5. Multiplication of the array elements: " + multiplication(setOfNumbers) + ".");
        System.out.println("I-6. Modulus of first and last elements of array: " + modulus(setOfNumbers) + ".");
        System.out.println("I-7. Second largest element of array: " + secondLargest(setOfNumbers) + ".");

//        double[] setOfNumbersD = {50.36, 50.36, -5.48795, 50.36, -888.974, 6.957, -68.65741, -987.672, -3.65, -8.453};
//
//        System.out.println("\nD-1. Sum of the array elements: " + sum(setOfNumbersD) + ".");
//        System.out.println("D-2. Minimal element of array: " + min(setOfNumbersD) + ".");
//        System.out.println("D-3. Maximal element of array: " + max(setOfNumbersD) + ".");
//        System.out.print("D-4. Maximal positive element of array: ");
//        if (maxPositive(setOfNumbersD) != -1) {
//            System.out.println(maxPositive(setOfNumbersD) + ".");
//        } else {
//            System.out.println("All elements in array are negative!");
//        }
//        System.out.println("D-5. Multiplication of the array elements: " + multiplication(setOfNumbersD) + ".");
//        System.out.println("D-6. Modulus of first and last elements of array: " + modulus(setOfNumbersD) + ".");
//        System.out.println("D-7. Second largest element of array: " + secondLargest(setOfNumbersD) + ".");
    }
}
