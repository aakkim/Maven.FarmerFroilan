package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Food.Crop;
import com.zipcodewilmington.froilansfarm.HousingForAnimals.Stables;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

public class Farmer extends Person implements Rider<Tractor>, Botanist<Crop> {

    public Farmer(){
        super("Farmer");
    }
    public Farmer(String name){
        super(name);
    }

    @Override
    public boolean rideHorses(Stables stable) {
        for(Horse h: stable){
            if(h.ride(this)){
                this.mount(h);
            }
            else{
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean eat(Edible edible) {
        isFull = true;
        return edible != null;
    }

    @Override
    public String makeNoise() {
        return "Hi, I'm " + name;
    }

    @Override
    public boolean mount(Rideable ride) {
        return ride!=null;
    }

    @Override
    public boolean dismount(Rideable ride) {
        return false;
    }

    @Override
    public boolean plant(Crop crop, CropRow cr) {
        return cr.add(crop);
    }
}
