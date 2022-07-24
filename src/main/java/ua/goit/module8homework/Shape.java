package ua.goit.module8homework;

public class Shape implements IShape{

    @Override
    public String toString() {
        return "Some shape";
    }

    @Override
    public String getShapeName() {
        return toString();
    }
}
