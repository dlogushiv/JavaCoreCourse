package module5.homework;

import java.util.Arrays;

public class Controller {
    private API[] apis = new API[3];
    public Room[] result;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        apis[0] = bookingComAPI;
        apis[1] = tripAdvisorAPI;
        apis[2] = googleAPI;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int i = 0;
        Room[] tempResult = new Room[100];

        for (API api : apis) {
            Room[] apiFindRooms = api.findRooms(price, persons, city, hotel);
            if (apiFindRooms != null) {
                for (Room room : apiFindRooms) {
                    if (room != null) {
                        tempResult[i] = room;
                        i++;
                    }
                }
            }
        }
        if (i != 0) {
            result = new Room[i];
            DAOImpl dao = new DAOImpl();
            for (int j = 0; j < result.length; j++) {
                result[j] = tempResult[j];
                dao.save(result[j]);
            }
            return result;
        } else {
            System.out.println("There are no results by your request!");
            return null;
        }
    }

    public Room[] check(API api1, API api2) {
        int i = 0;
        Room[] tempResult = new Room[100];
        Room[] res1 = api1.getAllRoos();
        Room[] res2 = api2.getAllRoos();

        for (Room roomRes1 : res1) {
            for (Room roomRes2 : res2) {
                if (roomRes1.equals(roomRes2)) {
                    System.out.println("The rooms with ID " + roomRes1.getId() + " and " + roomRes2.getId() + " are identical.");
                    tempResult[i] = roomRes1;
                    i++;
                    tempResult[i] = roomRes2;
                    i++;
                }
            }
        }
        if (i != 0) {
            result = new Room[i];
            for (int j = 0; j < result.length; j++) {
                result[j] = tempResult[j];
            }
            return result;
        } else {
            System.out.println("There are no results by your checking!");
            return null;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(result);
    }
}
