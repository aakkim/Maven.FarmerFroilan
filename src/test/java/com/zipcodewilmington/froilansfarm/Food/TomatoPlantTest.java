package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TomatoPlantTest {

    @Test
    void testTomatoInheritance(){

        Tomato tomato = new Tomato();

        assertTrue(tomato instanceof Edible);
    }

    @Test
    void testTomatoYield(){

        TomatoPlant plant = new TomatoPlant();

        assertTrue(plant.yield() instanceof Tomato);
    }

}