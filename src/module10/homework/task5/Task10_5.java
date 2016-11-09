package module10.homework.task5;

public class Task10_5 {
    public static void main(String[] args) {
        try {
            // uncomment the methods one by one
            method("",3);
//            method("hi", 3);
//            method("qwerty", 3);
        } catch (Exception_1 | Exception_2 | Exception_3 e) {
            System.out.println(e.getMessage());
        }

    }

    static void method(String text, int numb) throws Exception_1, Exception_2, Exception_3 {
        if (text.length() == 0) {
            throw new Exception_1("We invoke constructor of Exception1");
        } else {
            System.out.println("Text length: " + text.length());
            System.out.println("We not invoke constructor of Exception_1");
        }

        System.out.println();
        if (text.length() < numb) {
            throw new Exception_2("We invoke constructor of Exception2");
        } else {
            System.out.println("Symbol at numb " + (numb + 1) + ": " + text.charAt(numb));
            System.out.println("We not invoke constructor of Exception_2");
        }

        System.out.println();
        if (numb == 0) {
            throw new Exception_3("We invoke constructor of Exception3");
        } else {
            System.out.println("Text length / " + numb + " = " + text.length() / numb);
            System.out.println("We not invoke constructor of Exception_3");
        }
    }
}
