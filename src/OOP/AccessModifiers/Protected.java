package OOP.AccessModifiers;

class vehicle {
    protected int speed;
}

class bike extends vehicle {

    void setspeed(int s) {
        speed = s;
    }

    int getspeed() {
        return speed;
    }
}
public class Protected {
    static void main() {
        bike b = new bike();
        b.setspeed(100);

        System.out.println("Access vis subclass: "+b.getspeed());

        vehicle v = new vehicle();
        System.out.println(v.speed);

    }
}
