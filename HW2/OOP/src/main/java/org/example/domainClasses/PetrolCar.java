package org.example.domainClasses;

import org.example.interfaces.ICar;

public class PetrolCar implements ICar {
    @Override
    public void engineType() {
        System.out.println("Выпустили бензиновый автомобиль");
    }
}
