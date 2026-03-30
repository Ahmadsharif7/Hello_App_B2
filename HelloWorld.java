public class HelloWorld {
    public static void main(String[] args) {

        // No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            // Join all names with ", "
            String names = String.join(", ", args);

            // Print final greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}