package org.example.OCP;

public class Vehicle {
    public int maxSpeed;

    public String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public double calculateAllowedSpeed(){
        return maxSpeed;
    }

}
