package com.zipcodewilmington.froilansfarm.Food;

public class TomatoPlant extends Crop<Tomato>{

    @Override
    public Tomato yield() {
        return new Tomato();
    }

}
