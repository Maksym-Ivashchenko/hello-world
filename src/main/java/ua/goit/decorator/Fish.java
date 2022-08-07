package ua.goit.decorator;

public class Fish extends AFoodDecorator {
    public Fish(IFood food) {
        super(food);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 50;
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with fish";
    }
}
