import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // For loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("=======");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("=======");

        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("=======");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }

        System.out.println("=======");

        // Countdown project
        System.out.print("How many seconds to countdown from: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("BOOM!");

        scanner.close();

    }
}