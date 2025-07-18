import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Logical Operators
        // && -> AND
        // || -> OR
        // ! -> NOT
        Scanner sc = new Scanner(System.in);

        double temp = 25;
        boolean isSunny = true;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is good!");
            System.out.println("It is sunny!");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is good!");
            System.out.println("It is cloudy!");
        } else if (temp >= 30 || temp < 0) {
            System.out.println("The weather is bad!");
        }

        System.out.println("========");

        String username;

        System.out.print("Enter your username: ");
        username = sc.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4 and 12 characters!");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or _!");

        } else {
            System.out.println("Welcome " + username);
        }
        sc.close();
    }
}