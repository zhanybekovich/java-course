import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Generating random values

        Random random = new Random();

        // random integer
        int number;
        number = random.nextInt();

        // range from 1 to 6
        int myRandom = random.nextInt(1, 7);

        // random double (0 --- 1)
        double myDouble = random.nextDouble();

        // random boolean
        boolean myBoolean = random.nextBoolean();

        System.out.println(myBoolean);
    }
}