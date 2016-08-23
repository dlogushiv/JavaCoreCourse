package module2.homework2;

public class HomeWork2_3 {
    static double withdrawBalance(int[] balances, String[] ownerNames, String ownerName, double withdrawal) {
        double ownerBalance = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                ownerBalance = balances[i];
                break;
            }
        }
        return (ownerBalance - withdrawal - withdrawal * 0.05);
    }

    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Jane";
        double withdraw = 240;

        double result = withdrawBalance(balances, ownerNames, ownerName, withdraw);
        if (result >= 0) {
            System.out.println(ownerName + "\nTransaction: OK! \nWithdraw: " + withdraw + ". \nCommission: " + withdraw * 0.05 + ". \nBalance: " + result + ".");
        } else {
            System.out.println(ownerName + "\nTransaction: NO!");
        }
    }
}
