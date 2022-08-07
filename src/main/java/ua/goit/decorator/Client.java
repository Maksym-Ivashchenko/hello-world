package ua.goit.decorator;

public class Client {

    public static void main(String[] args) {
        IFood food = new Fish(new Ketchup(new Sauce(new SecondDish())));
        print(food);
    }

    public static void print(IFood food) {
        System.out.println(food.prepareFood() + " -> " + food.getPrice());
    }
}
