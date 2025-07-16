import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // .substring() = a method used to extract a portion of a string
        // string.substring(start, end)

        Scanner sc = new Scanner(System.in);

        String email;
        System.out.print("Enter your email: ");
        email = sc.nextLine();

        if (email.contains("@")) {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        } else {
            System.out.println("Invalid email!");
        }


        sc.close();
    }
}