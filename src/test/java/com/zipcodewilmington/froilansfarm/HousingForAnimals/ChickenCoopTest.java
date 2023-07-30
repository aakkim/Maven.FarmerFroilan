package com.zipcodewilmington.froilansfarm.HousingForAnimals;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChickenCoopTest {

    @Test
    public void chickenCoopAddTest() {
        ChickenCoop cc = new ChickenCoop();
        Chicken chicken = new Chicken();

        cc.add(chicken);

        Assert.assertEquals(1, cc.size());
    }
}