import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Runtime polymorphism = when the method that gets executed is decided
        // at runtime based on the actual type of the object.

        Animal animal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Would you like a dog or a cat? (1 - Dog, 2 - Cat): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }

        sc.close();

    }

}