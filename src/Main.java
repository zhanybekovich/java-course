import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 2, 3, 4));

        String pizza = bakePizza("flat bread");
        System.out.println(pizza);

        String mozzarellaPizza = bakePizza("flat bread", "mozzarella");
        System.out.println(mozzarellaPizza);

        String mozzarellaWithPepperoni = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(mozzarellaWithPepperoni);
    }

    // overloaded methods = methods that share the same name, but different parameters
    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }

}