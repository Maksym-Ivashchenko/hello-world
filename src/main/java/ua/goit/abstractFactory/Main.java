package ua.goit.abstractFactory;

public class Main {

    public static void main(String[] args) {

        Factory factory = Factory.of();
        System.out.println(factory.createButton());
        System.out.println(factory.createPanel());
        System.out.println(factory.createScroll());

    }
}
