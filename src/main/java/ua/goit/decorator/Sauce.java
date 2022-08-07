package ua.goit.decorator;

public class Sauce extends AFoodDecorator {
    public Sauce(IFood food) {
        super(food);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 10;
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with sauce";
    }
}
