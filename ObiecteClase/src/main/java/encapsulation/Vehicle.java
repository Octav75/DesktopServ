package main.java.encapsulation;

public class Vehicle {
    private int maxSpeed;
    public Vehicle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String toString(){
        return "Fields values: maxSpeed=" + maxSpeed;
    }

    Vehicle vehicle = new Vehicle(85);
    System.out.println (vehicle);
}
