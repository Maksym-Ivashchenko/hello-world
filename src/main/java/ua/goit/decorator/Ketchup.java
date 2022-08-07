package ua.goit.decorator;

public class Ketchup extends AFoodDecorator {
    public Ketchup(IFood food) {
        super(food);
    }

    @Override
    public int getPrice() {
        return super.getPrice()+5;
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with ketchup";
    }
}
