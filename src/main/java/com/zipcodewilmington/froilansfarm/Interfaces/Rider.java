package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Rider <VehicleType extends Vehicle>{

    boolean mount(Rideable ride);
    boolean dismount(Rideable ride);
}
