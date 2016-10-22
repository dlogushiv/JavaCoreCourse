package module9.homework;

import module7.homework.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1L, "First", "One", "Kiev", 10000);
        User user2 = new User(2L, "Second", "Two", "Donetsk", 8000);
        User user3 = new User(3L, "Third", "Three", "Poltava", 2000);
        User user4 = new User(4L, "Fourth", "Four", "Lvov", 1000);
        User user5 = new User(5L, "Fifth", "Five", "Kiev", 6000);
        User user6 = new User(6L, "Sixth", "Six", "Kiev", 3000);
        User user7 = new User(7L, "Seventh", "Seven", "Odessa", 1000);
        User user8 = new User(8L, "Eighth", "Eight", "Lvov", 3000);
        User user9 = new User(9L, "Ninth", "Nine", "Lvov", 7000);
        User user10 = new User(10L, "Tenth", "Ten", "Odessa", 1000);
        User user11 = new User(11L, "First", "One", "Yalta", 10000);

        Order order1 = new Order(1L, 750, Currency.UAH, "Iron", "Rozetka", user4);
        Order order11 = new Order(11L, 750, Currency.UAH, "Iron", "Rozetka", user11);
        Order order2 = new Order(2L, 10, Currency.USD, "T-short", "Rozetka", user8);
        Order order3 = new Order(3L, 1700, Currency.UAH, "MP3 Player", "Rozetka", user5);
        Order order4 = new Order(4L, 2500, Currency.UAH, "Oven", "Eldorado", user9);
        Order order5 = new Order(5L, 320, Currency.USD, "Refrigerator", "Foxtrot", user1);
        Order order6 = new Order(6L, 200, Currency.UAH, "Cup", "E-Posud", user10);
        Order order7 = new Order(7L, 750, Currency.UAH, "Accessories", "Rozetka", user3);
        Order order8 = new Order(8L, 32, Currency.USD, "Iron", "Comfy", user6);
        Order order9 = new Order(9L, 2500, Currency.UAH, "MicrowaveOven", "Comfy", user1);
        Order order10 = new Order(1L, 750, Currency.UAH, "Iron", "Rozetka", user4);
//        Order order10 = new Order(10L, 250, Currency.USD, "Phone", "AliExpress", user2);

        List<User> users = new ArrayList<>();
        List<Order> orders = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);
        users.add(user11);

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);
        orders.add(order6);
        orders.add(order7);
        orders.add(order8);
        orders.add(order9);
        orders.add(order10);
        orders.add(order11);

        System.out.println("\tList of orders:\n" + orders);

        Utils test = new Utils();
        test.sortByPriceDesc(orders);
        test.sortByPriceAscAndCity(orders);
        test.sortByThreePoints(orders);
        test.deleteDuplicates(orders);
        test.cheapOrders(orders);
        test.ordersByCurrency(orders);
        test.uniqueCities(orders);
        test.userLastNameChecking(orders, "Petrov");
        test.userLastNameChecking(orders, "Four");
        System.out.println(test.onlyUAHOrders(orders));
    }
}
