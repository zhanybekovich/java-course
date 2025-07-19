import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // search element in the array

        int[] numbers = {1, 3, 5, 2, 9, 24};
        int target = 20;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found in the array");
        }

        String[] fruits = {"apple", "orange", "banana", "kiwi"};
        String targetFruit = "kiwi";

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(targetFruit)) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found in the array");
        }

        sc.close();
    }


}