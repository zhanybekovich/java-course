

public class Main {

    public static void main(String[] args) {

        // Getters and setters help protect object data and add rules for accessing or modifying them.
        // Getters = methods that make a field Readable
        // Setter = methods that make a field writable

        Car car = new Car("Charger", "Yellow", 10000);

        // call getters
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

        // call setters
        car.setColor("Blue");
        car.setPrice(12000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }

}