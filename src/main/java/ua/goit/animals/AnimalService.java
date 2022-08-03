package ua.goit.animals;

import java.util.Collection;

public interface AnimalService<V extends Animal> {

    Long save(V value);
    V delete(Long id);
    V findById(Long id);
    Collection<V> findAll ();

}
