package module7.homework;

import java.util.*;

public class Main {
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

//        System.out.println(users);
//        System.out.println(orders);

        // sort list by Order price in decrease order
        Comparator<Order> comparatorOrderPriceDecr = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        };
        orders.sort(comparatorOrderPriceDecr);
        System.out.println("Decrease sorting by Order price:\n" + orders);

        // sort list by Order price in increase order AND User city
        Comparator<Order> comparatorOrderPriceIncr = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int res = o1.getPrice() - o2.getPrice();
                if (res == 0) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
                return res;
            }
        };
        orders.sort(comparatorOrderPriceIncr);
        System.out.println("\nIncrease sorting by Order price AND User city:\n" + orders);

        // sort list by Order itemName AND ShopIdentificator AND User city
        Comparator<Order> comparatorThreePoints = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int res1 = o1.getItemName().compareTo(o2.getItemName());
                int res2 = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                if (res1 == 0) {
                    if (res2 == 0) {
                        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                    }
                    return res2;
                }
                return res1;
            }
        };
        orders.sort(comparatorThreePoints);
        System.out.println("\nSorting by Order itemName AND Order ShopIdentificator AND User city:\n" + orders);

        // delete duplicates from the list (add equals and hashcode for order)
        Set<Order> orderSet = new HashSet<>(orders);
        System.out.println("Orders without duplicates:\n" + orderSet);

        // delete items where price less than 1500
        List<Order> cheapOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.getPrice() < 1500) {
                cheapOrders.add(order);
            }
        }
        List<Order> expensiveOrders = new ArrayList<>(orders);
        expensiveOrders.removeAll(cheapOrders);
        System.out.println("\nOrders with price more than 1500:\n"+expensiveOrders);

        // separate list for two list - orders in USD and UAH
        List<Order> ordersInUSD = new ArrayList<>();
        List<Order> ordersInUAH = new ArrayList<>();
        List<List<Order>> ordersByCurrency = new ArrayList<>();
        ordersByCurrency.add(ordersInUSD);
        ordersByCurrency.add(ordersInUAH);
        for (Order order : orders) {
            if (order.getCurrency() == Currency.USD) {
                ordersInUSD.add(order);
            } else {
                ordersInUAH.add(order);
            }
        }
        System.out.println("\nOrders which are separated by currency:\n" + ordersByCurrency);

        // separate list for as many lists as many unique cities are in User
        List<List<User>> result = new ArrayList<>();    // initialization of list which contain the lists by city
        Comparator<User> comparatorByCity = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getCity().compareTo(o2.getCity());
            }
        };
        Set<User> set1 = new TreeSet<>(comparatorByCity);   // initialization of sorted set which contain unique cities using comparatorByCity
        set1.addAll(users);                                 // get set with unique cities
        List<User> uniqueCities = new ArrayList<>(set1);    // converting set to list for possibility to get unique city
        int i = 0;
        while (i <= uniqueCities.size() - 1) {              // for every unique city
            List<User> temp = new ArrayList<>(0);           // create new temporary list
            result.add(temp);                               // and adding it to resulting list
            for (User user : users) {                                           // for every user
                if (user.getCity().equals(uniqueCities.get(i).getCity())) {     // compare it city with current unique city
                    temp.add(user);                                             // if they are equals, adding this user to temporary list
                }
            }
            i++;
        }
        System.out.println("\nUsers which are separated by cities:\n" + result);
    }
}

