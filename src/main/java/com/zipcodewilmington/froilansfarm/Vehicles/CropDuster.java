package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class CropDuster implements Aircraft, FarmVehicle<Pilot> {

    public boolean fly(Rider rider) {
        return rider(rider);
    }

    public boolean operate(Farm farm) {
        return true;
    }

    @Override
    public boolean rider(Rider rider) {
        return rider instanceof Pilot;
    }

    public boolean fertilize(CropRow cropRow) {
        return true;
    }

//    @Override
    public String makeNoise() {
        return "roar roar roar";
    }
}
