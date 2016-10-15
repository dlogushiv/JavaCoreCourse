package module8.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> list1 = new ArrayList<>();
        List<User> list2 = new ArrayList<>();

        User user1 = new User(1, "One");
        User user2 = new User(2, "Two");
        User user3 = new User(3, "Three");
        User user4 = new User(4, "Four");
        User user5 = new User(5, "Five");
        User user6 = new User(6, "Six");
        User user7 = new User(7, "Seven");
        User user8 = new User(8, "Eight");
        User user9 = new User(9, "Nine");

        list1.add(user6);
        list1.add(user4);
        list1.add(null);
        list1.add(user2);

        list2.add(user8);
        list2.add(user1);
        list2.add(null);
        list2.add(user5);

        AbstractDAO dao = new UserDAO();
        dao.save(user3);
        dao.save(user7);
        dao.save(user9);
        System.out.println(dao);

        dao.delete(user7);
        System.out.println(dao);

        dao.saveAll(list1);
        dao.saveAll(list2);
        System.out.println(dao);

        dao.deleteAll(list1);
        System.out.println(dao);

        dao.deleteById(9);
        System.out.println(dao);

        System.out.println(dao.get(1));
    }
}
