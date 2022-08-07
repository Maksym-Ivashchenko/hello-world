package ua.goit.decorator;

public abstract class AFoodDecorator implements IFood {
    private final IFood food;

    public AFoodDecorator(IFood food) {
        this.food = food;
    }

    @Override
    public int getPrice() {
        return food.getPrice();
    }

    @Override
    public String prepareFood() {
        return food.prepareFood();
    }
}
