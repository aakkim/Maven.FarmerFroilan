package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class CornStalk extends Crop<Corn>{

    @Override
    public Corn yield() {
        return new Corn();
    }

}
