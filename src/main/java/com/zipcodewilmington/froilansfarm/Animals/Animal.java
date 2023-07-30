package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public abstract class Animal <EdibleThing extends Edible> implements NoiseMaker, Eater<EdibleThing> {
    String name;
    boolean isFull = false;

    public Animal(){};
    public Animal(String name){ this.name = name;}


}
