package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Animal;

import java.util.ArrayList;

public abstract class Housing <AnimalType extends Animal> extends ArrayList<AnimalType> {

    public Housing() {
        super();
    }
}
