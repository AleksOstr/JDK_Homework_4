import java.util.Collection;

public interface Database<T> {

    void addNew(T item);

    T findById(int id);

    Collection<String> findPhoneByName(String name);

    Collection<T> findByExperience(int experience);

}
