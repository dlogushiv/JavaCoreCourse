package module7.homework.refactorModule5;

import java.util.ArrayList;
import java.util.Date;

public class GoogleAPI implements API {
    ArrayList<Room> rooms = new ArrayList<>();

    public GoogleAPI() {
        rooms.add(new Room(31L, 300, 2, new Date(), "FunnyHolidays", "Stambul"));
        rooms.add(new Room(32L, 450, 3, new Date(), "SunClub", "Rome"));
        rooms.add(new Room(33L, 180, 2, new Date(), "YellowSand", "Odessa"));
        rooms.add(new Room(34L, 500, 3, new Date(), "FunnyHolidays", "Stambul"));
        rooms.add(new Room(35L, 300, 2, new Date(), "ShoPopaloResort", "Stambul"));
    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> outRooms = new ArrayList<>();
        for (Room room: rooms) {
            if (room.getPrice() == price && room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                outRooms.add(room);
            }
        }
        return outRooms;
    }

    @Override
    public ArrayList<Room> getAllRooms() {
        ArrayList<Room> allRooms = new ArrayList<>();
        for (Room room: rooms) {
            allRooms.add(room);
        }
        return allRooms;
    }
}
