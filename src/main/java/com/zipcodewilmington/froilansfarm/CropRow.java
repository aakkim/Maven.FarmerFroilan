package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Food.*;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;

public class CropRow <CropType extends Crop>extends ArrayList<CropType> {
    ArrayList<CropType> crops;

    public CropRow() {
        crops = new ArrayList();
    }

    public boolean fertilize(CropType crop) {
        return crop instanceof CornStalk || crop instanceof TomatoPlant;
    }
}
