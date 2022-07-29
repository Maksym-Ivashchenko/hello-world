package ua.goit.test;

public class Person {
    private String name;
    private String surname;
    private int ages;
    private String test;

    public Person() {
        this.test = "sr. ";
    }

    public Person(String name, String surname, int ages) {
        this();
        this.name = name;
        this.surname = surname;
        this.ages = ages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    @Override
    public String toString() {
        return "Person " + test + name + " " + surname + ", ages=" + ages + ".";
    }
}

class TestPerson {

    public static void main(String[] args) {

        Person p1 = new Person("Vasia", "Pipkin", 18);

        Person p2 = new Person("Dima", "Ivanov", 20);

        System.out.println(p1);
        System.out.println(p2);
    }
}