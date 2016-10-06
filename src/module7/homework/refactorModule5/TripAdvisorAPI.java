package module7.homework.refactorModule5;

import java.util.ArrayList;
import java.util.Date;

public class TripAdvisorAPI implements API {
    ArrayList<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {
        rooms.add(new Room(21L, 300, 2, new Date(), "FunnyHolidays", "Stambul"));
        rooms.add(new Room(22L, 450, 3, new Date(), "SunClub", "Rome"));
        rooms.add(new Room(23L, 180, 2, new Date(), "YellowSand", "Odessa"));
        rooms.add(new Room(24L, 500, 3, new Date(), "FunnyHolidays", "Stambul"));
        rooms.add(new Room(25L, 300, 2, new Date(), "ShoPopaloResort", "Stambul"));
    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> outRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getPrice() == price && room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                outRooms.add(room);
            }
        }
        return outRooms;
    }

    @Override
    public ArrayList<Room> getAllRooms() {
        ArrayList<Room> allRooms = new ArrayList<>();
        for (Room room : rooms) {
            allRooms.add(room);
        }
        return allRooms;
    }
}
