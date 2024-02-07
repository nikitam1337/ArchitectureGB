package org.example.generators;

import org.example.domainClasses.PetrolCar;
import org.example.interfaces.ICar;
import org.example.interfaces.IGeneratorCar;

public class GenPetrolCar implements IGeneratorCar {
    @Override
    public ICar createCar() {
        return new PetrolCar();
    }
}
