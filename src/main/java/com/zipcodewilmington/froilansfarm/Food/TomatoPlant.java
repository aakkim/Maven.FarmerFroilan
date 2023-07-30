package com.zipcodewilmington.froilansfarm.Food;

public class TomatoPlant extends Crop<Tomato>{

    @Override
    public Tomato yield() {
        return new Tomato();
    }

    @Override
    boolean hasBeenFertilized() {
        return false;
    }

    @Override
    boolean hasBeenHarvested() {
        return false;
    }
}
