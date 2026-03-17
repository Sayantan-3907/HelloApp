//author @Sayantan
//version 1.0
public class HelloApp {
    public static void main(String[] args) {

        // Assign name from argument or default value
        String name = (args.length > 0) ? args[0] : "World";

        // Display greeting
        System.out.println("Hello, " + name + "!");
    }
}