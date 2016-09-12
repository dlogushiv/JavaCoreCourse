package module5.homework;

import java.util.Date;

public class TripAdvisorAPI implements API {
    Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        rooms[0] = new Room(2011L, 310, 2, new Date(), "FunnyHolidays", "Stambul");
        rooms[1] = new Room(2012L, 450, 3, new Date(), "SunClub", "Rome");
        rooms[2] = new Room(2013L, 180, 2, new Date(), "YellowSand", "Odessa");
        rooms[3] = new Room(2014L, 500, 3, new Date(), "FunnyHolidays", "Stambul");
        rooms[4] = new Room(2015L, 300, 2, new Date(), "ShoPopaloResort", "Stambul");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] outRooms = new Room[rooms.length];
        int k = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (new Room(1, price, persons, new Date(), hotel, city).equals(rooms[i])) {
                outRooms[k] = rooms[i];
                k++;
            }
        }
        return outRooms;
    }
}
