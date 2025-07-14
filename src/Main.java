import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Arithmetic Operators

        int x = 10;
        int y = 3;
        int z;

        z = x + y;
        z = x - y;
        z = x * y;
        z = x / y;
        z = x % y;

        // Augmented Assignment Operators
        x += 3;
        x -= 3;
        x *= 3;
        x /= 3;
        x %= 3;

        // Increment and Decrement
        int a = 1;
        a++;

        int b = 2;
        b--;

        // Order of Operations PENDAS:
        // Parenthesis
        // Exponent
        // Multiplication
        // Division
        // Addition
        // Subtraction

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);
    }
}