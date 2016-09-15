package module5.homework;

import java.util.Date;

public class Main {

//    static void getRooms(Room[] rooms) {
//        for (Room room : rooms) {
//            if (room != null) {
//                System.out.println(room);
//            }
//        }
//    }


    public static void main(String[] args) {
//        Room room1 = new Room(1L, 200, 3, new Date(), "Solnishko", "Alupka");
//        Room room2 = new Room(2L, 200, 3, new Date(), "Solnishko", "Alupka");
//        System.out.println(room1.equals(room2));


//        Room[] roomsBooking = new BookingComAPI().findRooms(300, 2, "Stambul", "FunnyHolidays");
//        Room[] roomsTrAdv = new TripAdvisorAPI().findRooms(300, 2, "Stambul", "FunnyHolidays");
//        Room[] roomsGoogle = new GoogleAPI().findRooms(300, 2, "Stambul", "FunnyHolidays");
//        getRooms(roomsBooking);
//        getRooms(roomsTrAdv);
//        getRooms(roomsGoogle);
//
//        DAOImpl dao = new DAOImpl();
//        dao.findById(234);
//        for (Room room : roomsBooking) {
//            if (room != null) {
//                dao.save(room);
//                dao.update(room);
//                dao.delete(room);
//            }
//        }

        Controller test = new Controller();
        test.requestRooms(300, 2, "Stambul", "FunnyHolidays");
        System.out.println();
        test.requestRooms(180, 2, "Odessa", "YellowSand");
        System.out.println();
        test.requestRooms(450, 3, "Rome", "SunClub");
        System.out.println();
//        System.out.println(test);

        API api1 = new BookingComAPI();
        API api2 = new TripAdvisorAPI();
        API api3 = new GoogleAPI();
        test.check(api1, api2);
        System.out.println();
        test.check(api1, api3);
        System.out.println();
        test.check(api2, api3);
//        System.out.println(test);


    }
}
