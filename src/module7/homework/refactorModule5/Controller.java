package module7.homework.refactorModule5;

import java.util.ArrayList;

public class Controller {
    private ArrayList<API> apis = new ArrayList<>();
    public ArrayList<Room> result;

    public Controller(ArrayList<API> apis) {
        this.apis = apis;
    }

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        apis.add(bookingComAPI);
        apis.add(tripAdvisorAPI);
        apis.add(googleAPI);
    }

    public ArrayList<Room> requestRooms(int price, int persons, String city, String hotel) {
        result = new ArrayList<>();
        for (API api : apis) {
            ArrayList<Room> apiFindRooms = api.findRooms(price, persons, city, hotel);
            if (apiFindRooms != null) {
                for (Room room : apiFindRooms) {
                    if (room != null) {
                        result.add(room);
                    }
                }
            }
        }
        if (!result.isEmpty()) {
            DAOImpl dao = new DAOImpl();
            for (Room room:result) {
                dao.save(room);
            }
            return result;
        } else {
            System.out.println("There are no results by your request!");
            return null;
        }
    }

    public ArrayList<Room> check(API api1, API api2) {
        result = new ArrayList<>();
        ArrayList<Room> res1 = api1.getAllRooms();
        ArrayList<Room> res2 = api2.getAllRooms();

        for (Room roomRes1 : res1) {
            for (Room roomRes2 : res2) {
                if (roomRes1.equals(roomRes2)) {
                    System.out.println("The rooms with ID " + roomRes1.getId() + " and " + roomRes2.getId() + " are identical.");
                    result.add(roomRes1);
                    result.add(roomRes2);
                }
            }
        }
        if (!result.isEmpty()) {
            return result;
        } else {
            System.out.println("There are no results by your checking!");
            return null;
        }
    }

    @Override
    public String toString() {
        return result.toString();
    }
}
