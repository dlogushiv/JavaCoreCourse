package module4.homework;

public class Main {
    public static void main(String[] args) {
        USBank usBank = new USBank(123, "USA", Currency.USD, 50, 3000, 25, 56_000_000L);
        EUBank euBank = new EUBank(456, "France", Currency.EUR, 100, 4000, 10, 150_000_000L);
        ChinaBank chinaBank = new ChinaBank(789, "China", Currency.USD, 300, 1000, 80, 200_000_000L);
        int withdraw = 1001;

        System.out.println("The limit of withdraw in usBank is " + usBank.getLimitOfWithdrawal() + " " + usBank.getCurrency());
        System.out.println("The limit of funding  in usBank is " + usBank.getLimitOfFunding() + " " + usBank.getCurrency());
        System.out.println("The monthly rate in usBank is " + usBank.getMonthlyRate() * 100 + "%");
        System.out.println("The commission of withdraw " + withdraw + " " + usBank.getCurrency() + " in usBank will be " + usBank.getCommission(withdraw) + " " + usBank.getCurrency());

        System.out.println("\nThe limit of withdraw in euBank is " + euBank.getLimitOfWithdrawal() + " " + euBank.getCurrency());
        System.out.println("The limit of funding  in euBank is " + euBank.getLimitOfFunding() + " " + euBank.getCurrency());
        System.out.println("The monthly rate in euBank is " + euBank.getMonthlyRate() * 100 + "%");
        System.out.println("The commission of withdraw " + withdraw + " " + euBank.getCurrency() + " in euBank will be " + euBank.getCommission(withdraw) + " " + euBank.getCurrency());

        System.out.println("\nThe limit of withdraw in chinaBank is " + chinaBank.getLimitOfWithdrawal() + " " + chinaBank.getCurrency());
        System.out.println("The limit of funding  in chinaBank is " + chinaBank.getLimitOfFunding() + " " + chinaBank.getCurrency());
        System.out.println("The monthly rate in chinaBank is " + chinaBank.getMonthlyRate() * 100 + "%");
        System.out.println("The commission of withdraw " + withdraw + " " + chinaBank.getCurrency() + " in chinaBank will be " + chinaBank.getCommission(withdraw) + " " + chinaBank.getCurrency());

    }
}
