package Constructors;

public class OverloadingC {

    OverloadingC(String name) {
        System.out.println("Your name: "+name);
    }

    OverloadingC(String id, String mo) {
        System.out.println("Your name: "+id);
        System.out.println("Mobile number: "+mo);
    }

    static void main() {
        OverloadingC o = new OverloadingC("Pratik");
        OverloadingC o2 = new OverloadingC("pk62637", "834718972");
    }
}
