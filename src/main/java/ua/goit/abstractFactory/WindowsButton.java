package ua.goit.abstractFactory;

public class WindowsButton implements Button {
    @Override
    public void handleButton() {
        System.out.println("Handle Windows Button !");
    }
}
