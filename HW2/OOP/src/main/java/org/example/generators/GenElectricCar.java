package org.example.generators;

import org.example.domainClasses.ElectricCar;
import org.example.interfaces.ICar;
import org.example.interfaces.IGeneratorCar;

public class GenElectricCar implements IGeneratorCar {
    @Override
    public ICar createCar() {
        return new ElectricCar();
    }
}
