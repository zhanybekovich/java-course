import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Ternary operator
        int score = 140;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

        int number = 4;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);

        int hours = 22;
        String timeOfDay = (hours < 12) ? "AM" : "PM";
        System.out.println(timeOfDay);

        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}