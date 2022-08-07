package ua.goit.javarush.task12;

public class Human {
    private String name;
    private String surname;
    private int age;
    private double weight;
    private double height;
    private String gender;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Human(String name, String surname, int age, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, String surname, int age, double weight, double height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Human(String name, String surname, int age, double weight, double height, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Human(double height) {
        this.height = height;
    }

    public Human() {
    }
}
