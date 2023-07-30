package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Rideable <RiderType extends Rider>{

    boolean ride(RiderType rider);
}
