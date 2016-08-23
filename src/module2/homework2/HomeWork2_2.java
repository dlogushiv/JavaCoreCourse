package module2.homework2;

public class HomeWork2_2 {

    static double withdrawBalance(double balance, double withdrawal) {
        return (balance - withdrawal - withdrawal * 0.05);
    }

    public static void main(String[] args) {
        double balance = 100;
        double withdraw = 96;

        double result = withdrawBalance(balance, withdraw);
        if (result >=0) {
            System.out.println("Transaction: OK! \nCommission: " + withdraw * 0.05 + ". \nBalance: " + result + ".");
        } else {
            System.out.println("Transaction: NO! \nBalance: " + balance + ".");
        }

    }
}
