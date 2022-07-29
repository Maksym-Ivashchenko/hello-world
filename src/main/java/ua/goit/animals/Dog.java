package ua.goit.animals;

public class Dog extends Animal<DogDescription> {

    @Override
    public String voice() {
        return "gav";
    }

    @Override
    public DogDescription description() {
        return new DogDescription();
    }
}