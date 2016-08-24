package module2.homework2;

public class HomeWork2_3 {
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static double withdrawBalance(String ownerName, double withdrawal) {
        double ownerBalance = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                ownerBalance = balances[i];
                break;
            }
        }
//        return (ownerBalance - withdrawal - withdrawal * 0.05);
        return HomeWork2_2.withdrawBalance(ownerBalance,withdrawal);
    }

    public static void main(String[] args) {
        String ownerName = "Jane";
        double withdraw = 240;

        double result = withdrawBalance(ownerName, withdraw);
        if (result >= 0) {
            System.out.println(ownerName + "\nTransaction: OK! \nWithdraw: " + withdraw + ". \nCommission: " + withdraw * 0.05 + ". \nBalance: " + result + ".");
        } else {
            System.out.println(ownerName + "\nTransaction: NO!");
        }
    }
}
