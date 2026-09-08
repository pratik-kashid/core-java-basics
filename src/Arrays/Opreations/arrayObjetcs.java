package Arrays.Opreations;

class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}
public class arrayObjetcs {
    static void main(String[] args) {

        // Declaring array
        Student[] arr;

        // allocating memory 5 object
        arr = new Student[5];

        // Initialize the elements of the array
        arr[0] = new Student(1, "aman");
        arr[1] = new Student(2, "Rahul");
        arr[2] = new Student(3, "Amit");
        arr[3] = new Student(4, "Mahesh");
        arr[4] = new Student(5, "Mohit");

        // Accessing the elements of the array
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + " : { " + arr[i].roll_no + " " + arr[i].name + " }");
        }

    }
}
