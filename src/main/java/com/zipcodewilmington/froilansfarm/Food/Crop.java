package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public abstract class Crop <EdibleThing extends Edible> implements Produce<EdibleThing> {
    boolean isFertilized = false;
    boolean isHarvested = false;
    public boolean hasBeenFertilized() {
        return isFertilized;
    };
    public boolean hasBeenHarvested() {
        return isHarvested;
    }
}
