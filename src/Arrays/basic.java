package Arrays;

public class basic {
    static void main(String[] args) {

        // Primitive array
        int[] arr = {19, 20, 30, 40};
        int n = arr.length;

        System.out.print("Primitive Array -> ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Non-Primitive array (String objects)
        String[] names = {"Pratik", "Rahul", "Pankaj"};

        System.out.print("Non-primitive array -> ");
        for(int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }
}
