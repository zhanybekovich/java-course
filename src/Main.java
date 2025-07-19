import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // nested loops
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int rows;
        int cols;
        char symbol;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        cols = sc.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = sc.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }


        sc.close();

    }
}