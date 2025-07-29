
public class Main {

    public static void main(String[] args) {

        // static = makes a variable or method belong to the class rather than to any specific object.
        // commonly used for utility methods or shared resources

        // accessing static var via instance reference
        Friend friend1 = new Friend("John");
        System.out.println(friend1.numOfFriends);

        Friend friend2 = new Friend("Bob");
        System.out.println(friend2.numOfFriends);

        Friend friend3 = new Friend("Sara");
        System.out.println(friend3.numOfFriends);

        // accessing static var via class
        System.out.println(Friend.numOfFriends);

        // calling static method
        Friend.showFriends();
    }

}