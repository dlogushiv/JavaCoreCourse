package module10.homework.task4;

class Task10_4 {
    void f(String text_f) throws Exception10_4 {
        try {
            g(text_f);
        } catch (NullPointerException e) {
            System.out.println("I am in f catch");
        }
    }

    void g(String text_g) throws Exception10_4 {
        if (!text_g.equals("hello")) throw new Exception10_4("We invoke constructor of Exception10_4");
        else System.out.println("We not invoke constructor of Exception10_4");
    }
}
