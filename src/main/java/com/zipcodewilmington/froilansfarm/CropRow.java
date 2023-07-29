package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Food.Crop;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;

public class CropRow <CropType extends Crop>extends ArrayList<CropType> {
    ArrayList<CropType> crops;

    public CropRow() {
        crops = new ArrayList();
    }

    public boolean fertilize(Edible edible) {
        return edible instanceof Corn || edible instanceof Tomato;
    }
}
