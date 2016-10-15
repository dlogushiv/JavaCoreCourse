package module8.homework;

import java.util.List;

public interface AbstractDAO<T> {
    T save(T t);

    void delete(T t);

    void deleteAll(List T);

    void saveAll(List T);

    List<T> getList();

    void deleteById(long id);

    T get(long id);
}
