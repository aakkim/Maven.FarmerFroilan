package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public abstract class Crop <EdibleThing extends Edible> implements Produce<EdibleThing> {
    abstract boolean hasBeenFertilized();
    abstract boolean hasBeenHarvested();
}
