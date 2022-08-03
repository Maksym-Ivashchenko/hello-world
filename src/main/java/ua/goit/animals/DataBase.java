package ua.goit.animals;

import java.util.*;

public class DataBase<V>  {
    private Map<Long, V> map = new HashMap<>();
    private static Long id = 0L;

    public Long save(V value) {
        map.put(id++, value);
        return id - 1;
    }
    public V delete(Long id) {
        return map.remove(id);
    }
    public V findById(Long id) {
        return map.get(id);
    }
    public Collection<V> findAll () {
        return map.values();
    }

}
