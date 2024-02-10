package org.example.OCP;

public class MainOCP {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(300,"Train");
        printVehivleMaxSpeed(vehicle);
        vehicle = new Car(200);
        printVehivleMaxSpeed(vehicle);
        vehicle = new Bus(100);
        printVehivleMaxSpeed(vehicle);

    }

    public static void printVehivleMaxSpeed(Vehicle vehicle){
        System.out.println(vehicle.type + "max_speed -> " + vehicle.calculateAllowedSpeed());
    }

}
