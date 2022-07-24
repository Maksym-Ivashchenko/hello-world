package ua.goit.module8homework;

public class Service {

    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Quad();
        Shape shape3 = new Cylinder();
        Shape shape4 = new Cub();
        Shape shape5 = new Rhombus();
        Shape shape6 = new Sphere();

        System.out.println(shape1.getShapeName());
        System.out.println(shape2.getShapeName());
        System.out.println(shape3.getShapeName());
        System.out.println(shape4.getShapeName());
        System.out.println(shape5.getShapeName());
        System.out.println(shape6.getShapeName());
    }
}
