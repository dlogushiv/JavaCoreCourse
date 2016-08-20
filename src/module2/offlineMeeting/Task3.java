package module2.offlineMeeting;

public class Task3 {
    // снятие денег скоммисией
    static double withdrowBalance (double balance, double withdrawal, double commision){
        //double commision = 1.5;
        return balance - withdrawal - commision;
        }

    public static void main(String[] args) {
        double balance = 100;
        double withdraw = 30.5;
        double commision = 10.5;

        double balanceAfter = withdrowBalance(balance, withdraw, commision);

        if (balanceAfter >= 0){
            System.out.println("ok");
            System.out.println("Balance after cashout: " + balanceAfter);
        }
        else {
            System.out.println("no");
        }
    }
}

