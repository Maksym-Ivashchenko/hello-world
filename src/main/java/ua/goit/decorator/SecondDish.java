package ua.goit.decorator;

public class SecondDish implements IFood {
    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String prepareFood() {
        return "Potatoes";
    }
}
