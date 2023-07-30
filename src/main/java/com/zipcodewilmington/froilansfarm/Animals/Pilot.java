package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.HousingForAnimals.Stables;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;

public class Pilot extends Person implements Rider<CropDuster> {

    public Pilot(String name) {
        super(name);
    }
    public Pilot(){
        super("Pilot");
    }

    @Override
    boolean rideHorses(Stables stable) {
        for(Horse h: stable){
            if(h.ride(this)){
                this.mount(h);
            }
        }
        return true;
    }

    @Override
    public boolean eat(Edible edible) {
        isFull = true;
        return edible!=null;
    }

    @Override
    public String makeNoise() {
        return "Hi, I'm "+ name;
    }

    @Override
    public boolean mount(Rideable ride) {
        return ride!=null;
    }

    @Override
    public boolean dismount(Rideable ride) {
        return ride!=null;
    }
}
