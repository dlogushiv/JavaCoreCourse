package module6.homework;

import java.util.Arrays;

import static usefulUtils.splitNullElements.split;


public class Main {
//    private static int[] test = {54, 5, 5, 10, 10, 5, 0};
//    private static int[] test2 = {0, 0, -5, -4, -6, -2, -1, -1, 0, 0};
//    private static int[] test3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    public static void main(String[] args) {
//        System.out.println("min of test: " + ArrayUtils.min(test));
//        System.out.println("max of test: " + ArrayUtils.max(test));
//        System.out.println("max positive of test2: " + ArrayUtils.maxPositive(test2));
//        System.out.println("multiplication of test: " + ArrayUtils.multiplication(test));
//        System.out.println("modulus of test: " + ArrayUtils.modulus(test));
//        System.out.println("second largest of test2: " + ArrayUtils.secondLargest(test2));
//        System.out.println("even elements of test3: " + Arrays.toString(ArrayUtils.findEvenElements(test3)));
//        System.out.println("reversed test3: " + Arrays.toString(ArrayUtils.reverse(test3)));
//        System.out.println("even elements of reversed test3: " + Arrays.toString(ArrayUtils.findEvenElements(test3)));

        User user1 = new User(1L, "Jonh", "Smith", 100, 1000);
        User user2 = new User(2L, "Vasya", "Pupkin", 110, 1100);
        User user3 = new User(3L, "Emma", "Harison", 200, 1500);
        User user4 = new User(4L, "Jonh", "Smith", 100, 1000);
        User user5 = new User(1L, "Jonh", "Smith", 100, 1000);
        User[] users = {user1, null, user2, user3, null, user4, user5};

        UserUtil.printUserArray(UserUtil.uniqueUsers(users));
        System.out.println();
        UserUtil.printUserArray(UserUtil.usersWithContitionalBalance(users, 1000));
        System.out.println();
        UserUtil.printUserArray(UserUtil.paySalaryToUsers(users));
        System.out.println();
        System.out.println(Arrays.toString(UserUtil.getUsersId(users)));
        System.out.println();
        UserUtil.printUserArray(users);
        System.out.println();
        UserUtil.printUserArray(UserUtil.deleteEmptyUsers(users));


    }
}
