
public class Main {

    public static void main(String[] args) {

        // Method overriding = when a subclass provides its own
        // implementation of a method that is already defined

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }

}