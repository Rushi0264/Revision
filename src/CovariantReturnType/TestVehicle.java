package CovariantReturnType;

class Vehicle{
    Vehicle getVehicle(){
        System.out.println("Vehicle is stoped..");
        return this;
    }
}

class Car extends Vehicle{
    @Override
    Car getVehicle(){
        System.out.println("Car is starts...");
        return this;
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.getVehicle();
    }
}
