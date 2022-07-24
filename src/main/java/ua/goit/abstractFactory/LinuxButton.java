package ua.goit.abstractFactory;

public class LinuxButton implements Button {
    @Override
    public void handleButton() {
        System.out.println("Handle Linux Button !");
    }
}
