package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HorseTest {
    @Test
    public void testInheritence(){
        Horse horse = new Horse();

        assertTrue(horse instanceof NoiseMaker);
    }
    @Test
    public void testInheritence2(){
        Horse horse = new Horse();


        assertTrue(horse instanceof Eater);
    }
    @Test
    public void testInheritence3(){
        Horse horse = new Horse();


        assertTrue(horse instanceof Rideable);
    }

    @Test
    public void testNoise(){
        Horse horse = new Horse();

        String expected = "Neigh Neigh";
        String actual = horse.makeNoise();

        assertEquals(expected, actual);
    }



//    @Test
//    public void eatSomething(){
//        Horse horse = new Horse();
//
//        Tomato tomato = new Tomato();
//
//        assertFalse(horse.eat(tomato));
//    }
    @Test
    public void eatSomething2(){
        Horse horse = new Horse();

        Corn corn  = new Corn();

        assertTrue(horse.eat(corn));
    }
    @Test
    public void eatSomething3(){
        Horse horse = new Horse();

        Corn corn  = new Corn();
        horse.eat(corn);
        assertTrue(horse.isFull);
    }
    @Test
    public void rideHorse(){
        Horse horse = new Horse();
        Farmer farmer = new Farmer();

        assertTrue(horse.ride(farmer));


    }
    @Test
    public void rideHorse2(){
        Horse horse = new Horse();
        Pilot pilot = new Pilot();

        assertTrue(horse.ride(pilot));

    }
    @Test
    public void rideHorse3(){
        Horse horse = new Horse();
        Farmer farmer = new Farmer();

        horse.ride(farmer);

        assertEquals(farmer, horse.personRiding);


    }

}