package ua.goit;

import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello. Please follow steps below.");
        System.out.println("Input your e-mail:");
        String email = scanner.nextLine();
        System.out.println("Input your name:");
        String name = scanner.nextLine();
        System.out.println("Input your gender:");
        String gender = scanner.nextLine();
        System.out.println("Input your age:");
        int age = scanner.nextInt();
        System.out.println("Input your height in meters (e.g. 1,92):");
        float height = scanner.nextFloat();
        System.out.println("Thank you " + name + ". Your e-mail: " + email + ", gender - " + gender + ", age - " +
                            age + ", height - " + height + " m.");
    }
}
