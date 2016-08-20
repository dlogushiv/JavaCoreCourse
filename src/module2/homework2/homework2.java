package module2.homework2;

public class homework2 {

    static int getSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    static int getMin(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (element <= min) {
                min = element;
            }
        }
        return min;
    }

    static int getMax(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (element >= max) {
                max = element;
            }
        }
        return max;
    }

    static int getMaxPositive(int[] array) {
        int maxPositive = array[0];
        for (int element : array) {
            if (element > 0 && element >= maxPositive) {
                maxPositive = element;
            }
        }
        return maxPositive;
    }

    static long getMultiplication(int[] array) {
        long multiplication = 1;
        for (int element : array) {
            multiplication *= element;
        }
        return multiplication;
    }

    static int getModulus(int[] array) {
        int mod = array[0] % array[array.length - 1];
        return mod;
    }

    public static void main(String[] args) {
        int[] setOfNumbers = {30, 50, 10, 90, 120, 70, 5, 1, 15, 7};

        System.out.println("1. Sum of the array elements: " + getSum(setOfNumbers) + ".");
        System.out.println("2. Minimal element of array: " + getMin(setOfNumbers) + ".");
        System.out.println("3. Maximal element of erray: " + getMax(setOfNumbers) + ".");
        System.out.println("4. Maximal positive element of array: " + getMaxPositive(setOfNumbers) + ".");
        System.out.println("5. Multiplication of the array elements: " + getMultiplication(setOfNumbers) + ".");
        System.out.println("6. Modulus of first and last elements of array: " + getModulus(setOfNumbers) + ".");

    }
}
