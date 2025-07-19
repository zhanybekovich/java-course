import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name = "John";
        int age = 20;

        happyBirthday(name, age);
        happyBirthday("Bob", 10);

        System.out.println(square(3));
        System.out.println(cube(3));

        System.out.println(getFullName("John", "Doe"));

        if (isAdult(19)) {
            System.out.println("You can get a credit card!");
        } else {
            System.out.println("You can not get a credit card!");
        }

    }

    // method - a block of reusable code that is executed when called()
    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s! \n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }

    // methods returning data
    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    static boolean isAdult(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}