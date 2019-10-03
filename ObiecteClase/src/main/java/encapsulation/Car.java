package main.java.encapsulation;

public class Car extends Vehicle {
    private boolean convertible;

    public Car (int maxSpeed, boolean convertible){
        super (maxSpeed);
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    Car myCar = new Car(130, false);
    Vehicle myVehicle = new Car(210, true);

}
