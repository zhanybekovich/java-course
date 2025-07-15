import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Compound interest calculator
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.println("Enter the rate: ");
        rate = scanner.nextDouble() / 100;

        System.out.println("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.println("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("Your amount after %d years is $%.2f", years, amount);
        scanner.close();

    }
}