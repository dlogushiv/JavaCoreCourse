package module7.homework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainTask3 {
    public static void main(String[] args) {
        User user1 = new User(1L, "First", "One", "Kiev", 10000);
        User user2 = new User(2L, "Second", "Two", "Odessa", 8000);
        User user3 = new User(3L, "Third", "Three", "Poltava", 2000);
        User user4 = new User(4L, "Fourth", "Four", "Lvov", 1000);
        User user5 = new User(5L, "Fifth", "Five", "Kiev", 6000);
        User user6 = new User(6L, "Sixth", "Six", "Kiev", 3000);
        User user7 = new User(7L, "Seventh", "Seven", "Odessa", 1000);
        User user8 = new User(8L, "Eighth", "Eight", "Lvov", 3000);
        User user9 = new User(9L, "Ninth", "Nine", "Lvov", 7000);
        User user10 = new User(10L, "Tenth", "Ten", "Odessa", 1000);

        Order order1 = new Order(1L, 750, Currency.UAH, "Iron", "Rozetka", user4);
        Order order2 = new Order(2L, 10, Currency.USD, "T-short", "Rozetka", user8);
        Order order3 = new Order(3L, 1700, Currency.UAH, "MP3 Player", "Rozetka", user5);
        Order order4 = new Order(4L, 2600, Currency.UAH, "Oven", "Eldorado", user9);
        Order order5 = new Order(5L, 320, Currency.USD, "Refrigerator", "Foxtrot", user1);
        Order order6 = new Order(6L, 200, Currency.UAH, "Cup", "E-Posud", user10);
        Order order7 = new Order(7L, 850, Currency.UAH, "Accessories", "Rozetka", user3);
        Order order8 = new Order(8L, 32, Currency.USD, "Iron", "Comfy", user6);
        Order order9 = new Order(9L, 2500, Currency.UAH, "MicrowaveOven", "Comfy", user1);
        Order order10 = new Order(1L, 750, Currency.UAH, "Iron", "Rozetka", user4);

        TreeSet<Order> orderSet = new TreeSet<Order>();
        orderSet.add(order1);
        orderSet.add(order2);
        orderSet.add(order3);
        orderSet.add(order4);
        orderSet.add(order5);
        orderSet.add(order6);
        orderSet.add(order7);
        orderSet.add(order8);
        orderSet.add(order9);
        orderSet.add(order10);
//        System.out.println(orderSet);

        // check if set contain Order where User’s lastName is - “Petrov”
        boolean flag1 = false;
        for (Order order : orderSet) {
            if (order.getUser().getLastName().equals("Petrov")) {
                flag1 = true;
                break;
            }
        }
        if (flag1) System.out.println("Set contain Order where User’s lastName is - “Petrov”");
        else System.out.println("Set don't contain Order where User’s lastName is - “Petrov”");

        // print Order with largest price using only one set method - get
        System.out.println("\nThe Order with largest price:\n" + orderSet.last());


        // delete orders where currency is USD using Iterator
        Iterator<Order> iterator = orderSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency() == Currency.USD) iterator.remove();
        }
        System.out.println("The Orders without USD:\n" + orderSet);
    }
}
