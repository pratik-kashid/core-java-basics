package Methods;

public class varargs {
    // Method that accepts variable number of String arguments using varargs
    public static void Names(String... n) {
        // Iterate through the array and print each name
        for(String i : n) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        // Calling names methods
        Names("Pratik", "Rahul");
        Names("Pratik", "Rahul", "Mahesh");
    }
}
