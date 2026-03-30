public class HelloWorld {
    public static void main(String[] args) {

        // No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            String result = "";

            // Enhanced for loop
            for (String name : args) {
                result += name + ", ";
            }

            // Remove last ", "
            result = result.substring(0, result.length() - 2);

            // Final output
            System.out.println("Hello, " + result + "!");
        }
    }
}