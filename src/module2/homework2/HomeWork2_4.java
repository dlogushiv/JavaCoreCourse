package module2.homework2;

public class HomeWork2_4 {
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static double fundBalance(String ownerName, double fund) {
        double ownerBalance = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                ownerBalance = balances[i] + fund;
                break;
            }
        }
        return ownerBalance;
    }

    public static void main(String[] args) {
        String ownerName = "Jack";
        double fund = 100;

        double result = fundBalance(ownerName, fund);
        if (result > 0) {
            System.out.println(ownerName + "\nTransaction: OK! \nFund: " + fund + ". \nCurrent balance: " + result + ".");
        } else {
            System.out.println(ownerName + "\nTransaction: NO!");
        }
    }
}