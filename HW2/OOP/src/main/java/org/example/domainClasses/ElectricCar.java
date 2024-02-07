package org.example.domainClasses;

import org.example.interfaces.ICar;

public class ElectricCar implements ICar {
    @Override
    public void engineType() {
        System.out.println("Выпустили электро-автомобиль");
    }
}
