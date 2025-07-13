import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);

        // reading string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        // reading integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);

        // reading double
        System.out.print("What is the price: ");
        double price = scanner.nextDouble();
        System.out.println("Price is: " + price);

        // reading boolean
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("You are a student: " + isStudent);

        // clean the buffer
        scanner.nextLine();
        
        scanner.close();
    }
}