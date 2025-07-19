import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array = a collection of values of the same data type

        String[] fruits = {"apple", "orange", "banana", "kiwi"};
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);

        // changing value at specified index
        fruits[0] = "pineapple";
        System.out.println(fruits[0]);

        // length property of an array
        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);

        // looping through an array
        for (int i = 0; i < numOfFruits; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println("=======");

        // enhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("=========");

        // sort
        Arrays.sort(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("========");

        // fill
        Arrays.fill(fruits, "****");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        sc.close();
    }


}