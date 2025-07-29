
public class Main {

    public static void main(String[] args) {

        // super = refers to the parent class (subclass <- superclass)
        // used in constructors and method overriding
        // calls the parent constructor to initialize attributes

        Person person = new Person("John", "Doe");
        person.showName();

        Student student = new Student("Harry", "Potter", 3.5);
        student.showName();
        student.showGPA();

        Employee employee = new Employee("Rubeus", "Hagrid", 50000);
        employee.showName();
        employee.showSalary();

    }

}