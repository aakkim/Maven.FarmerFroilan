package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class CropDuster implements Aircraft, FarmVehicle<Pilot> {

    public boolean fly() {
        return true;
    }

    public boolean operate(Farm farm) {
        return true;
    }

    public boolean fertilize(CropRow cropRow) {
        return true;
    }

//    @Override
    public String makeNoise() {
        return "roar roar roar";
    }
}
