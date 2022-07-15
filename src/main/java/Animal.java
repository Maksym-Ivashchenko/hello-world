package src.main.java;

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

    protected abstract String voice ();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
