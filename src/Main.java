
public class Main {

    public static void main(String[] args) {

        // Object = an entity that holds data (attributes)
        // and can perform actions (methods)

        Car car = new Car();
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        // modify attributes
        car.isRunning = true;
        System.out.println(car.isRunning);

        // using methods
        System.out.println(car.isRunning);
        car.start();

        System.out.println(car.isRunning);
        car.stop();

        car.drive();
        car.brake();
    }

}