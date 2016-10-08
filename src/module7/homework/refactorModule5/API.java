package module7.homework.refactorModule5;

import java.util.ArrayList;

public interface API {
    ArrayList<Room> findRooms(int price, int persons, String city, String hotel);

    ArrayList<Room> getAllRooms();
}
