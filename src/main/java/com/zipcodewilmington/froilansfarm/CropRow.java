package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Food.*;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;

public class CropRow <CropType extends Crop>extends ArrayList<CropType> {

    public CropRow() {
        super();
    }


}
