package module2.homework2;

public class HomeWork2_2 {

    static double withdrawBalance(double balance, double withdrawal) {


        return 0;
    }

    public static void main(String[] args) {
        double balance = 100;
        double withdraw = 10;
        double commision = withdraw * 0.05;

        double result = withdrawBalance(balance, withdraw);
        if (result!=-1){
            System.out.println("OK! Commision: " + commision + " . Balance: " + result);
        }

    }
}
