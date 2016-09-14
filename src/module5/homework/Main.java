package module5.homework;

import java.util.Date;

public class Main {

    static void getRooms(Room[] rooms) {
        for (Room room : rooms) {
            if (room != null) {
                System.out.println(room);
            }
        }
    }


    public static void main(String[] args) {
//        Room room1 = new Room(1L, 200, 3, new Date(), "Solnishko", "Alupka");
//        Room room2 = new Room(2L, 200, 3, new Date(), "Solnishko", "Alupka");
//        System.out.println(room1.equals(room2));


        Room[] roomsBooking = new BookingComAPI().findRooms(300, 2, "Stambul", "FunnyHolidays");
        Room[] roomsTrAdv = new TripAdvisorAPI().findRooms(300, 2, "Stambul", "FunnyHolidays");
        Room[] roomsGoogle = new GoogleAPI().findRooms(300, 2, "Stambul", "FunnyHolidays");
        getRooms(roomsBooking);
        getRooms(roomsTrAdv);
        getRooms(roomsGoogle);

        DAOImpl dao = new DAOImpl();
        dao.findById(234);
        for (Room room : roomsBooking) {
            if (room != null) {
                dao.save(room);
                dao.update(room);
                dao.delete(room);
            }
        }

    }
}
