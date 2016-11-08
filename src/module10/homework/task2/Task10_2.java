package module10.homework.task2;

public class Task10_2 {
    public static void main(String[] args) {
        try {
            test("test");
        } catch (Exception10_2 e) {
            System.out.println(e.getMessage());
        }
    }

    private static void test(String test) throws Exception10_2 {
        if (!test.equals("hello")) throw new Exception10_2("We invoke constructor of Exception10_2");
        else System.out.println("We not invoke constructor of Exception10_2");
    }
}
