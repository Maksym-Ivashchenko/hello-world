package ua.goit.animals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AnimalServiceImplement<V extends Animal> implements AnimalService<V> {

    private DataBase<V> dataBase;

    @Override
    public Long save(V value) {
        return dataBase.save(value);
    }

    @Override
    public V delete(Long id) {
        return dataBase.delete(id);
    }

    @Override
    public V findById(Long id) {
        return dataBase.findById(id);
    }

    @Override
    public Collection<V> findAll() {
        return dataBase.findAll();
    }

    protected List<Animal> findByName (String name) {
        Collection<V> animals = findAll();
        List<Animal> result = new ArrayList<>();
        for (Animal animal :
                animals) {
            if (animal.getName().equals(name)) {
                result.add(animal);
            }
        }
        return result;
    }
}
