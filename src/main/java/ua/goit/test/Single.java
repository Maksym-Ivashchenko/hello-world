package ua.goit.test;

public class Single implements Cloneable{
    private final static Single single;
    private String name;
    static {
        single = new Single();
        single.name = "";
        //todo
    }

    private Single() {}

    public static Single create() {
        return single;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class SingleTest {

    public static int factorial(int n) {
        int ret = 1;
        for (int i = 1; i <= n; i++) ret *= i;
        return ret;
    }

    public static int factorial1(int n) {
        if (n == 0) {
            return 1;
        } return n * factorial1(n - 1);
    }


    public static void main(String[] args) {
        Single single1 = Single.create();
        Single single2 = Single.create();
        System.out.println(factorial(5));
        System.out.println(factorial1(5));
    }

}
