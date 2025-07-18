import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // While loop
        Scanner sc = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) {
            System.out.print("Please enter your name: ");
            name = sc.nextLine();
        }

        System.out.println("Hello, " + name + "!");

        System.out.println("======");

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("You are playing a game!");
            System.out.print("Press Q to quit: ");
            response = sc.nextLine().toUpperCase();

        }

        System.out.println("You have quit the game!");

        System.out.println("========");

        // do while
        int age;

        do {
            System.out.println("Your age can't be negative!");
            System.out.print("Enter your age: ");
            age = sc.nextInt();
        } while (age < 0);

        System.out.println("You are " + age + " years old!");

        System.out.println("========");

        int number = 0;

        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = sc.nextInt();

        } while (number < 1 || number > 10);

        System.out.println("You picked " + number + "!");

        System.out.println("=====");
        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}