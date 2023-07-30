package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Horse extends Animal<Corn> implements Rideable<Rider> {
    Rider personRiding = null;
    boolean isRidden = false;

    @Override
    public boolean eat(Corn edible) {
        isFull = true;
        return edible!=null;
    }

    @Override
    public String makeNoise() {
        return "Neigh Neigh";
    }

    @Override
    public boolean ride(Rider rider) {
        personRiding = rider;
        isRidden = true;
        return rider!=null;
    }
}
