package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Housing;
import com.zipcodewilmington.froilansfarm.HousingForAnimals.Stables;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.List;

public abstract class Person extends Animal<Edible>{

    public Person(String name){this.name = name;}

    public boolean feedAnimals(Housing<? extends Animal> house, Edible edible){
        for(Animal a: house){
            if(a.eat(edible) == false){

                return false;
            }
            a.isFull = true;
        }
        return true;
    }

    abstract boolean rideHorses(Stables stable);
}
