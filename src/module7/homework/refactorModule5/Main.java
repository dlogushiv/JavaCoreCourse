package module7.homework.refactorModule5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Controller test = new Controller();
        test.requestRooms(300, 2, "Stambul", "FunnyHolidays");
        System.out.println();
        test.requestRooms(180, 2, "Odessa", "YellowSand");
        System.out.println();
        test.requestRooms(450, 3, "Rome", "SunClub");
        System.out.println();

        API api1 = new BookingComAPI();
        API api2 = new TripAdvisorAPI();
        API api3 = new GoogleAPI();
        test.check(api1, api2);
        System.out.println();
        test.check(api1, api3);
        System.out.println();
        test.check(api2, api3);

    }
}
