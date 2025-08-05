public class Fish extends Animal {

    // best practice to add annotation for overriding methods
    @Override
    void move() {
        System.out.println("This animal is swimming");
    }
}
