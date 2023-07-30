package com.zipcodewilmington.froilansfarm.HousingForAnimals;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StablesTest {

    @Test
    public void horseStableAddTest() {
        Stables stable = new Stables();
        Horse horse = new Horse();

        stable.add(horse);

        Assert.assertEquals(1, stable.size());
    }
}