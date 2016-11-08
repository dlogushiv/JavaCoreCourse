package module10.homework;

public class Task10_1 {
    public static void main(String[] args) throws Exception {
        String word;
        word = null;
        try {
            System.out.println(word.length());
        } catch (Exception e) {
            System.out.println("Your string is null");
        } finally {
            System.out.println("I were there :)");
        }
    }
}
