import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // String methods
        String name = "John Doe";

        // length
        int length = name.length();
        System.out.println(length);

        // charAt
        char letter = name.charAt(0);
        System.out.println(letter);

        // index
        int index = name.indexOf("o");
        System.out.println(index);

        // last index
        int lastIndex = name.lastIndexOf("o");
        System.out.println(lastIndex);

        // uppercase
        name = name.toUpperCase();
        System.out.println(name);

        // lowerCase
        name = name.toLowerCase();
        System.out.println(name);

        // trim
        name = name.trim();
        System.out.println(name);

        // replace
        name = name.replace("o", "e");
        System.out.println(name);

        // is empty
        System.out.println(name.isEmpty());

        // check
        System.out.println(name.contains("D"));

        // check if strings are equal
        System.out.println(name.equals("john doe"));

        // check if string are equal ignoring the case
        System.out.println(name.equalsIgnoreCase("bob"));
    }
}