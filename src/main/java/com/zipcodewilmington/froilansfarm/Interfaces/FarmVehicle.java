package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Farm;

public interface FarmVehicle <RiderType extends Rider> extends Vehicle<RiderType> {

    boolean operate(Farm farm);


}
