package ua.goit;

public class Cat extends Animal{

    @Override
    public String voice() {
        return "mur";
    }
}

class TestAnimal {
    public static void main(String[] args) {

//        Animal[]animals = new Animal[2];
//
//        animals[0] = new Cat();
//        animals[0].setName("Cubic");
//        animals[0].move(2,3);
//        System.out.println(animals[0]);
//        animals[0].move(2,4);
//        System.out.println(animals[0]);
//        voice(animals[0]);
//
//        animals[1] = new Dog();
//        animals[1].setName("Sharik");
//        animals[1].move(3,5);
//        System.out.println(animals[1]);
//        animals[1].move(2,1);
//        System.out.println(animals[1]);
//        voice(animals[1]);
//        voice(animals);

        Animal animal = Animal.of();
        System.out.println(animal.voice());
    }

    public static void voice(Animal ... animals) {
        for (Animal animal: animals) {
            System.out.println(animal.voice());
            System.out.println(animal.test());
        }

    }
}
