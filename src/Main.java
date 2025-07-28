
public class Main {

    public static void main(String[] args) {

        // constructor = a special method to initialize objects
        // you can pass arguments to a constructor and set up initial values

        Student student1 = new Student("Spongebob", 30, 3.2);
        Student student2 = new Student("Merry", 18, 5.3);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println("************");

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        // calling method
        student1.study();
        student2.study();
    }

}