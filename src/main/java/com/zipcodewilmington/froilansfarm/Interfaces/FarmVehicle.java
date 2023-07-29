package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Farm;

public interface FarmVehicle <RiderType extends Rider> {

    boolean operate(Farm farm);

    boolean rider(Rider rider);

}
