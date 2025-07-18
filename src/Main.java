import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Enhanced switch = a replacement to many else if statements

        Scanner sc = new Scanner(System.in);
        String day;

        System.out.print("Enter the day of the week: ");
        day = sc.nextLine();

//        switch (day) {
//            case "Monday" -> System.out.println("It is a weekday 😭");
//            case "Tuesday" -> System.out.println("It is a weekday 😭");
//            case "Wednesday" -> System.out.println("It is a weekday 😭");
//            case "Thursday" -> System.out.println("It is a weekday 😭");
//            case "Friday" -> System.out.println("It is a weekday 😭");
//            case "Saturday" -> System.out.println("It is a weekend 😛");
//            case "Sunday" -> System.out.println("It is a weekend 😛");
//            default -> System.out.println("Invalid day");
//        }

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday 😭");
            case "Saturday", "Sunday" -> System.out.println("It is a weekend 😛");
            default -> System.out.println("Invalid day");
        }

        sc.close();
    }
}