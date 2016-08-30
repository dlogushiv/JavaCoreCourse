package module3.homework3.task2;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("Sum of " + a + " and " + b + " = " + Arithmetic.add(a, b) + ".");
        System.out.println(a + " >= " + b + " : " + Adder.check(a, b) + ".");
    }
}
