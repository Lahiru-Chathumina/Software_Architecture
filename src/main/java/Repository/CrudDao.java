package Repository;

import java.util.List;

public interface CrudDao<T,ID> extends SuperDao {
    boolean Save(T entiy);
    T search (ID id);
    //List <T>get All();

}
