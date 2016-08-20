package module2.offlineMeeting;

public class Task1 {

    static int balancesSum (int[] balances){
        // метод цикла foreach для массиваю на вход - массив, на выходе - сумма
        int sum = 0;
        for (int balance : balances) {
            if (balance > 1000 && balance < 5000)
                sum += balance;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        int[] balances1 = {200, 200, 500, 4000, 30};



//        int[] balances = {1200, 250, 2000, 500, 3200, 9000, 4300, 500, 600, 1200};
//        int[] balances1 = {200, 200, 500, 4000, 30, 900, 430, 50, 60, 1200};

        System.out.println(balancesSum(balances));      //вывод результата с помощью метода
        System.out.println(balancesSum(balances1));

//        System.out.println(balances[10]);     //error

//        int sum = 0;          // цикл через перебор элементов
//        for(int i = 0; i < balances.length; i++){
//            if (balances[i]>1000&&balances[i]<5000)
//                sum+=balances[i];
//            System.out.println(balances[i]);
//            System.out.println(sum);


//        for (int balance : balances) {            // цикл foreach для массива
//            if (balance > 1000 && balance < 5000)
//                sum += balance;
//        }
//            System.out.println(sum);


    }

}