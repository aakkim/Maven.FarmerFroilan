package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Food.CornStalk;
import com.zipcodewilmington.froilansfarm.Food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.HousingForAnimals.ChickenCoop;
import com.zipcodewilmington.froilansfarm.HousingForAnimals.FarmHouse;
import com.zipcodewilmington.froilansfarm.HousingForAnimals.Stables;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.util.ArrayList;

public class Farm {
    ArrayList<Stables> stables = new ArrayList<>();
    ArrayList<ChickenCoop> chickenCoops= new ArrayList<>();
    Field field = new Field();
    FarmHouse farmHouse = new FarmHouse();
    Aircraft aircraft;
    ArrayList<FarmVehicle> farmVehicles= new ArrayList<>();

    public void setup(){
        farmHouse.add(new Farmer("Froiland"));
        field.addAll(buildField());
        aircraft = new CropDuster();
        for(int i = 4; i < 7; i++){
            chickenCoops.add(buildchickenCoop(i));
        }
        stables.add(buildStables(3));
        stables.add(buildStables(4));
        stables.add(buildStables(3));
        farmVehicles.add(new Tractor());
        farmVehicles.add(new Tractor());
        farmHouse.add( new Pilot("Froilanda"));

    }

    private Field buildField(){
        Field hold = new Field();
        for(int i = 1; i <=5; i++ ){
            if (i%2 ==0){
                hold.add(buildTomatoPlant());
            }
            else{
                hold.add(buildCornRow());
            }
        }
        return hold;

    }
    private CropRow<CornStalk> buildCornRow(){
        CropRow<CornStalk> cs = new CropRow<>();
        for(int i = 0; i < 5; i++){
            cs.add(new CornStalk());
        }
        return cs;
    }
    private CropRow<TomatoPlant> buildTomatoPlant(){
        CropRow<TomatoPlant> tp = new CropRow<>();
        for(int i = 0; i < 5; i++){
            tp.add(new TomatoPlant());
        }
        return tp;
    }

    private ChickenCoop buildchickenCoop(int numOfChick){
        ChickenCoop cc = new ChickenCoop();
        for(int i = 0; i < numOfChick; i++){
            cc.add(new Chicken());
        }
        return cc;
    }
    private Stables buildStables(int numOfHorse){
        Stables s = new Stables();
        for(int i = 0; i < numOfHorse; i++){
            s.add(new Horse());
        }
        return s;
    }
}
