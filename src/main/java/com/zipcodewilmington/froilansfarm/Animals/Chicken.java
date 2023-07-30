package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal<Corn> implements Produce<Egg> {


    @Override
    public boolean eat(Corn edible) {
        isFull = true;
        return edible != null;
    }

    @Override
    public String makeNoise() {
        return "Cluck Cluck";
    }

    @Override
    public Egg yield() {
        return new Egg();
    }
}
