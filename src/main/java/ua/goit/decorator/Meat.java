package ua.goit.decorator;

public class Meat extends AFoodDecorator {
    public Meat(IFood food) {
        super(food);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 100;
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with meat";
    }
}
