package module5.homework;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(1L, 200, 3, new Date(), "Solnishko", "Alupka");
        Room room2 = new Room(2L, 200, 3, new Date(), "Solnishko", "Alupka");
        System.out.println(room1.equals(room2));

    }
}
