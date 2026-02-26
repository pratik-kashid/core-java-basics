package AccessModifiers;

class Vehicle {
    // protected member
    protected int speed;
}

class Bike extends Vehicle {
    void setSpeed(int s)
    {
        // accessible in subclass
        speed = s;
    }

    int getSpeed()
    {
        // accessible in subclass
        return speed;
    }

    public void show() {
        System.out.println("Access via subclass method: " + getSpeed());
    }
}

public class ProtectedAc {
    public static void main(String[] args){

        Bike b = new Bike();
        b.setSpeed(100);
        b.show();

        Vehicle v = new Vehicle();
        System.out.println(v.speed);
    }
}
