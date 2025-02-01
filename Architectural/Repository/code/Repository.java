import java.util.List;

// public interface Repository<T> {
//     List<T> readAll();

//     T read(Criteria criteria);

//     T create(T entity);

//     T delete(T entity);

//     T update(T entity);
// }

public interface Repository<T, K> {
    List<T> readAll();

    T read(K id);

    T create(T entity);

    T delete(T entity);

    T update(T entity);
}