//author @Sayantan
//version 1.0

public class HelloApp {

    public static void main(String[] args) {

        String greetingNames;

        // Check if any command-line arguments were provided
        if (args.length > 0) {
            // Join all names with comma and space
            greetingNames = String.join(", ", args);
        } else {
            // Default name if no arguments
            greetingNames = "World";
        }

        // Print greeting
        System.out.println("Hello, " + greetingNames + "!");
    }
}
