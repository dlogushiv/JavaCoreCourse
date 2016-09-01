package module3.homework3.task4;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Vanya", 2000, 74, "Microny Plant LTD", "GRN", 10000);
        System.out.println(user1.getBalance());

        user1.paySalary();

        System.out.println(user1.getBalance());

        if (user1.withdraw(100) == -1) {
            System.out.println("Transaction failed!");
        }
        System.out.println(user1.getBalance());

        if (user1.withdraw(2000) == -1) {
            System.out.println("Transaction failed!");
        }
        System.out.println(user1.getBalance());

        System.out.println(user1.companyNameLength(user1));

        System.out.println(user1.getMonthsOfEmployment());
        user1.monthIncreaser(5);
        System.out.println(user1.getMonthsOfEmployment());
        user1.monthIncreaser(7);
        System.out.println(user1.getMonthsOfEmployment());

    }
}
