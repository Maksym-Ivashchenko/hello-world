package ua.goit.clients;

public enum ColorEnum {
    BLUE(0,"#F2345"),
    RED(1,"#E2345"),
    GREEN(2,"#D2345");

    private final int number;
    private final String color;

    ColorEnum(int number, String color) {
        this.number = number;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }
}
