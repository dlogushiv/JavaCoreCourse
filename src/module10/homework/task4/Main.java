package module10.homework.task4;

public class Main {
    public static void main(String[] args) throws Exception10_4 {
        Task10_4 item = new Task10_4();
        try {
            System.out.println("Method g with \"hello\"");
            item.g("hello");
        } catch (Exception10_4 e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("\nMethod g with \"hell\"");
            item.g("hell");
        } catch (Exception10_4 e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("\nMethod f with \"hello\"");
            item.f("hello");
        } catch (Exception10_4 e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("\nMethod f with \"hell\"");
            item.f("hell");
        } catch (Exception10_4 e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("\nMethod f with \"null\"");
            item.f(null);
        } catch (Exception10_4 e) {
            System.out.println(e.getMessage());
        }
    }
}
