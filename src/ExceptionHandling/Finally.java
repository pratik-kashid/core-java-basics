package ExceptionHandling;

public class Finally {
    static void main() {

        int[] numbers = {1, 2, 3};

        try {
            //this will throw ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception catch: "+e.getMessage());
        }
        finally {
            System.out.println("This block always Execute..");
        }

        System.out.println("Program Continue..");
    }
}
