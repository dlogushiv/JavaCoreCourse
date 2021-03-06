package module5.homework;

import java.util.Date;

public class BookingComAPI implements API {
    Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(11L, 300, 2, new Date(), "FunnyHolidays", "Stambul");
        rooms[1] = new Room(12L, 450, 3, new Date(), "SunClub", "Rome");
        rooms[2] = new Room(13L, 180, 2, new Date(), "YellowSand", "Odessa");
        rooms[3] = new Room(14L, 500, 3, new Date(), "FunnyHolidays", "Stambul");
        rooms[4] = new Room(15L, 300, 2, new Date(), "ShoPopaloResort", "Stambul");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] outRooms = new Room[rooms.length];
        int k = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName() == city && rooms[i].getHotelName() == hotel) {
                outRooms[k] = rooms[i];
                k++;
            }
        }
        return outRooms;
    }

    @Override
    public Room[] getAllRoos() {
        Room[] allRooms = new Room[rooms.length];
        for (int i = 0; i < rooms.length; i++) {
            allRooms[i] = rooms[i];
        }
        return allRooms;
    }
}
