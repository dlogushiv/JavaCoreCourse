package module9.homework;

import module7.homework.Currency;
import module7.homework.Order;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utils {
    public void sortByPriceDesc(List<Order> list) {
        System.out.println("\n\tSort list by Order price in decrease order");

        // variant 1 with Stream object and comparator
//        Stream<Order> str = list.stream().sorted(new Comparator<Order>() {
//            @Override
//            public int compare(Order o1, Order o2) {
//                return Integer.compare(o2.getPrice(), o1.getPrice());
//            }
//        });

        // variant 2 with Stream object and lambda
//        Stream<Order> str = list.stream().sorted(((o1, o2) -> Integer.compare(o2.getPrice(),o1.getPrice())));
//        str.forEach(order -> System.out.print(order));

        // variant 3 in one row with lambda and without Stream object
        list.stream().sorted(((o1, o2) -> Integer.compare(o2.getPrice(), o1.getPrice()))).forEach(System.out::print);
    }

    public void sortByPriceAscAndCity(List<Order> list) {
        System.out.println("\n\tSort list by Order price in increase order AND User city");
        Stream<Order> str = list.stream().sorted((o1, o2) -> {
            if (Integer.compare(o1.getPrice(), o2.getPrice()) != 0)
                return Integer.compare(o1.getPrice(), o2.getPrice());
            else return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        });
        str.forEach(System.out::print);
    }

    public void sortByThreePoints(List<Order> list) {
        System.out.println("\n\tSort list by Order itemName AND ShopIdentificator AND User city");
        Stream<Order> str = list.stream().sorted((o1, o2) -> {
            if (o1.getItemName().compareTo(o2.getItemName()) == 0) {
                if (o1.getShopIdentificator().compareTo(o2.getShopIdentificator()) == 0) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
                return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            }
            return o1.getItemName().compareTo(o2.getItemName());
        });
        str.forEach(System.out::print);
    }

    public void deleteDuplicates(List<Order> list) {
        System.out.println("\n\tDelete duplicates from the list");
        list.stream().distinct().forEach(System.out::print);
    }

    public void cheapOrders(List<Order> list) {
        System.out.println("\n\tDelete items where price less than 1500");
        list.stream().filter(order -> order.getPrice() > 1500).forEach(System.out::print);
    }

    public void ordersByCurrency(List<Order> list) {
        System.out.println("\n\tSeparate list for two list - orders in USD and UAH");
        System.out.println("Orders in USD:");
        list.stream().filter(order -> order.getCurrency() == Currency.USD).forEach(System.out::print);
        System.out.println("Orders in UAH:");
        list.stream().filter(order -> order.getCurrency() == Currency.UAH).forEach(System.out::print);
    }

    public void uniqueCities(List<Order> list) {
        System.out.println("\n\tSeparate list for as many lists as many unique cities are in User");
//        // variant 1 with loop
//        Set<Order> set = new TreeSet<>(((o1, o2) -> o1.getUser().getCity().compareTo(o2.getUser().getCity())));
//        set.addAll(list);
//        List<Order> cities = new ArrayList<>(set);
//        int i = 0;
//        while (i < set.size()) {
//            String city = cities.get(i).getUser().getCity();
//            System.out.println((i + 1) + ") Orders from city " + city + ":");
//            list.stream().filter(order -> order.getUser().getCity().equals(city)).forEach(System.out::print);
//            i++;
//        }

//        // variant 2 with Map object
//        Map<String, List<Order>> byCities = list.stream().collect(Collectors.groupingBy(order -> order.getUser().getCity()));
//        System.out.println(byCities);

//        // variant 3 without Map object
        list.stream().collect(Collectors.groupingBy(order -> order.getUser().getCity())).forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });
    }

    public void userLastNameChecking(List<Order> list, String lastName) {
        System.out.println("\n\tCheck if set contain Order where User’s lastName is - “" + lastName + "”");
        System.out.println(list.stream().anyMatch(order -> order.getUser().getLastName().equals(lastName)));
    }

    public List<Order> onlyUAHOrders(List<Order> list) {
        System.out.println("\n\tDelete orders where currency is USD");
        return list.stream().filter(order -> order.getCurrency() == Currency.UAH).collect(Collectors.toList());
    }
}
