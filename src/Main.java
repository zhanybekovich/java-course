
public class Main {

    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class.
        // Used to return a string represent of an object.
        // Be default, it returns a hash code as a unique identifier.
        // It can be overridden to provide meaningful details

        Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        System.out.println(car1);

        Car car2 = new Car("Chevrolet", "Corvette", 2025, "Blue");
        System.out.println(car2);


    }

}