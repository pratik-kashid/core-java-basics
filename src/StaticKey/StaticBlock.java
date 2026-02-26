package StaticKey;

class Mobile {
    String brand;
    int price;

    //static variable
    static String name;

    //default constructor
    public Mobile() {
        brand = "";
        price = 250;
        System.out.println("in constructor.");
    }

    //static block
    static {
        name = "phone";
        System.out.println("in static block.");
    }

    //method to show something
    public void show() {
        System.out.println(brand+" "+price+" "+name);
    }
}

public class StaticBlock {
    public static void main(String[] args) {

        //create object
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 300;
        Mobile.name = "Smartphone";

        obj.show();
    }
}
