package module7.homework.refactorModule5;

import java.util.Date;

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("A room with ID " + room.getId() + " was SAVED to DB.");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("A room with ID " + room.getId() + " was DELETED from DB.");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("A room with ID " + room.getId() + " was UPDATED in DB.");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(id, 0, 0, new Date(), null, null);
        System.out.println("A room with ID " + room.getId() + " was FOUND in DB.");
        return room;
    }
}
