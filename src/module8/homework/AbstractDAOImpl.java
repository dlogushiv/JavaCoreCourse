package module8.homework;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO<T> {
    List<T> db = new ArrayList<>();


    @Override
    public T save(T t) {
        if (t != null) {
            db.add(t);
            return t;
        } else return t;
    }

    @Override
    public void delete(T t) {
        for (int i = 0; i < db.size(); i++) {
            if (db.get(i).equals(t)) db.remove(i);
        }
    }

    @Override
    public void deleteAll(List T) {
        db.removeAll(T);
    }

    @Override
    public void saveAll(List T) {
        db.addAll(T);
    }

    @Override
    public List<T> getList() {
        return db;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public T get(long id) {
        return null;
    }

    @Override
    public String toString() {
        return "db=" + db +
                '}';
    }
}
