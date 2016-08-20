package module2.offlineMeeting;

public class Task2 {
    static long containsCount(long[] arrays, int n) {
        int k = 0;
        for (long array : arrays) {
            if (array == n) {
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        long[] array1 = {10, 40, 50, 42, 54, 50, 200, 60};
        int n = 50;
        long result = containsCount(array1, n);
        if (result == 0) {
            System.out.println("no");
        }
        if (result == 1) {
            System.out.println("yes");
        }
        if (result > 1) {
            System.out.println(result);
        }

        System.out.println();
    }
}
