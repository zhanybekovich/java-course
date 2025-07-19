import java.util.Scanner;

public class Main {

    // class variable
    static int y = 3;

    public static void main(String[] args) {

        // variable scope = where a variable can be accessed

        // local scope
        int x = 1;
        System.out.println(x);

        doSomething();

        // can access class variable
        System.out.println(y);
        doSomething2();
    }

    static void doSomething() {
        // local
        int x = 2;

        System.out.println(x);
    }

    static void doSomething2() {
        System.out.println(y);
    }

}