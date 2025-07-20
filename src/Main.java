import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // varargs = allow a method to accept a varying # of arguments
        // makes methods more flexible, no need for overloaded methods
        // java will pack the arguments into an array

        add(1);
        add(1, 2);
        add(1, 2, 3);

        System.out.println(average());
        System.out.println(average(1));
        System.out.println(average(1, 2));
        System.out.println(average(1, 2, 3));
        
    }

    static void add(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }

    static double average(double... numbers) {
        double sum = 0;

        if (numbers.length == 0) {
            return 0;
        }

        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }
}