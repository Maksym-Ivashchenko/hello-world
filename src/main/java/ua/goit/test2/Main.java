package ua.goit.test2;

public class Main {

    public static void main(String[] args) {
        String[] array = {"1", "2", "3"};
        ArrayWrapper arrayWrapper = new ArrayWrapper(array);
        StringWrapper stringWrapper = new StringWrapper("value");

        print(arrayWrapper);
        print(stringWrapper);

    }

    public static void print(Iterable args) {
        while (args.haseNext()) {
            System.out.println(args.next());
        }
    }
}
