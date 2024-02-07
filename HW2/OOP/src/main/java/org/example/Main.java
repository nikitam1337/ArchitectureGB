package org.example;

import org.example.generators.GenElectricCar;
import org.example.generators.GenPetrolCar;
import org.example.interfaces.ICar;
import org.example.interfaces.IGeneratorCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<IGeneratorCar> fabricList = new ArrayList<>();
        fabricList.add(new GenElectricCar());
        fabricList.add(new GenPetrolCar());
        createCar(fabricList);
    }


    static void createCar(List<IGeneratorCar> fabricList){
        Random rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 20; i++) {
            ICar fabricCar = fabricList.get(Math.abs(rnd.nextInt()%fabricList.size())).createCar();
            fabricCar.engineType();

        }
    }



}