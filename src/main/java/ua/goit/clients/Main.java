package ua.goit.clients;

import ua.goit.abstractFactory.Factory;

public class Main {

    public static void main(String[] args) {

//        ColorEnum color = ColorEnum.BLUE;
//        ColorEnum[] values = ColorEnum.values();
//        ColorEnum blue = ColorEnum.valueOf("BLUE");
//        color.getColor();
//        color.getNumber();
//        int ordinal = color.ordinal(); //возвращает индекс ENUMa

        Factory factory = Factory.of();
        factory.createButton().handleButton();
        factory.createPanel().handlePanel();
        factory.createScroll().handleScroll();

    }
}
