@author Sayantan
@version 1.0

public class HelloApp {
    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Arguments provided
        StringBuilder nameBuilder = new StringBuilder();

        // Append all names with delimiter
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", "
        String names = nameBuilder.substring(0, nameBuilder.length() - 2);

        // Print result
        System.out.println("Hello, " + names + "!");
    }
}