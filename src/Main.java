import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // entering user input into an array
        // set the size of an array
        // String[] foods = new String[3];

        String[] foods;

        System.out.print("What number food do you want?: ");
        int size = sc.nextInt();
        // clean buffer
        sc.nextLine();

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = sc.nextLine();
        }

        for (String food : foods) {
            System.out.println(food);
        }


        sc.close();
    }


}