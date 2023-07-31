package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Food.CornStalk;
import com.zipcodewilmington.froilansfarm.Food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.HousingForAnimals.ChickenCoop;
import com.zipcodewilmington.froilansfarm.HousingForAnimals.Stables;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmTest {

    @Test
    void setup() {
        Farm farm = new Farm();
        farm.setup();
        Assert.assertEquals(5, farm.field.size());
        Assert.assertEquals(4, farm.chickenCoops.size());
        Assert.assertEquals(3, farm.stables.size());
        Assert.assertEquals(2, farm.farmVehicles.size());
        Assert.assertEquals(2, farm.farmHouse.size());
    }

    @Test
    void buildField() {
        Farm farm = new Farm();
        Field field = farm.buildField();
        Assert.assertEquals(5, field.size());

    }
    @Test
    void buildField2() {
        Farm farm = new Farm();
        Field field = farm.buildField();
        Assert.assertTrue(field.get(0).get(0) instanceof CornStalk);

    }
    @Test
    void buildField3() {
        Farm farm = new Farm();
        Field field = farm.buildField();
        Assert.assertTrue(field.get(1).get(0) instanceof TomatoPlant);

    }

    @Test
    void buildCornRow() {
        Farm farm = new Farm();
        CropRow<CornStalk> cs = farm.buildCornRow();

        assertEquals(5, cs.size());
    }

    @Test
    void buildTomatoPlant() {
        Farm farm = new Farm();
        CropRow<TomatoPlant> tp = farm.buildTomatoPlant();

        assertEquals(5, tp.size());
    }

    @Test
    void buildchickenCoop() {
        Farm farm = new Farm();
        ChickenCoop cc = farm.buildchickenCoop(22);

        assertEquals(22, cc.size());

    }

    @Test
    void buildStables() {
        Farm farm = new Farm();
        Stables s = farm.buildStables(12);

        assertEquals(12, s.size());
    }
}