package src.main.java;

import java.util.Objects;

public abstract class Animal {

    private String name;
    private int x;
    private int y;

    public void move (int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String test() {
        String test = "...";
        test = test + voice();
        return test;
    }

    protected abstract String voice ();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return x == animal.x && y == animal.y && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hash(this.name);
        hash = 41 * hash + this.x;
        hash = 41 * hash + this.y;
        return hash;
    }
}
