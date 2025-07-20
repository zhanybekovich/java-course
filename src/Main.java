
public class Main {


    public static void main(String[] args) {

        // 2D array = an array where each element is an array

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {fruits, vegetables, meats};

        // change
        groceries[0][0] = "pineapple";
        groceries[1][0] = "celery";
        groceries[2][0] = "eggs";

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }

            System.out.println();
        }

        // more example
        char[][] telephone = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        for (char[] row : telephone) {
            for (char number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}