
public class Main {

    public static void main(String[] args) {

        // inheritance = one class inherits the attributes and methods from another class
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        dog.speak();
        cat.eat();
        cat.speak();

    }

}