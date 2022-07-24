package ua.goit;

public class Test {

    public static void main(String[] args) {
        try {
            System.out.println(main(2,0));
        } catch (ArithmeticException ex) {
            System.out.println("*******************");
            System.out.println(ex);
        } finally {
            System.out.println("SUCCESS!!!");
        }

    }

    public static int main(int a, int b) {
        return a / b;
    }
}
