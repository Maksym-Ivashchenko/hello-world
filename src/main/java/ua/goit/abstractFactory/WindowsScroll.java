package ua.goit.abstractFactory;

public class WindowsScroll implements Scroll {
    @Override
    public void handleScroll() {
        System.out.println("Handle Windows Scroll !");
    }
}