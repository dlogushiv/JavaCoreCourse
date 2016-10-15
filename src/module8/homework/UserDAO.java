package module8.homework;

import java.util.List;

public class UserDAO extends AbstractDAOImpl
        implements AbstractDAO {
    List<User> userDB = db;

    @Override
    public Object save(Object o) {
        return super.save(o);
    }

    @Override
    public void delete(Object o) {
        super.delete(o);
    }

    @Override
    public void deleteAll(List T) {
        super.deleteAll(T);
    }

    @Override
    public void saveAll(List T) {
        super.saveAll(T);
    }

    @Override
    public List getList() {
        return super.getList();
    }

    @Override
    public void deleteById(long id) {
        for (int i = 0; i < userDB.size(); i++) {
            if (userDB.get(i) != null && id == userDB.get(i).getId()) userDB.remove(i);
        }
    }

    @Override
    public User get(long id) {
        for (int i = 0; i < userDB.size(); i++) {
            if (id == userDB.get(i).getId()) return userDB.get(i);
        }
        System.out.println("User with id " + id + " not found.");
        return null;
    }

    @Override
    public String toString() {
        return "userDB=" + userDB +
                '}';
    }
}
