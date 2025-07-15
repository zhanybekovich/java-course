import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // printf => is a method used to format output
        // %[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        // string format specifier
        System.out.printf("Hello, %s\n", name);

        // character format specifier
        System.out.printf("Your name starts with a %c\n", firstLetter);

        // integer format specifier
        System.out.printf("Your age is %d\n", age);

        // double format specifier
        System.out.printf("Your height is %f\n", height);

        // limit digits
        System.out.printf("Your height is %.1f\n", height);
        System.out.printf("Your height is %.2f\n", height);
        System.out.printf("Your height is %.3f\n", height);

        // flags
        // symbol: negative or positive
        System.out.printf("Your height is %+.1f\n", height);

        // , => comma grouping separator
        System.out.printf("Your height is %,.1f\n", height);

        // space => display a minus if negative, space if positive
        System.out.printf("Your height is % .1f\n", height);

        // 0 => zero padding
        int id1 = 1;
        int id2 = 23;
        int id3 = 422;
        int id4 = 5559;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        // number => right justified padding
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        // negative number => left justified padding
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

        // boolean format specifier
        System.out.printf("Employed %b\n", isEmployed);

        // several formats
        System.out.printf("%s is %d years old", name, age);
        scanner.close();
    }
}