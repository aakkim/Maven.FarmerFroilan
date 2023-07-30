package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Food.Crop;

public interface Botanist <CropType extends Crop>{

    boolean plant(CropType crop, CropRow cr);
}
